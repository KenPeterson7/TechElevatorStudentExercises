package com.techelevator.farm.animals;

public class Cat extends FarmAnimal{

    public Cat(){
        super("Cat", "Meow");
    }

    public String eat(){
        return "I only dine on the fanciest of feasts";
    }
}
