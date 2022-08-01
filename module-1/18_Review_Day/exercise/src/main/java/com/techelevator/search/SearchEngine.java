package com.techelevator.search;

import com.techelevator.util.TELog;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SearchEngine {

	//instance vars
	private SearchDomain sd;
	private Map<String, List<WordLocation>> indexedWords = null;

	//constructor
	public SearchEngine(SearchDomain sd) {
		this.sd = sd;
		this.indexedWords = new HashMap<>();
	}
	
	public void indexFiles() throws SearchEngineException, Exception {
		// Step Five: Index files

		//instantiated new List of Strings fileNames to retrieve the list of filenames in the SearchDomain (sd)
		List<String> fileNames = sd.getFiles();
		//for loop that loops through all the elements in the fileNames List
		for(int i = 0; i < fileNames.size(); i++){
			//Instantiated File object to store the filepath of each index (i)
			File file = new File(fileNames.get(i));
			//instantiated ScanFile object to read the contents of the file one line at a time... passed the file object to the scanner object
			try(Scanner scanFile = new Scanner(file)){
				//while the scanner has more lines to return..
				while(scanFile.hasNextLine()){
					//assign the next line that is returned to the String line variable
					String line = scanFile.nextLine();
					//pass each line to the indexWords method
					//this method takes in an index + the line
					indexWords(i, line);
				}
				//handling exceptions for the scanner
			}catch(FileNotFoundException e){
				//throw this exception message...
				throw new SearchEngineException(e.getMessage());
			}
		}
		//logged the complete index of the words after looping through the list
		TELog.log("Indexed words: \n" + indexedWordsToString());

	}
	
	public List<String> search(String searchString) {
		List<String> rankedFiles = new ArrayList<>();
		String[] searchWords = searchString.trim().toLowerCase().split(" ");
		if (searchWords.length > 0) {
			if (searchWords.length == 1) {
				// Only one word to search, find all files that contain it
				Set<String> foundFiles = new HashSet<>();
				String wordToFind = searchWords[0];
				if (indexedWords.containsKey(wordToFind)) {
					for (WordLocation wl : indexedWords.get(wordToFind)) {
						foundFiles.add(sd.getFiles().get(wl.getFileID()));
					}	
				}
				rankedFiles = new ArrayList<>(foundFiles);			
			}
			else {
				// Multiple words to search, \
				//   start by getting the distances of the first two words.
				List<WordDistance> distances = getDistances(searchWords[0], searchWords[1]);
				if (distances.size() > 0) {				
					for (int currentWordIndex = 1; currentWordIndex < searchWords.length - 1; currentWordIndex++) {
						List<WordDistance> nextDistances = getDistances(searchWords[currentWordIndex], searchWords[currentWordIndex + 1]);
						if (nextDistances.size() == 0) {
							break;
						}
						else {
							for (int k = 0; k < nextDistances.size(); k++) {
								boolean foundFileID = false;
								int lastFoundIndex = -1;
								for (int m = 0; m < distances.size(); m++) {
									if (nextDistances.get(k).getFileID() == distances.get(m).getFileID()) {
										foundFileID = true;
										lastFoundIndex = m;
									}									
								}
								if (foundFileID) {
									distances.add(lastFoundIndex + 1, nextDistances.get(k));
								}
							}
						}
					}
					// All the distances have been calculated and merged,
					//   sort them by distances. Convert to strings and let Java do the work
					int currentFileID = -1;
					String str = "";
					for (int i = 0; i < distances.size(); i++) {
						if (distances.get(i).getFileID() != currentFileID) {
							if (currentFileID != -1) {
								str += ":" + currentFileID;
								rankedFiles.add(str);
							}
							str = "" + distances.get(i).getDistance();
							currentFileID = distances.get(i).getFileID();
						}
						else {
							str += "," + distances.get(i).getDistance();
						}
					}
					if (currentFileID != -1) {
						str += ":" + currentFileID;
						rankedFiles.add(str);
					}
					Collections.sort(rankedFiles);
					for (int i = 0; i < rankedFiles.size(); i++) {
						String[] parts = rankedFiles.get(i).split(":");
						int fileID = Integer.parseInt(parts[1]);
						rankedFiles.set(i, sd.getFiles().get(fileID));
					}
				}
			}
		}
		return rankedFiles;
	}
	
	private void indexWords(int fileID, String line) {
		String[] words = line.split(" ");
		for (int location = 0; location < words.length; location++) {
			// Get the word and clean it up
			String cleanedUpWord = cleanUpWord(words[location]);
			// Make sure cleaning up the word didn't make it disappear
			if (cleanedUpWord.length() > 0) {
				WordLocation wl = new WordLocation(fileID, location);
				List<WordLocation> locations = null;
				if (indexedWords.containsKey(cleanedUpWord)) {
					// Previously found the word,
					//   add new location to the existing list of word locations
					locations = indexedWords.get(cleanedUpWord);
					locations.add(wl);
				}
				else {
					// First time word,
					//   create new list of word locations, and add location to it
					locations = new ArrayList<>();
					locations.add(wl);
					indexedWords.put(cleanedUpWord, locations);
				}
			}
		}
	}
	
	private List<WordDistance> getDistances(String word, String nextWord) {
		List<WordDistance> distances = new ArrayList<>();
		if (indexedWords.containsKey(word) && indexedWords.containsKey(nextWord)) {
			List<WordLocation> wordLocations = indexedWords.get(word);
			List<WordLocation> nextWordLocations = indexedWords.get(nextWord);
			for (WordLocation wl : wordLocations) {
				for (WordLocation nextWL : nextWordLocations) {
					int fileID = wl.getFileID();
					if (nextWL.getFileID() == fileID) {
						int distance = wl.distanceFrom(nextWL);
						if (distance > 0) {
							distances.add(new WordDistance(fileID, distance));
							break;
						}
					}
				}
			}
		}
		return distances;
	}
	
	/**
	 * Limit valid characters: only A-Z, a-z, 0-9 (implicitly trims)
	 * Lower-case, searches are case-insensitive 
	 * 
	 * @param word
	 * @return "cleaned-up" word
	 */
	private String cleanUpWord(String word) {
		StringBuilder cleanedUpWord = new StringBuilder();
		for (int k = 0; k < word.length(); k++) {
			char ch = word.charAt(k);
			if (((ch >= 'A') && (ch <= 'Z')) 
					|| ((ch >= 'a')  && (ch <= 'z'))
					|| ((ch >= '0') && (ch <= '9'))) {
				cleanedUpWord.append(ch);
			}						
		}
		return cleanedUpWord.toString().toLowerCase();
	}
	
	/**
	 * Convenience method to build an easy to log/display of the 
	 * list of indexed words.
	 * 
	 * @return
	 */
	private String indexedWordsToString() {
		StringBuilder indexedWordsString = new StringBuilder();
		for (Map.Entry<String, List<WordLocation>> entry : indexedWords.entrySet()) {
			indexedWordsString.append(entry.getKey() + ":" + entry.getValue() + "\n");
		}
		return indexedWordsString.toString();
	}
}
