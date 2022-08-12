package com.techelevator.dao;

import com.techelevator.model.Puppy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilePuppyDao implements PuppyDao{
    private File file;
    private Scanner input;

    public FilePuppyDao(String fileName){
        file = new File(fileName);
        try{
            input = new Scanner(file);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Puppy> getAllPuppies() {
        List<Puppy> puppyList = new ArrayList<>();
        while(input.hasNext()){
            String puppyLine = input.nextLine();
            String [] thePuppyInfo = puppyLine.split(",");
            Puppy puppy = new Puppy(Integer.parseInt(thePuppyInfo[0]), thePuppyInfo[1], Integer.parseInt(thePuppyInfo[2]),
                    thePuppyInfo[3], thePuppyInfo[4],Boolean.parseBoolean(thePuppyInfo[5]));
            puppyList.add(puppy);
        }
        return puppyList;
    }

    @Override
    public Puppy getPuppyById(int puppyId) {
        return null;
    }

    @Override
    public Puppy savePuppy(Puppy puppy) {
        return null;
    }

    @Override
    public Puppy updatePuppy(Puppy puppy) {
        return null;
    }

    @Override
    public void removePuppy(int puppyId) {

    }
}
