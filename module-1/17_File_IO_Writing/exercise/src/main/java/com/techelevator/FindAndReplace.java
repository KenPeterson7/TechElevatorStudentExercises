package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {
            //instantiated new scanner object & assigned it to the input var
            Scanner input = new Scanner(System.in);
            //printed out the following questions and stored the user response in String variables
            System.out.println("Please enter the search word: ");
            String word = input.nextLine();
            System.out.println("Please enter a new word to replace the search word with: ");
            String replaceWord = input.nextLine();
            System.out.println("Please enter the source file path (must be an existing file): ");
            String source = input.nextLine();
            System.out.println("Please enter the destination file path: ");
            String destination = input.nextLine();
            //had to close the scanner since it's outside the try-catch & input streams must be closed.
            input.close();
        //instantiated new file objects and pass the user entered file paths
        //these don't have to be instantiated in the try block because they just hold file paths, only streams (I/O) need to be closed
        File sourceFile = new File(source);
        File destinationFile = new File(destination);
        //these objects were instantiated in the try block because they are input/output streams that have to be closed when they are finished!!
        //instantiated scanner object to open/read the source file, & PrintWriter object and passed the destination file path to write output into that file
        try(Scanner readSourceFile = new Scanner(sourceFile);
            PrintWriter ghostWriter = new PrintWriter(destinationFile)) {
            //while the readSourceFile (scanner) has another line to return... do this...
            while(readSourceFile.hasNextLine()){
                //assign the returned line to someText String variable
                String someText = readSourceFile.nextLine();
                //prints the returned lines to the user entered destination file, replaces all the words in word w/ the user entered replace word
                ghostWriter.println(someText.replaceAll(word, replaceWord));
            }
            //catch statement to catch a FileNotFoundException in case the source file the user entered doesn't exist
        } catch(FileNotFoundException e){
            //print out the returned generic message from FileNotFoundException
            System.out.println(e.getMessage());
        }
    }
}
