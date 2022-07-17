package com.techelevator;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Exercises {

	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
	 *
	 * The animal name should be case insensitive so "elephant", "Elephant", and
	 * "ELEPHANT" should all return "Herd".
	 *
	 * If the name of the animal is not found, null, or empty, return "unknown".
	 *
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 * animalGroupName("Rhino") -> "Crash"
	 * animalGroupName("rhino") -> "Crash"
	 * animalGroupName("elephants") -> "unknown"
	 *
	 */
	//Method is public meaning it's accessible outside of this class
	//Method return type is string object, methond name is animalGroupName
	//Method contains a String var named animalName
	public String animalGroupName(String animalName) {

		// Step One: Declare a Map animalGroupTest
		Map<String, String> animalGroupTest = new HashMap<String, String>();
		// Step Two: Add items to a Map
		animalGroupTest.put("Rhino", "Crash");
		animalGroupTest.put("giraffe", "Tower");
		animalGroupTest.put("elephant", "Herd");
		animalGroupTest.put("lion", "Pride");
		animalGroupTest.put("crow", "Murder");
		animalGroupTest.put("Pigeon", "Kit");
		animalGroupTest.put("flamingo", "Pat");
		animalGroupTest.put("deer", "Herd");
		animalGroupTest.put("Dog", "Pack");
		animalGroupTest.put("crocodile", "Float");
		//If statement to determine if the group name or unknown should print
		//If statement reads.. if the animalName var is not equal to null AND the animalName is found in the Key (boolean returns True)
		//.toLowerCase coverts the key values to lowercase
		//The null condition in the IF statement is written first to take care of null pointer exceptions
		if (animalName != null && animalGroupTest.containsKey(animalName.toLowerCase())) {
			//Returns the value of animalName Key in the animalGroupTest Map
			//.get returns the value to which the specific key is mapped
			//it takes the key in animalName.. like "giraffe" and returns the value "Tower"
			//.toLowerCase coverts key values to lowercase
			return animalGroupTest.get(animalName.toLowerCase());
		} else {
			//Returns the String "unknown"
			return "unknown";
		}
	}

	/*
	 * Given a String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 *
	 * If the item number is empty or null, return 0.00.
	 *
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 *
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00
	 *
	 */
	//Method is public meaning it's accessible outside of this class
	//Method return type is a double object, methond name is isItOnSale
	//Method contains a String var named itemNumber
	public double isItOnSale(String itemNumber) {

		    // Step One: Declare a Map onSale
			Map<String, Double> onSale = new HashMap<String, Double>();
			// Step Two: Add items to the Map
			onSale.put("KITCHEN4001", 0.20);
			onSale.put("GARAGE1070", 0.15);
			onSale.put("LIVINGROOM", 0.10);
			onSale.put("KITCHEN6073", 0.40);
			onSale.put("BEDROOM3434", 0.60);
			onSale.put("BATH0073", 0.15);

			//initialized String var idkhelp w/ itemNumber var
		    //Set itemNumber to return the itemNumber if itemNumber is not equal to Null
			//Set itemNumber to return an empty string if it is equal to null, therefore it returns the else statement 0.0
			String idkHelp = itemNumber == null ? "" : itemNumber;
			//if statement that reads.. if the variable being passed (idkHelp) contains a key in the onSale Map.. then do this
			//.toUpperCase coverts (String) key to uppercase
		if (onSale.containsKey(idkHelp.toUpperCase())){
			//Returns the value of idkHelp Key in the onSale Map
			//.get returns the value to which the specific key is mapped
			//it takes the key in idkHelp.. like "KITCHEN4001" and returns the int value .2
			//.toUpperCase coverts (String) key to uppercase
			return onSale.get(idkHelp.toUpperCase());
		}
		//reads.. else return the integer 0.0
		return 0.0;
	}

	/*
	 * Modify and return the given Map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 *
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 *
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 *
	 */

	//Method is public meaning it's accessible outside of this class
	//Method return type is a Map object, key = String, value = Integer
	//Method name is robPeterToPayPaul and contains Map <String, Integer> instance variable peterPaul
	//Integer is a wrapper class so it can be used as an object
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
		//instantiated peterMula int var w/ the value that is returned from the String key "Peter" when it's passed through the peterPaul var
		Integer peterMula = peterPaul.get("Peter");
		//instantiated paulMula int var w/ the value that is returned from the String key "Paul" when it's passed through the peterPaul var
		Integer paulMula = peterPaul.get("Paul");
		//if statement that reads.. if int var peterMula is greater than 0 AND paulMula is greater than 1000 cents.. do this
		if (peterMula > 0 && paulMula < 1000){
			//IF statement nested within IF statements that reads.. if peterMula int var is divisible by 2 and it does NOT equal 0.. then do this...
			if (peterMula % 2 != 0) {
				//peterMula (int var) is equal to the value of peterMula divided by 2
				peterMula = peterMula / 2;
				//paulMula (int var) is equal to the value of peterMula + paulMula
				paulMula = peterMula + paulMula;
				//Increments peterMula var by 1 ... but why??
				peterMula++;
				//else if statement that reads.. else if int var peterMula is greater than 0 AND paulMula is greater than 1000 cents.. do this
			}else if (peterMula > 0 && paulMula < 1000) {
				//peterMula (int var) is equal to the value of peterMula divided by 2
				peterMula = peterMula / 2;
				//paulMula (int var) is equal to the value of peterMula + paulMula
				paulMula = peterMula + paulMula;
			}else{
				//return the keyvalue associated w/ peterPaul Map var <String, Integer>
				return peterPaul;
			}
		}
		//Associates the "Peter" key w/ the value peterMula (int var) and adds it to the peterPaul Map var
		peterPaul.put("Peter", peterMula);
		//Associates the "Paul" key w/ the value paulMula (int var) and adds it to the peterPaul Map var
		peterPaul.put("Paul", paulMula);
		//returns the key/value associated w/ peterPaul Map var <String, Integer>
		return peterPaul;
	}

	/*
	 * Modify and return the given Map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 *
	 * peterPaulPartnership({"Peter": 50000, "Paul": 100000}) → {"Peter": 37500, "Paul": 75000, "PeterPaulPartnership": 37500}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 *
	 */

	//Method is public meaning it's accessible outside of this class
	//Method return type is a Map object, key = String, value = Integer
	//Method name is peterPaulPartnership and contains Map <String, Integer> instance variable peterPaul
	//Integer is a wrapper class so it can be used as an object
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		//instantiated peterMula int var w/ the value that is returned from the String key "Peter" when it's passed through the peterPaul var
		Integer peterMoney = peterPaul.get("Peter");
		//instantiated paulMula int var w/ the value that is returned from the String key "Paul" when it's passed through the peterPaul var
		Integer paulMoney = peterPaul.get("Paul");
		//if statement that reads.. if peterMoney is greater than or equal to $50 AND paulMoney is greater than or equal to $100... do this..
		if ( peterMoney >= 5000 && paulMoney >= 10000) {
			//initializing partnershipPeter equal to peterMoney (int var) divided by 4 (ex. 50000 / 4 = 12500)
			Integer partnershipPeter = peterMoney / 4;
			//initializing peterMoney equal to peterMoney - partnershipPeter ( Ex. 50000 - 12500 = 37500)
			peterMoney = peterMoney - partnershipPeter;
			//initializing partnershipPaul equal to paulMoney (int var) divided by 4 (ex. 100000 / 4 = 25000)
			Integer partnershipPaul = paulMoney / 4;
			//initializing paulMoney equal to paulMoney - partnershipPaul ( Ex. 100000 - 25000 = 75000)
			paulMoney = paulMoney - partnershipPaul;
			//initialized total to equal partnershipPaul + partnershipPeter
			Integer total = partnershipPaul + partnershipPeter;
			//Associates the "Peter" key w/ the value peterMoney (int var) and adds it to the peterPaul Map var
			peterPaul.put("Peter", peterMoney);
			//Associates the "Paul" key w/ the value paulMoney (int var) and adds it to the peterPaul Map var
			peterPaul.put("Paul", paulMoney);
			//Associates the "PeterPaulPartnership" key w/ the value total (int var) and adds it to the peterPaul Map var
			peterPaul.put("PeterPaulPartnership", total);
			//return the key/value associated w/ peterPaul Map var <String, Integer>
			return peterPaul;
		}else{
			//return the key/value associated w/ peterPaul Map var <String, Integer>
			return peterPaul;
		}
	}

	/*
	 * Given an array of non-empty Strings, return a Map<String, String> where for every different String in the array,
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */

	//Method is public meaning it's accessible outside of this class
	//Method return type is a Map object, key = String, value = String
	//Method name is beginningAndEnding & contains String array instance variable words
	public Map<String, String> beginningAndEnding(String[] words) {
		//Instantiated (created) Map object keyValue (allocated space to hold memory for the keyValue object)
		//This object was created so that it store and return the expected values
		Map<String, String> keyValue = new HashMap<>();
		//foreach loop that reads.. for each string (value) in words.. do this...
		for (String strings : words){
			//add the first char & the last char to the keyValue Map object
			keyValue.put(strings.substring(0, 1), strings.substring(strings.length() -1))	;
		}
		//returns what the keyValue Maps object has stored
		return keyValue;
	}

	/*
	 * Given an array of Strings, return a Map<String, Integer> with a key for each different String, with the value the
	 * number of times that String appears in the array.
	 *
	 * ** A CLASSIC **
	 *
	 * wordCount(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep": 1 }
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 *
	 */

	//Method is public meaning it's accessible outside the class
	//Method return type is a Map, key = String, value = Integer
	//Method name is words & contains String array instance variable words
	public Map<String, Integer> wordCount(String[] words) {
		//Instantiated Map object counts (allocated space to hold memory for the counts object)
		Map<String, Integer> counts = new HashMap<>();
		//foreach loop that reads.. for each word (value) in words.. do this...
		for (String word : words) {
			//if statement that reads.. if the counts object contains this Key (that is being passed through the word String var).. then do this..
			if(counts.containsKey(word)) {
				//initialize currentCount to the Integer value that is returned from the Key (word)
				int currentCount = counts.get(word);
				//iterate the currentCount + 1 (incrementing until the condition set in the “for” statement is met.)
				currentCount++;
				//associates the word key w/ the currentCount value and adds it to the counts object
				counts.put(word, currentCount) ;
			} else {
				//associates the word key w/ the value 1 and adds it to the counts object
				counts.put(word, 1);
			}
		}
		//returns what the counts Map object has stored
		return counts;
	}

	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the
	 * number of times that int appears in the array.
	 *
	 * ** The lesser known cousin of the the classic wordCount **
	 *
	 * intCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 2, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * intCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * intCount([]) → {}
	 *
	 */

	//Method is public meaning it's accessible outside the class
	//Method return type is a Map, key = Integer, value = Integer
	//Method name is  integerCount and contains an int array instance variable checks
	public Map<Integer, Integer> integerCount(int[] checks) {
		//Instantiated Map object counts (allocated space to hold memory for the counts object)
		Map<Integer, Integer> counts = new HashMap<>();
		//foreach loop that reads.. for each integerCheck (value) in checks.. do this...
		for (int integerCheck : checks) {
			//if statement that reads.. if the counts object contains this Key (that is being passed through the integerCheck int var).. then do this..
			if(counts.containsKey(integerCheck)) {
				//initialize currentCount to the Integer value that is returned from the Key (integerCheck)
				int currentCount = counts.get(integerCheck);
				//iterates the currentCount + 1 (incrementing until the condition set in the “for” statement is met.)
				currentCount++;
				//associates the integerCheck key w/ the currentCount value and adds it to the counts object
				counts.put(integerCheck, currentCount) ;
			} else {
				//associates the integerCheck key w/ the value 1 and adds it to the counts object
				counts.put(integerCheck, 1);
			}
		}
		//returns what the counts Map <Integer, Integer> object has stored
		return counts;
	}

	/*
	 * Given an array of Strings, return a Map<String, Boolean> where each different String is a key and value
	 * is true only if that String appears 2 or more times in the array.
	 *
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 *
	 */
	//Method is public meaning it's accessible outside the class
	//Method return type is a Map object, key = String, value = Boolean
	//Method name is wordMultiple and contains a String array instance variable words
	public Map<String, Boolean> wordMultiple(String[] words) {
		//Instantiated Map object wordMultiple (allocated space to hold memory for the wordMultiple object)
		Map<String, Boolean> wordMultiple = new HashMap<>();
		//foreach time in words.. do this..
		for  (String time : words ) {
			//initialized count to 0
			int count = 0;
			//for loop initialized at 0, and iterates i once each loop (adds +1 to i until the condition is met)
			//Used .length to return the # of chars in the String array, and set the condition to run until i is greater than the # of chars in words String array
			for(int i = 0; i < words.length; i++) {
				//if statement that reads.. if the value that is stored in the i var (words) is equal to what's being passed in the time var..
				if (words[i] == time){
					// then add +1 to the count
					count++;
				}
			}
			//if statement that reads.. if the count is greater than 1.. then do this
			 if(count > 1){
				 //Adds the value stored in the time var to the Key and associates a true value w/ that key
				 wordMultiple.put(time, true);

			 } else {
				 //Adds the value stored in the time var to the Key and associates a false value w/ that key
				 wordMultiple.put(time, false);
			 }
		}
		//returns whatever the wordMultiple Map <String, Boolean> object has stored
		return wordMultiple;
	}

	/*
	 * Given two Maps, Map<String, Integer>, merge the two into a new Map, Map<String, Integer> where keys in Map2,
	 * and their int values, are added to the int values of matching keys in Map1. Return the new Map.
	 *
	 * Unmatched keys and their int values in Map2 are simply added to Map1.
	 *
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 *
	 */

	//Method is public meaning it's accessible outside the class
	//Method return type is a Map object, key = String, value = Integer
	//Method name is consolidateInventory and contains 2 Map <String, Integer> variables called mainWarehouse & remoteWarehouse
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse,
			Map<String, Integer> remoteWarehouse) {
		//foreach sku (key) in all the remoteWarehouse keys.. do this..
		//.keySet() returns all the (String) keys contained in the remoteWarehouse Map instance var
		for (String sku : remoteWarehouse.keySet()) {
			//initialized int val var to the value returned by the sku (key)
			int val = remoteWarehouse.get(sku);
			// if mainWarehouse contains a key in sku, then do this...
			if (mainWarehouse.containsKey(sku)) {
				//add the value stored in sku plus the val int var (value stored for the remoteWareHouse key) (Ex. SKU2 - 53 + 11)
				mainWarehouse.put(sku, mainWarehouse.get(sku) + val);
			} else {
				// add the value of the sku (remoteWareHouse) without adding the value of mainWareHouse
				mainWarehouse.put(sku, val);
			}
		}
		//returns what the mainWareHouse Map <String, Integer> object has stored
		return mainWarehouse;
	}

	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 *
	 * Given an array of Strings, for each String, the count of the number of times that a subString length 2 appears
	 * in the String and also as the last 2 chars of the String, so "hixxxhi" yields 1.
	 *
	 * We don't count the end subString, but the subString may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end subString, which we don't count.
	 *
	 * Return Map<String, Integer>, where the key is String from the array, and its last2 count.
	 *
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 *
	 */

	//Method is public meaning it's accessible outside the class
	//Method return type is a Map object, key = String, value = Integer
	//Method name is last2Revisited and contains an instance String array variable called words
	public Map<String, Integer> last2Revisited(String[] words) {
		//Instantiated totalCount object (allocated space to hold memory for the object)
		Map<String, Integer> totalCount = new HashMap<String, Integer>();

		//for each word in words.. do this
		for (String word : words) {
			//initialized int var count to 0
			int count = 0;
			//initialized String var lastCombo to the last 2 chars in the word String var
			String lastCombo = word.substring(word.length() - 2);
			//for loop initialized i at 0, set the condition to loop until i is greater than the length of word String var (Ex. hixxhi = 6)
			//for loop adds +1 to i after each iteration
			for (int i = 0; i < word.length() - 2; i++) {
				//if the first 2 chars of the word are equal to the last 2 chars of the word.. then add +1 to the count
				if (word.substring(i, i + 2).equals(lastCombo)) {
					count++;
				}
			}
			//Associates the key (word) w/ the value (count - number counted from the above if condition)
			totalCount.put(word, count);
		}
		//returns what the totalCount Map <String, Integer> object has stored
		return totalCount;
	}

}


