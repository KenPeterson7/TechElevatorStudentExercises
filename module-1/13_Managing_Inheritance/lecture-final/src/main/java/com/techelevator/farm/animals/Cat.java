package com.techelevator.farm.animals;

public class Cat extends FarmAnimal {
    public Cat(String name, String sound) {
        super(name, sound);
    }

    public String eat(){
        return "Eating some fancy feast";
    }
    public final String getSound(){
        return "Meow";
    }
}
