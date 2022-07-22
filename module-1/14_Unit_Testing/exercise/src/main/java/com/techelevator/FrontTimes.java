package com.techelevator;

public class FrontTimes {

	/*
	 * Given a string and a non-negative int n, we'll say that the front of the
	 * string is the first 3 chars, or whatever is there if the string is less than
	 * length 3. Return n copies of the front; frontTimes("Chocolate", 2) →
	 * "ChoCho" frontTimes("Chocolate", 3) → "ChoChoCho" frontTimes("Abc", 3) →
	 * "AbcAbcAbc"
	 */
	public String generateString(String str, int n) {
		//assigned result variable to an empty string
		String result = "";
		//if the string is not null.. do this..
		if (str != null) {
			//if the length of the string is less than or equal to 3.. do this
			if (str.length() <= 3) {
				//forloop that loops until i is greater than the value passed through n
				for (int i = 0; i < n; i++) {
					//each time it loops.. it's gonna take the string and add it to the result variable
					result += str;
				}
				//otherwise if the length of the string is greater than 3
			} else {
				//forloop that loops until is greater than the value passed through n
				for (int i = 0; i < n; i++) {
					//each time it loops.. it's gonna take the first 3 chars in the string and add it to the result variable
					result += str.substring(0, 3);
				}
			}
		}
		//returns the String value of what's stored in result
		return result;
	}

}
