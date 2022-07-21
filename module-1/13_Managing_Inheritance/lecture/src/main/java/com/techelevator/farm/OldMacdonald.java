package com.techelevator.farm;

import com.techelevator.farm.Tractor;
import com.techelevator.farm.animals.*;
import com.techelevator.farm.food.Egg;
import com.techelevator.farm.interfaces.Sellable;
import com.techelevator.farm.interfaces.Singable;

public class OldMacdonald {
	public static void main(String[] args) {

		FarmAnimal cow = new Cow();
		cow.sleep(true);

		FarmAnimal pig = new Pig();
		pig.sleep(true);

		FarmAnimal cat = new Cat();

		Singable[] singables =
				new Singable[] {cow, new Chicken(), pig, new Tractor(), cat};


		for (Singable singable : singables) {
			String name = singable.getName();
			String sound = singable.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name
					+ ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound
					+ " everywhere a " + sound + " " + sound);
			System.out.println();
		}

		Sellable[] sellables = new Sellable[] {new Cow(), new Pig(), new Egg()};


		for (Sellable sellable : sellables) {
			System.out.println("Step right up and get your " + sellable.getName());
			System.out.println("Only $" + sellable.getPrice());
		}
	}
}