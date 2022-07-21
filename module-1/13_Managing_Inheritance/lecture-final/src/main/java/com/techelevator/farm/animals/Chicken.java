package com.techelevator.farm.animals;

public class Chicken extends FarmAnimal {

	public Chicken() {
		super("Chicken", "cluck!");
	}

	public String eat(){
		return "I got me some grain";
	}

	public void layEgg() {
		System.out.println("Chicken laid an egg!");
	}

}
