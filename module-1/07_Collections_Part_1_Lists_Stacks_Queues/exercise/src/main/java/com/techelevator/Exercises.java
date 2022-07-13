package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercises {

	/*
	 Note, for-each is preferred, and should be used when possible.
	 */

	/*
	 Given an array of Strings, return an ArrayList containing the same Strings in the same order
	 array2List( {"Apple", "Orange", "Banana"} )  ->  ["Apple", "Orange", "Banana"]
	 array2List( {"Red", "Orange", "Yellow"} )  ->  ["Red", "Orange", "Yellow"]
	 array2List( {"Left", "Right", "Forward", "Back"} )  ->  ["Left", "Right", "Forward", "Back"]
	 */
	public List<String> array2List(String[] stringArray) {
		//Created a List<String> variable and assigned it to the address of the new instance
		//The new keyword sets aside memory to hold an instance of the ArrayList
		//The ArrayList constructor () is invoked to initialize the instance to an empty list of the type used, in this case a list of strings.
		List<String> array2List = new ArrayList<String>();
		//The foreach loop reads.. for each item (variable) in the stringArray, add that item to the array2List variable (String<List>)
		for(String item: stringArray){
			array2List.add(item);
		}
		//returns the value of the array2List variable
		return array2List;
	}

	/*
	 Given a list of Strings, return an array containing the same Strings in the same order
	 list2Array( ["Apple", "Orange", "Banana"] )  ->  {"Apple", "Orange", "Banana"}
	 list2Array( ["Red", "Orange", "Yellow"] )  ->  {"Red", "Orange", "Yellow"}
	 list2Array( ["Left", "Right", "Forward", "Back"] )  ->  {"Left", "Right", "Forward", "Back"}
	 */
	public String[] list2Array(List<String> stringList) {
		//created a String array variable called list2Array and assigned it to the address of the new instance
		//the stringList.toArray method returns an array containing all of the elements in the stringList in proper sequence (from first to last element)
		//The new keyword sets aside memory to hold an instance of the stringList
		//the stringList.size() method returns the number of elements in the stringList
		String[] list2Array = stringList.toArray(new String[stringList.size()]);
		//returns the value of the list2Array variable
		return list2Array;
	}

	/*
	 Given an array of Strings, return an ArrayList containing the same Strings in the same order
	 except for any words that contain exactly 4 characters.
	 no4LetterWords( {"Train", "Boat", "Car"} )  ->  ["Train", "Car"]
	 no4LetterWords( {"Red", "White", "Blue"} )  ->  ["Red", "White"]
	 no4LetterWords( {"Jack", "Jill", "Jane", "John", "Jim"} )  ->  ["Jim"]
	 */
	public List<String> no4LetterWords(String[] stringArray) {

		//Created a List<String> variable and assigned it to the address of the new instance
		//The new keyword sets aside memory to hold an instance of the ArrayList
		//The ArrayList constructor () is invoked to initialize the instance to an empty list of the type used, in this case a list of strings.
		List<String> no4LetterWords = new ArrayList<String>();

		//Created foreach loop that reads for each testVar in the stringArray
		for(String testVar: stringArray){
			//If statement that reads if the length of the testVar String value is NOT 4... then add the testVar to the no4LetterWords variable
			if(testVar.length() != 4){
				no4LetterWords.add(testVar);
			}
		}
		//returns the value of the no4LetterWords variable
		return no4LetterWords;
	}

	/*
	 Given an array of ints, divide each int by 2, and return an ArrayList of Doubles.
	 arrayInt2ListDouble( {5, 8, 11, 200, 97} ) -> [2.5, 4.0, 5.5, 100, 48.5]
	 arrayInt2ListDouble( {745, 23, 44, 9017, 6} ) -> [372.5, 11.5, 22, 4508.5, 3]
	 arrayInt2ListDouble( {84, 99, 3285, 13, 877} ) -> [42, 49.5, 1642.5, 6.5, 438.5]
	 */
	public List<Double> arrayInt2ListDouble(int[] intArray) {
		//Created a List<Double> variable and assigned it to the address of the new instance
		//The new keyword sets aside memory to hold an instance of the ArrayList
		//The ArrayList constructor () is invoked to initialize the instance to an empty list of the type used, in this case a list of doubles.
		List<Double> arrayInt2ListDouble = new ArrayList<>();
		//Created foreach loop that reads for each numberTest in the intArray, add that item arrayInt2ListDouble variable and divide it by 2
		for(int numberTest: intArray){
			arrayInt2ListDouble.add(numberTest /2.0);
		}
		//returns the value of the arrayInt2ListDouble variable
		return arrayInt2ListDouble;
	}

	/*
	 Given a List of Integers, return the largest value.
	 findLargest( [11, 200, 43, 84, 9917, 4321, 1, 33333, 8997] ) -> 33333
	 findLargest( [987, 1234, 9381, 731, 43718, 8932] ) -> 43718
	 findLargest( [34070, 1380, 81238, 7782, 234, 64362, 627] ) -> 81238
	 */
	public Integer findLargest(List<Integer> integerList) {
		Integer largest = Collections.max(integerList);
		return largest;
	}

	/*
	 Given an array of Integers, return a List of Integers containing just the odd values.
	 oddOnly( {112, 201, 774, 92, 9, 83, 41872} ) -> [201, 9, 83]
	 oddOnly( {1143, 555, 7, 1772, 9953, 643} ) -> [1143, 555, 7, 9953, 643]
	 oddOnly( {734, 233, 782, 811, 3, 9999} ) -> [233, 811, 3, 9999]
	 */
	public List<Integer> oddOnly(Integer[] integerArray) {
		//Created a List<Integer> variable and assigned it to the address of the new instance
		//The new keyword sets aside memory to hold an instance of the ArrayList
		//The ArrayList constructor () is invoked to initialize the instance to an empty list of the type used, in this case a list of doubles.
		List<Integer> onlyOdds = new ArrayList<Integer>();
		//Created foreach loop that reads.. for each modTheOdds in the integerArray.. do this..
		for (Integer modTheOdds: integerArray){
			//if statement that reads if the modTheOdds divisible by 2 is not equal to 0
			if (modTheOdds % 2 != 0){
				//Add the modTheOdds value to the onlyOdds variable
				onlyOdds.add(modTheOdds);
			}
		}
		//returns the value(s) of the onlyOdds variable
		return onlyOdds;
	}

	/*
	 Given a List of Integers, and an int value, return true if the int value appears two or more times in
	 the list.
	 foundIntTwice( [5, 7, 9, 5, 11], 5 ) -> true
	 foundIntTwice( [6, 8, 10, 11, 13], 8 -> false
	 foundIntTwice( [9, 9, 44, 2, 88, 9], 9) -> true
	 */
	public boolean foundIntTwice(List<Integer> integerList, int intToFind) {
		//created int variable count and initialized it to 0
		//This was created because we want to count the # of times the same value is given in the list
		int count = 0;
		//Created foreach loop that reads.. for each findTwice (Integer) in the integerList array.. do this..
		for (Integer findTwice: integerList){
			//If statement that reads.. if intToFind value is equal to the findTwice value.. then add 1 to the count
			if (intToFind == findTwice){
				count++;
			}
		}
		//if statement that reads.. if the count is equal to 2 or 3, then return true, else return false
		if (count == 2 || count == 3){
			return true;
		}
		return false;
	}

	/*
	 Given an array of Integers, return a List that contains the same Integers (as Strings). Except any multiple of 3
	must be replaced by the String "Fizz", any multiple of 5 must be replaced by the String "Buzz",
	and any multiple of both 3 and 5 must be replaced by the String "FizzBuzz."
	** INTERVIEW QUESTION **

	fizzBuzzList( {1, 2, 3} )  ->  ["1", "2", "Fizz"]
	fizzBuzzList( {4, 5, 6} )  ->  ["4", "Buzz", "Fizz"]
	fizzBuzzList( {7, 8, 9, 10, 11, 12, 13, 14, 15} )  ->  ["7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"]

	HINT: To convert an Integer x to a String, you can use x.toString() in your code. For example, if x = 1, then x.toString() returns "1."
	 */
	public List<String> fizzBuzzList(Integer[] integerArray) {
		//Created a List<String> variable and assigned it to the address of the new instance
		//The new keyword sets aside memory to hold an instance of the ArrayList
		//The ArrayList constructor () is invoked to initialize the instance to an empty list of the type used, in this case a list of strings.
		List<String> fizzBuzzList = new ArrayList<String>();
		//Created foreach loop that reads.. for each checkForFizzBuzz in the integerArray.. do this
		for (Integer checkForFizzBuzz: integerArray){
			//if statement that reads.. if the checkForFizzBuzz is divisible by 3 & divisible by 5.. then add "FizzBuzz" to the fizzBucketList var
			if (checkForFizzBuzz % 3 == 0 && checkForFizzBuzz % 5 == 0){
				fizzBuzzList.add("FizzBuzz");
				//else if statement that reads.. else if checkForFizzBuzz is divisible by 3.. then add "Fizz" to the fizzBucketList var
			} else if (checkForFizzBuzz % 3 == 0){
				fizzBuzzList.add("Fizz");
				//else if statement that reads.. else if checkForFizzBuzz is divisible by 5.. then add "Buzz" to the fizzBucketList var
			} else if (checkForFizzBuzz % 5 == 0){
				fizzBuzzList.add("Buzz");
				//else statement that reads.. else if none of the above conditions are met..
				//adds checkForFizzBuzz int value(s) converted as a string (.toString method) to fizzBucketList var
			} else {
				fizzBuzzList.add(checkForFizzBuzz.toString());
			}
		}
		//returns the value(s) of the fizzBucketList variable
		return fizzBuzzList;
	}

	/*
	 Given two lists of Integers, interleave them beginning with the first element in the first list followed
	 by the first element of the second. Continue interleaving the elements until all elements have been interwoven.
	 Return the new list. If the lists are of unequal lengths, simply attach the remaining elements of the longer
	 list to the new list before returning it.
	 interleaveLists( [1, 2, 3], [4, 5, 6] )  ->  [1, 4, 2, 5, 3, 6]
	 */
	public List<Integer> interleaveLists(List<Integer> listOne, List<Integer> listTwo) {

		//Created a List<Integer> variable and assigned it to the address of the new instance
		//The new keyword sets aside memory to hold an instance of the ArrayList
		//The ArrayList constructor () is invoked to initialize the instance to an empty list of the type used, in this case a list of strings.
		List<Integer> interLeave = new ArrayList<Integer>();

		//Created for loop... that reads.. initialized i var at 0
		//The condition is set to i variable is less than the greater of 2 integer values (1 of the 2 integers has to be greater than i)
		//the for loop will iterate once each loop (add to the value of i each loop)
		for (int i = 0; i < Math.max(listOne.size(), listTwo.size()); i++) {
			//Created if statement that reads if variable i is less than the number of elements in the listOne List
			//then add the returned element at the (i) position  in the List
			if ( i < listOne.size()){
				interLeave.add(listOne.get(i));
			}
			//Created if statement that reads if variable i is less than the number of elements in the listTwo List
			//then add the returned element at the (i) position in the List
			if ( i < listTwo.size()){
				interLeave.add(listTwo.get(i));
			}
		}
		//returns the value(s) of the interLeave variable
		return interLeave;
	}

}
