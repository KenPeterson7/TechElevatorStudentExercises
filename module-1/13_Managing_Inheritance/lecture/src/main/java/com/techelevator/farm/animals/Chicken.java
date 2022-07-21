package com.techelevator.farm.animals;

public class Chicken extends FarmAnimal {

	public Chicken() {
		super("Chicken", "cluck!");
	}

	public void layEgg() {
		System.out.println("Chicken laid an egg!");
	}

	public String eat(){
		return "I'm just eating on some grain";
	}

}