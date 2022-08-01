package com.techelevator;

import com.techelevator.search.SearchDomain;
import com.techelevator.search.SearchEngine;
import com.techelevator.util.TELog;

public class Application {

	public static void main(String[] args) {
		
		try {

			// Step Two: Create TELog, and log the start of the application.
			//

			TELog.log("Search application started");
			
			// Step Four: Instantiate a Search Domain
			//
			//instantiated a new Search Domain object and passed data as the specific folder
			SearchDomain searchDomain = new SearchDomain("data");
			//called on the TELog log() method, passed in our searchDomain and converted it to a String
			//(this will be sent to the log when the application runs...
			TELog.log(searchDomain.toString());
			
			
			// Step Six: Single word search
			//

			//instantiated searchEngine object and passed in the searchDomain
			SearchEngine searchEngine = new SearchEngine(searchDomain);
			//called the indexFiles method on the instance of the searchEngine..
			searchEngine.indexFiles();

			//foreach loop to search through all the words in the searchEngine that contain squirrel
			for(String searchResult : searchEngine.search("squirrel")){
				//print out the result
				System.out.println(searchResult);
			}
			
			// Step Seven: Multiple word search
			//
			//same as above except we are searching for telephone line instead of squirrel
			System.out.println("***************************************");
			for(String searchResult : searchEngine.search("telephone line")){
				System.out.println(searchResult);
			}
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
