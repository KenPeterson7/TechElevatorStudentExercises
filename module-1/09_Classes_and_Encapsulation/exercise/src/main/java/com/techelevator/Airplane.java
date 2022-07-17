package com.techelevator;

public class Airplane {

    //created instance variables
    private String planeNumber;
    private int totalFirstClassSeats;
    private int bookedFirstClassSeats;
    private int totalCoachSeats;
    private int bookedCoachSeats;
    //private int availableFirstClassSeats; //unneeded var
    //private int availableCoachSeats; //unneeded var

    //constructor
    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats){
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
    }

    //getters
    public int getAvailableFirstClassSeats() {
        return totalFirstClassSeats-bookedFirstClassSeats;
    }

    public int getAvailableCoachSeats() {
        return totalCoachSeats-bookedCoachSeats;
    }

    public String getPlaneNumber() {
        return planeNumber;
    }

    public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;
    }

    public int getBookedFirstClassSeats() {
        return bookedFirstClassSeats;
    }

    public int getTotalCoachSeats() {
        return totalCoachSeats;
    }

    public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }

    //public method which means it's accessible outside the class
    //return type is boolean
    //method name is reserveSeats
    //encapsulated 2 instance variables
    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
        //if the boolean forFirstClass is true.. then do this...
        if (forFirstClass) {
            //if the value of totalFirstClassSeats minus the value of bookedFirstClassSeats is greater than or equal to the totalNumberOfSeats.. then do this..
            if (totalFirstClassSeats - bookedFirstClassSeats >= totalNumberOfSeats) {
                //initialize bookedFirstClassSeats to equal bookFirstClassSeats + totalNumberOfSeats && return true
                bookedFirstClassSeats += totalNumberOfSeats;
                return true;
                //otherwise return false
            } else {
                return false;
            }
            //if the boolean forFirstClass is false.. then do this..
        } else {
            //if the value of totalCoachSeats minus the value of bookedCoachSeats is greater than or equal to the totalNumberOfSeats.. then do this..
            if(totalCoachSeats-bookedCoachSeats >= totalNumberOfSeats){
                //initialize bookedCoachSeats to equal bookCoachSeats + totalNumberOfSeats && return true
                bookedCoachSeats += totalNumberOfSeats;
                return true;
            }else{
                //otherwise return false
                return false;
            }
        }
    }
}
