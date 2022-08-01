package com.techelevator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) throws IOException {

		//instantiated new scanner
		Scanner userInput = new Scanner(System.in);

		/*
		 * The java.io.File class is a representation of file and directory path names.  It provides methods to inspect and
		 * modify file system objects.
		 *
		 * One benefit is that it compensates for differences in Windows and Unix use of '/' and '\' as directory delimiters.
		 *
		 * A new instance of File can be created from a String that contains a file system path
		 */

		//Instantiated a file object and ran some of the file methods on it. Also checked to see if it exists first.
		//create the file
		File myTestFile = new File( "myTestDirectory", "myFile2.txt");
		//String someTextForMyFile = userInput.nextLine();
		//Instantiated PaintWriter object and passed myTestFile (File object)
		FileOutputStream outputStream = new FileOutputStream(myTestFile, true);
		PrintWriter ghostWriter = new PrintWriter(outputStream);
		boolean continueWriting = true;
		String someTextForMyFile = "";

		while(continueWriting){
			System.out.println("Enter the text you want in the file: ");
			someTextForMyFile = userInput.nextLine();
			ghostWriter.print(someTextForMyFile + "\n");
			//saves the input
			ghostWriter.flush();
			//close so the file can be used by other processes

			System.out.println("Are you finished or done? ");
			if(userInput.nextLine().toLowerCase().startsWith("y"))

				continueWriting = false;
		}
		ghostWriter.close();
		//assigned someTextForMyFile to some random text
		//get some text
		//write whatever commands to the buffer

		if(myTestFile.exists()){
			System.out.println("File name: " + myTestFile.getName());
			System.out.println("Absolute: " + myTestFile.getAbsolutePath());
			System.out.println("Writeable: " + myTestFile.canWrite());
			System.out.println("Readable: " + myTestFile.canRead());
			System.out.println("File size in bytes " + myTestFile.length());
		} else {
			myTestFile.createNewFile();
			System.out.println("File name: " + myTestFile.getName());
			System.out.println("Absolute: " + myTestFile.getAbsolutePath());
		}

		//instantiated a new file object called my
		File myTestDirectory = new File("myTestDirectory");
		//if it does exist.. print out this line
		if(myTestDirectory.exists()){
			System.out.println("This directory already exists here.");
			System.out.println("File name: " + myTestDirectory.getName());
			System.out.println("Absolute: " + myTestDirectory.getAbsolutePath());
			System.out.println("Writeable: " + myTestDirectory.canWrite());
			System.out.println("Readable: " + myTestDirectory.canRead());
			System.out.println("File size in bytes " + myTestDirectory.length());
		} else{
			//if it does not exist, then we create it
			myTestDirectory.mkdir();
			System.out.println(myTestDirectory.getName() + " has been created.");
		}


	}

}
