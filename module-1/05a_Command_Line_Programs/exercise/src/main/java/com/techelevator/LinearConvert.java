package com.techelevator;
import java.util.Scanner; //imported java.util.Scanner to access Scanner Class

//public class for main method
public class LinearConvert {

	//method is public (can be accessed outside the class, static means the method belongs to the class, return type is void (nothing to return)
	//variables is a String array
	public static void main(String[] args) {
		//Created new scanner variable named input
		Scanner input = new Scanner(System.in);
		//Told the system to output a question to the user asking them to input the length
		System.out.print("Please enter the length: ");
		//Created an int variable called length that stores (initializes) the value of the (next) input as an Integer
		int length = input.nextInt();
		//Told the system to store the last entered value in the input variable
		input.nextLine();
		//Told the system to output a question to the user asking them to give meters or feet
		System.out.print("Is the measurement in (m)eters or (f)eet? ");
		//Created a String variable called lengthType that stores the value of the (next/second) input as a String
		String lengthType = input.nextLine();
		//System outputs the length in meters or feet (depending on user selections), and displays the converted length separated by a comma
		//System outputs the lengthType next to the length
		//System calls on the convertedMetric method to determine/calculate the conversion based on the length & lengthType that is input
		//System converts output to lowercase
		System.out.println(length + lengthType + " is " + convertedMetric(length, lengthType) + (lengthType.toLowerCase().startsWith("m") ? "f" : "m"));
	}

	//method for converting given length + lengthType and returning the converted result as an integer
	//set int length & String lengthType as the variables
	public static int convertedMetric(int length, String lengthType) {
		//if statement that occurs when the input for the lengthType variable is stored as "m"
		//if statement when converting meters to feet. Returns converted Feet.
		if(lengthType.startsWith("m")) {
			//Created a double variable called testVar that stores the value 3.2808399 (required for meters to foot conversion formula)
			double testVar = 3.2808399;
			//Created a double variable called resultFeet.
			//This variable multiplies the int variable length by the double variable testVar and stores the value as a double.
			//Meters to foot conversion formula
			double resultFt = length * testVar;
			//The return statement returns the result of the resultFt variable and stores it as an Integer (So it can round down)
			return (int)resultFt;
		//else statement when converting feet to meters
		} else {
			//Created a double variable called testOpp that stores the value 0.3048 (required for feet to meters conversion formula)
			double testOpp = 0.3048;
			//Created a double variable called resultMtrs.
			//This variable multiplies the int variable length by the double variable testOpp and stores the value as a double.
			//Feet to Meters conversion formula. Returns converted Meters.
			double resultMtrs = length * testOpp;
			//The return statement returns the result of the resultMtrs variable and stores it as an Integer (So it can round down)
			return (int)resultMtrs;
		}
	}

}

