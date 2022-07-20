package com.techelevator;

public class Television {

    //instance variables
    private boolean isOn = false;
    private int currentChannel = 3;
    private int currentVolume = 2;

    //method
    public void turnOff(){
        if(isOn){
            isOn = false;
        }
    }

    public void turnOn(){
        if(!isOn){
            isOn = true;
            currentChannel =3;
            currentVolume = 2;
        }
    }
    //public method (accessible outside of the class)
    //return type is void meaning it returns nothing
    //changeChannel is the method name w/ an instance int var newChannel
    public void changeChannel(int newChannel){
        //if the tv is on.. do this..
        if(isOn){
            //if the channel is greater than 2 and less than 19.. then the current channel is equal to the new channel
            if(newChannel > 2 & newChannel < 19){
                currentChannel = newChannel;
            }
        }
    }
    //public method (accessible outside of the class)
    //return type is void meaning it returns nothing
    //channelUp is the method name
    public void channelUp(){
        //if the tv is turned on.. do this..
        if(isOn){
            //add +1 to the current channel
            currentChannel+= 1;
            //also if the current channel is greater than 18, then update the current channel to 3
            if(currentChannel > 18){
                currentChannel = 3;
            }
        }
    }
    //public method (accessible outside of the class)
    //return type is void meaning it returns nothing
    //channelDown is the method name
    public void channelDown(){
        //if the tv is turned on.. do this..
        if(isOn){
            //subtract 1 from the current channel
            currentChannel-= 1;
            //also if the current channel is less than 3, then update the current channel to 18
            if(currentChannel < 3){
                currentChannel = 18;
            }
        }
    }

    public void raiseVolume(){
        if(isOn){
            if(currentVolume < 10) {
                currentVolume += 1;
            }
        }
    }

    public void lowerVolume(){
        if(isOn){
            if(currentVolume > 0) {
                currentVolume -= 1;
            }
        }
    }

    public boolean isOn() {
        return isOn;
    }

    //getters
    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
