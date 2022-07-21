package com.techelevator.farm;

public class Car implements  Vehicle{

    private boolean hasTrailer;
    public String type;

    public Car(){}

    public Car(boolean hasTrailer){
        if (hasTrailer){
            type = "Car (with trailer)";
        } else{
            type ="Car";
        }
    }

    @Override
    public double calculateToll(int distance) {
        double toll = distance * .02;
        if (hasTrailer) {
            return toll + 1;
        } else {
            return toll;
        }
    }

    public boolean isHasTrailer() {
        return hasTrailer;
    }

    public String getType() {
        return type;
    }
}
