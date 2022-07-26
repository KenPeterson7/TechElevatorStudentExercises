package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {


	public static void main(String[] args) {
		//created try w/ resources block to automatically close the Scanner (input stream)
		//instantiated scanner object to retrieve user input and assigned it to scan
		try (Scanner scan = new Scanner(System.in)) {
			//prompted the user to enter a file path
			System.out.print("What is the fully qualified name of the file that should be searched? ");
			//Assigned filePath String var to the user input
			String filePath = scan.nextLine();
			//prompted the user to enter a word to search for
			System.out.print("What is the search word you are seeking? ");
			//Assigned searchWord String var to the user's input
			String searchWord = scan.nextLine();
			//prompted the user to enter Y for Yes or N for No for case sensitivity
			System.out.print("Should the search be case-sensitive? (Y/N) ");
			//assigned caseSensitive String var to the user's input
			String caseSensitive = scan.nextLine();
			//Assigned isCaseSensitive boolean var to false
			boolean isCaseSensitive = false;
			//set isCaseSensitive boolean to true if the value stored in caseSensitive is y or Y (probably should be it's own method..)
			if (caseSensitive.equalsIgnoreCase("y")) {
				//assign isCaseSensitive boolean to true
				isCaseSensitive = true;
			}
			//Instantiated new File object to reference the filepath
			File newTestFile = new File(filePath);
			//Instantiated new Scanner object (within same try block) to open/read the newTestFile and store in input
			Scanner input = new Scanner(newTestFile);
			//assigned/initialized the line number to 1
			int numberOfLine = 1;
			//while the input (scanner) has another line to return... do this...
			while (input.hasNextLine()) {
				//Assigns the (current) line of the file to the inputLine var
				String inputLine = input.nextLine();
				//if the user entered "y" or "Y" for the case sensitive prompt... do this..
				if (isCaseSensitive) {
					//if the (current) inputLine contains the user entered search word (dog)
					if (inputLine.contains(searchWord)) {
						//print out the value stored in numberOfline + ") " + the value stored in inputLine
						System.out.println(numberOfLine + ") " + inputLine);
					}
					//otherwise if the user didn't enter "y" or "Y".. do this...
				} else {
					//if the (current) inputLine contains the search word "dog" (converted to lowercase).. do this..
					if (inputLine.toLowerCase().contains(searchWord.toLowerCase())) {
						//print out the value stored in numberOfLine + ") " + the inputLine
						System.out.println(numberOfLine + ") " + inputLine);
					}
				}
				//each time this loops increment the numbOfLines variable until there are no more lines to return
				numberOfLine++;
			}
		}
		//catch statement.. that catches (runtime) FileNotFound exception
		catch (FileNotFoundException e) {
			//print out the exception message retrieved from the getMessage method
			System.out.println(e.getMessage());
		}
	}
}
