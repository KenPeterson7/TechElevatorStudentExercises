package com.techelevator;

public class Elevator {

    //declared instance variables
    private int currentFloor =1;
    private int numberOfFloors;
    private boolean doorOpen;
    //numberOfLevels indicates how many floors are available to the elevator
    public Elevator(int numberOfLevels){
       this.numberOfFloors = numberOfLevels;
       //this.currentFloor = 1;
    }
    //methods
    public void openDoor(){
        doorOpen = true;
    }

    public void closeDoor(){
        doorOpen = false;
    }
    //method is public meaning it's accessible outside of the class
    //return type is void means nothing to be returned
    //method name is goUp w/ an instance int var desiredFloor
    public void goUp(int desiredFloor){
        //if the door is not open.. do this
        if(!doorOpen){
            //if the desired floor is less than or equal to the number of floors.. do this
           if(desiredFloor <= numberOfFloors){
               //if the desired floor is greater than the current floor.. do this
               if(desiredFloor > currentFloor){
                   //Assign currentFloor int var to the desired floor
                   currentFloor = desiredFloor;
               }
           }
        }
    }
    //method is public meaning it's accessible outside of the class
    //return type is void means nothing to be returned
    //method name is goDown w/ an instance int var desiredFloor
    public void goDown(int desiredFloor){
        //if the door is not open.. do this
        if(!doorOpen){
            //if the desired floor is greater than 0.. do this
            if(desiredFloor > 0){
                //if the desired floor is less than the current floor.. do this
                if(desiredFloor < currentFloor){
                    //Assign currentFloor int var to the desired floor
                    currentFloor = desiredFloor;
                }
            }
        }

    }
    //getters
    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }
}
