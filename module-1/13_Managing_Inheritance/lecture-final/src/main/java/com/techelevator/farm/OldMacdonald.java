package com.techelevator.farm;

import com.techelevator.farm.animals.*;
import com.techelevator.farm.food.Egg;
import com.techelevator.farm.interfaces.Sellable;
import com.techelevator.farm.interfaces.Singable;

public class OldMacdonald {
	public static void main(String[] args) {
		Cow cow = new Cow();
		cow.sleep(true);

		Pig pig = new Pig();
		pig.sleep(true);

		Cat cat = new Cat("Chester", "Whatever");
		cat.sleep(true);

		Singable[] singables =
				new Singable[] {new Cow(), new Chicken(), pig, cow, new Pig(), new Tractor(), cat};

		FarmAnimal cow2 = ((FarmAnimal) singables[0]);
		cow2.sleep(true);

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
