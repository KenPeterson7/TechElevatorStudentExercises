package com.techelevator.dao;

import com.techelevator.model.Puppy;

import java.util.List;

public interface PuppyDao {

    //   CRUD!!!
    // get all puppies back
    List<Puppy> getAllPuppies();   //select all puppies

    // get one puppy by id
    Puppy getPuppyById(int puppyId);   //select one puppy by id

    // insert a puppy into the data source
    Puppy savePuppy(Puppy puppy);    //create

    // update puppy information
    Puppy updatePuppy(Puppy puppy);   //update

    // remove puppy from data source
    void removePuppy(int puppyId);    //delete
}
