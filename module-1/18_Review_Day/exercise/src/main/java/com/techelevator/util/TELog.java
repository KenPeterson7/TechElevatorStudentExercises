package com.techelevator.util;

import java.io.*;

public class TELog {

    //created method
    public static void log(String message) {
        //instantiated File object and assigned the log to the log file path..
        File log = new File("logs/search.log");


        try {

            //instantiated FileOutputStream to append the log
            FileOutputStream fileOutputStream = new FileOutputStream(log, true);
            //instantiated PrinterWriter object to write to the log
            PrintWriter writer = new PrintWriter(fileOutputStream);
            //appends the output to the log
            writer.append(message);
            //sends the output to the log
            writer.flush();
            //closed the streams
            writer.close();

            //catches FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println(log.getName() + " not found");

        }
    }
}
