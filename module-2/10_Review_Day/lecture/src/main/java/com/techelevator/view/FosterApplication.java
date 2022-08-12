package com.techelevator.view;

import com.techelevator.dao.FilePuppyDao;
import com.techelevator.dao.JdbcPuppyDao;
import com.techelevator.dao.PuppyDao;
import com.techelevator.model.Puppy;
import org.apache.commons.dbcp2.BasicDataSource;

import java.util.List;
import java.util.Scanner;

public class FosterApplication
{

    private PuppyDao dao;

    public FosterApplication(BasicDataSource datasource){
        dao = new JdbcPuppyDao(datasource);
    }

    public FosterApplication(){
        dao = new FilePuppyDao("puppyFile.txt");
    }

    public static void main(String[] args) {
        BasicDataSource datasource = new BasicDataSource();
        datasource.setUrl("jdbc:postgresql://localhost:5432/puppy_palace");
        datasource.setUsername("postgres");
        datasource.setPassword("postgres1");

//        FosterApplication app = new FosterApplication(datasource);
        FosterApplication app = new FosterApplication();

        app.run();
    }

    public void run(){
        List<Puppy> puppies = dao.getAllPuppies();

        for (Puppy pup: puppies){
            System.out.println(pup.getPuppyId() + " " + pup.getPuppyName());  // pup it defaults to pup.toString()
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the puppy you want to see all information on>> ");
        int id = Integer.parseInt(scanner.nextLine());

        Puppy puppy = dao.getPuppyById(id);
        if (puppy != null) {
            System.out.println(puppy);
        } else {
            System.out.println("Pupper not found!!");
        }
        Puppy newPuppy = new Puppy("Mr. Toad", 27, "male",
                "Pug", true);
         Puppy retrievedPuppy = dao.savePuppy(newPuppy);
        System.out.println(retrievedPuppy.getPuppyName() +
                " was written to the data source!");
    }
}
