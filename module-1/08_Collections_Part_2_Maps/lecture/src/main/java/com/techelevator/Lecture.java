package com.techelevator;

import java.util.*;
import java.util.Set;
import java.util.HashSet;

public class Lecture {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		Map<String, String> vendingMachine = new HashMap<String, String>();

		vendingMachine.put("A1", "Cheezits");
		vendingMachine.put("A2", "Snickers");
		vendingMachine.put("A3", "M&Ms");
		vendingMachine.put("B1", "Skittles");
		vendingMachine.put("B2", "Chip");


		//System.out.println(vendingMachine.get("A2"));

		//System.out.println(vendingMachine.get(choice));

		vendingMachine.put("B2", "Pringles");

		for(Map.Entry<String, String> currentMachine: vendingMachine.entrySet())
		{
			System.out.println(currentMachine.getKey() + " ");
			System.out.println(currentMachine.getValue());
		}

		System.out.println("What snack do you want? ");
		String choice = scanner.nextLine();

		System.out.println("Vending item: " + vendingMachine.get(choice));

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Set<Integer> jerseyNumbers = new HashSet<>();

		jerseyNumbers.add(23);
		jerseyNumbers.add(6);
		jerseyNumbers.add(32);
		jerseyNumbers.add(0);
		jerseyNumbers.add(36);

		System.out.println(jerseyNumbers.contains(23));

		jerseyNumbers.remove(23);

		for(Integer number : jerseyNumbers){
			System.out.println(number);
		}
	}


}
