package com.techelevator.dao;

import com.techelevator.model.Puppy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilePuppyDao implements PuppyDao{
    private File file;
    private Scanner input;
    private int lastId;

    public FilePuppyDao(String fileName){

        createNewScanner();
        List<Puppy> puppyList = new ArrayList<>();
        while(input.hasNext()){
            String puppyLine = input.nextLine();
            String [] thePuppyInfo = puppyLine.split(",");
            Puppy puppy = new Puppy(Integer.parseInt(thePuppyInfo[0]), thePuppyInfo[1], Integer.parseInt(thePuppyInfo[2]),
                    thePuppyInfo[3], thePuppyInfo[4],Boolean.parseBoolean(thePuppyInfo[5]));
            puppyList.add(puppy);
        }
        lastId = puppyList.get(puppyList.size() -1).getPuppyId();

    }

    @Override
    public List<Puppy> getAllPuppies() {
        List<Puppy> puppyList = new ArrayList<>();
        createNewScanner();
        while(input.hasNext()){
            String puppyLine = input.nextLine();
            String [] thePuppyInfo = puppyLine.split(",");
            Puppy puppy = new Puppy(Integer.parseInt(thePuppyInfo[0]), thePuppyInfo[1], Integer.parseInt(thePuppyInfo[2]),
                    thePuppyInfo[3], thePuppyInfo[4],Boolean.parseBoolean(thePuppyInfo[5]));
            puppyList.add(puppy);
        }

        lastId = puppyList.get(puppyList.size() -1).getPuppyId();
        return puppyList;
    }

    @Override
    public Puppy getPuppyById(int puppyId) {
        //1. Open and start reading the file
        try {
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while(input.hasNext()){
            String puppyline = input.nextLine();
            //2. Find the puppy that matches puppy_id
            String[] thePuppyInfo = puppyline.split(",");
            if(Integer.parseInt(thePuppyInfo[0]) == puppyId){
                //3. Return the puppy
                return new Puppy(Integer.parseInt(thePuppyInfo[0]), thePuppyInfo[1], Integer.parseInt(thePuppyInfo[2]),
                        thePuppyInfo[3], thePuppyInfo[4],Boolean.parseBoolean(thePuppyInfo[5]));
            }
        }


        return null;
    }

    @Override
    public Puppy savePuppy(Puppy puppy) {
        //Open the file
        createNewScanner();
        //get the id of the last puppy
        int newId = lastId + 1;
        //Add + 1 to create an id for the new puppy
        puppy.setPuppyId(newId);
        //write the puppy to the file
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            PrintWriter pw = new PrintWriter(file);

            pw.println(puppy.getPuppyId() + "," + puppy.getPuppyName() + "," + puppy.getGender() + "," +puppy.getWeight() + "," + puppy.getBreed() + "," + puppy.isPaperTrained());
            pw.flush();
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //return the puppy
        return puppy;
    }

    @Override
    public Puppy updatePuppy(Puppy puppy) {
        return null;
    }

    @Override
    public void removePuppy(int puppyId) {

    }

    private void createNewScanner(){
        try{
            input = new Scanner(file);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
