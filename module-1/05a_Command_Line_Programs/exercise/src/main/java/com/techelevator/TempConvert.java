package com.techelevator;
import java.util.Scanner; //imported java.util.Scanner to access Scanner Class

//public class for main method
public class TempConvert {

	//method is public (can be accessed outside the class, static means the method belongs to the class, return type is void (nothing to return)
	//variables is a String array
	public static void main(String[] args) {

		//Created new scanner variable named test
		Scanner test = new Scanner(System.in);

		//Told the system to output a question to the user asking them to input the temperature
		System.out.print("Please enter the temperature: ");

		//Created an int variable called temperature that stores the value of the test variable as an integer
		int temperature = test.nextInt();
		//Told the system to store the last entered value in the test variable
		test.nextLine();

		//Told the system to output a question to the user asking if the temperature was Fahrenheit or Celsius
		System.out.print("Is the temperature in (C)elsius, or (F)arenheit? ");

		//System Creates a string variable called tempDecision and stores the user's last input as the value
		String tempDecision = test.nextLine();

		//System outputs the temperature in both Fahrenheit and Celsius based on the temperature & tempDecision variables.
		//If F is given, system prints the F temp first, then C temp, & vice versa if C is given
		//System calls on the tempChange method to determine/calculate the conversion based on the temperate & tempDecision that is input
		//System converts output to uppercase
		System.out.println(temperature + tempDecision + " is " + tempChange(temperature, tempDecision) + (tempDecision.toUpperCase().startsWith("F") ? "C" : "F"));
	}

	//method for converting given temp to Fahrenheit/Celsius and returns both results
	public static int tempChange(int temp, String tempDecision) {

		//if statement that occurs when f input is given for the tempDecision variable.
		if(tempDecision.toUpperCase().startsWith("F")) {
			//converts Fahrenheit into Celsius & stores it in variable resultTempC
			int resultTempC = (int)(( temp - 32) / 1.8);
			//returns the converted Celsius temperature to variable resultTempC
			return resultTempC;
		} else {
			//else statement that occurs if any input other than c is given for the tempDecision variable.
			//converts Celsius into Fahrenheit & stores it in variable resultTempF
			int resultTempF = ((int)(temp * 1.8 + 32));
			//returns the converted Fahrenheit temperature to variable resultTempF
			return resultTempF;
		}


	}

}
