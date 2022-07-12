package com.techelevator;

public class Lecture {



	public static void main(String[] args) {

		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */

		/* create a new instance of String using a literal */

		String test = "Testing str";

		String fruit = "Apple";
		String [] fruits = {"apple", "orange", "mango", "banana", "grapes"};
		System.out.println(Lecture.stringBuilderPractice(test));
		StringBuilder sb = new StringBuilder("");
		sb.append(test.charAt(0));
		sb.append(test.charAt(1));
		sb.append(test.charAt(4));
		sb.append(test.charAt(5));
		sb.append(test.charAt(8));

		boolean yesIDo = doIHaveThisFruit(fruit, fruits);

		System.out.println(test);


		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();

		System.out.println(test.endsWith("st"));
		System.out.println(test.startsWith("T"));
		System.out.println(test.indexOf("s"));
		System.out.println(test.lastIndexOf("t"));
		System.out.println(test.length());
		System.out.println(test.substring(0, 4));
		System.out.println(test.toLowerCase());
		System.out.println(test.toUpperCase());
		System.out.println(test.trim());
		System.out.println(test);

		/* Other commonly used methods:
		 *
		 * endsWith
		 * startsWith
		 * indexOf
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */

		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();

		char[] helloArray = new char[]{'H', 'e', 'l', 'l', 'o'};
		String hello1 = new String(helloArray);
		String hello2 = new String(helloArray);

		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
		if (hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

		String hello3 = hello1;
		if (hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}

		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */
		if (hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}



		}
	public static boolean doIHaveThisFruit (String fruit, String[]fruits) {
		for(String f:fruits) {
			if (f.equals(fruit.toLowerCase())) {
				return true;
			}
		}
		return false;
	}

	public static String stringBuilderPractice(String test){
		StringBuilder sb = new StringBuilder("");
		sb.append(test.charAt(0));
		sb.append(test.charAt(1));
		sb.append(test.charAt(4));
		sb.append(test.charAt(5));
		sb.append(test.charAt(8));

		return sb.toString();
	}

}
