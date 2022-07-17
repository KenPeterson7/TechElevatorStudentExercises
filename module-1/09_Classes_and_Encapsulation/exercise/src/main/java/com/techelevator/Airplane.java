package com.techelevator;

public class Airplane {

    //created instance variables
    private String planeNumber;
    private int totalFirstClassSeats;
    private int bookedFirstClassSeats;
    private int totalCoachSeats;
    private int bookedCoachSeats;
    private int availableFirstClassSeats; //unneeded var
    private int availableCoachSeats; //unneeded var

    //constructor
    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats){
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
    }

    //method
    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats){
        //if forFirstClass boolean is true.. do this...
        if(forFirstClass) {
            //if the totalFirstClassSeats minus the bookedFirstClassSeats is greater than totalNumberOfSeats (available)
            //(Ex. 100 - 75 = 25 > 15)
            if (totalFirstClassSeats - bookedFirstClassSeats > totalNumberOfSeats) {
                //add the totalNumberOfSeats to the bookedFirstClassSeats var
                bookedFirstClassSeats += totalNumberOfSeats;
                //return true
                return true;
                //if the totalFirstClassSeats minus the bookedFirstClassSeats is less than totalNumberOfSeats (available)
            } else {
                //just return false
                return false;
            }
        }
        //if forFirstClass is NOT true
        else{
            //if the totalCoachSeats minus the bookedCoachSeats is greater than totalNumberOfSeats (available)
            //(Ex. 100 - 75 = 25 > 15)
            if(totalCoachSeats-bookedCoachSeats>totalNumberOfSeats){
                //add the totalNumberOfSeats to the bookedCoachSeats var
                bookedCoachSeats+=totalNumberOfSeats;
                //return true
                return true;
                //if the totalCoachSeats minus the bookedCoachSeats is less than totalNumberOfSeats (available)
            } else {
                //just return false
                return false;
            }
        }
    }
    //getters
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

    public int getAvailableFirstClassSeats() {
        return totalFirstClassSeats-bookedFirstClassSeats;
    }

    public int getAvailableCoachSeats() {
        return totalCoachSeats-bookedCoachSeats;
    }
}
