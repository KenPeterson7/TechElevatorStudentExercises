package com.techelevator.farm.animals;

import com.techelevator.farm.interfaces.Singable;

public abstract class FarmAnimal implements Singable {
	private String name;
	private String sound;
	private boolean isSleeping;

	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}

	public String getName( ) {
		return name;
	}

	public abstract String eat();

	public String getSound( ) {
		if(isSleeping){
			return "Zzzzz....";
		}
		return sound;
	}
	public void sleep(boolean isSleeping){
		this.isSleeping = isSleeping;
	}

}
