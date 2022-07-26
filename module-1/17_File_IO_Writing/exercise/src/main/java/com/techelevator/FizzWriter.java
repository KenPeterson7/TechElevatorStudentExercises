package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {
		//created try w/ resources block to automatically close the scanner (input stream)
		//instantiated scanner object and assigned it to input
		try (Scanner input = new Scanner(System.in)) {
			//prompted the user to enter a destination file path
			System.out.println("Please enter the destination file path: ");
			//Assigned the filepath to the user entered input
			String filePath = input.nextLine();
			//instantiated File object to store the file path in the testFile variable
			File testFile = new File(filePath);
			//created try w/ resoruces block to automatcally close the PrintWriter (output stream)
			//instantiated PrintWriter object and assigned it to ghostWriter
			try (PrintWriter ghostwriter = new PrintWriter(testFile)) {
				//initialized num to 1, loops until num is 301 or greater, num iterates onces each loop (loops 300 times)
				int totalLoops = 301;
				for (int num = 1; num < totalLoops; num++) {
					//if the number is divisible by 3 & 5.. print FizzBuzz to the testFile
					if (num % 3 == 0 && num % 5 == 0) {
						ghostwriter.println("FizzBuzz");
						//if the number is divisible by 5.. print Buzz to the testFile
					} else if (num % 5 == 0) {
						ghostwriter.println("Buzz");
						//if the number is divisible by 3.. print Fizz to the testFile
					} else if (num % 3 == 0) {
						ghostwriter.println("Fizz");
						//otherwise the number isn't divisible by 3 or 5, print the number to the testFile
					} else {
						ghostwriter.println(num);
					}
				}
				//catch statement needed in case the user entered file path is invalid
			} catch (FileNotFoundException e) {
				//prints out Invalid destination file message if the FileNotFound exception is caught
				System.out.println("Invalid destination file");
			}
		}
	}
}