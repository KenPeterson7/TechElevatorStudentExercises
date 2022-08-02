package com.techelevator.search;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The Search Domain is a list of files to be read and indexed by the Search Engine.
 * 
 * Folders are NOT recursively searched. 
 */
public class SearchDomain {

	private String folder;
	private List<String> files;
	
	/**
	 * Create a Search Domain of a folder
	 * 
	 * @param folder
	 * @throws SearchDomainException
	 */
	public SearchDomain(String folder) throws SearchDomainException {
		this.folder = folder;
		this.files = buildDomain();
	}
	
	public String getFolder() {
		return folder;
	}

	public List<String> getFiles() {
		return files;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (String file : files) {
			sb.append(file);
			sb.append("\n");
		}
		return sb.toString();
	}
	
	/**
	 * Folders are NOT recursively searched.
	 * 
	 * @return
	 * @throws SearchDomainException
	 */
	private List<String> buildDomain() throws SearchDomainException {
		//instantiate List of Strings to loop through the files
		List<String> files = new ArrayList<>();
		//Instantiated File object to hold the folder of files..
			File dataDirectory = new File(folder);
			//if the folder is a directory
			if(dataDirectory.isDirectory()){
				//for each file in the folder...
				for (File file : dataDirectory.listFiles()) {
					//if the file is a file...
					if(file.isFile()){
						try{
							//add the file to the the Files list of Strings
							files.add(file.getCanonicalPath());
							//exception to handle if the file is not able to be added since getCanonicalPath throws IO exception
						} catch(IOException e){
							//throw exception with this message...
							throw new SearchDomainException("Exception adding " + file.getName() + " to folder " + folder);
						}
					}
			}
				//otherwise
			} else{
				//throw an exception for an invalid directory
				throw new SearchDomainException(folder + " is not a valid directory");
			}
			//return the files added to the Files List
		return files;
	}
	
}
