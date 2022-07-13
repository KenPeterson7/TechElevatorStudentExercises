package com.techelevator;

import java.util.*;

public class LectureFinalClassVersion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		List<Integer> integerList = new ArrayList<>();
		List<Integer> numbers = new ArrayList<>();

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		integerList.add(14);
		integerList.add(10);
		integerList.add(15);
		integerList.add(10);
		integerList.add(3);

		System.out.println("What number do you want to add to the list?: ");
		String nextLine = scanner.nextLine();
		integerList.add(Integer.parseInt(nextLine));

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");
		integerList.add(3,8);

		for(int integer: integerList){
			System.out.println(integer);
		}

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		integerList.remove(3);

		for (int i = 0; i < integerList.size(); i++) {
			System.out.println(integerList.get(i));
		}

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

//		System.out.println("What number are you looking for?: ");
//		String searchNumber = scanner.nextLine();
//		boolean isItHere = integerList.contains(Integer.parseInt(searchNumber));
//		if(isItHere)
//			System.out.println("The list contains the number: " + searchNumber);
//		else
//			System.out.println("The list does not contain the number: " + searchNumber);

		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");
		System.out.println("What number do you want the index for?: ");
		String searchNumber = scanner.nextLine();
		int index = integerList.indexOf(Integer.parseInt(searchNumber));
		System.out.println("The number " + searchNumber + " is at index " + index);


		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");
		Integer[] intArray = integerList.toArray(new Integer[0]);


		for (Integer i : intArray) {
			System.out.println(i);

		}


		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");
		Collections.sort(integerList);

		for(int integer: integerList){
			System.out.println(integer);
		}


		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");

		Collections.reverse(integerList);


		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		for(int integer: integerList){
			System.out.println(integer);
		}

	}
}
