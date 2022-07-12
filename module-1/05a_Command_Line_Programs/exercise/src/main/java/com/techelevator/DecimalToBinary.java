package com.techelevator;
import java.util.Scanner; //imported java.util.Scanner to access Scanner Class

//public class for main method
public class DecimalToBinary {

	//method is public (can be accessed outside the class, static means the method belongs to the class, return type is void (nothing to return)
	//variables is a String array
	public static void main(String[] args) {

		//Created new scanner variable named input
		Scanner input = new Scanner(System.in);
		//Told the system to output a question to the user asking them to input a series of decimal values separated by spaces
		System.out.print("Please enter in a series of decimal values (separated by spaces): ");

		//Created a String variable called enteredValue that stores the value of the next input as a String
		String enteredValue = input.nextLine();
		//Created a String (array) variable called enteredValueSplit that splits the value of the enteredValue String variable into an array
		String[] enteredValueSplit = enteredValue.split(" ");

		//Created a for loop that is initialized at 0, condition is set to run to the end of the array, and it iterates once each loop
		for(int i = 0;  i < enteredValueSplit.length ; i++) {
			//Created an int variable called inputNumber that stores the value(s) of the String array enteredValueSplit as an Integer
			//Variable stores the value by parsing the String variable as an Integer
			int inputNumber = Integer.parseInt(enteredValueSplit[i]);
			//Told the system to output a statement, adding the inputNumber variable and adding related text
			System.out.print(inputNumber + " in binary is ");

			//Calls the NumberConv method and passes the inputNumber variable as a parameter
			//Prints out the appropriate binary number based on the below for loop
			numberConv(inputNumber);
			//Tells the system to print a blank statement (for example, if a negative integer is input)
			System.out.println(" ");
		}
	}
	//method for converting integer value to binary and return the result
	public static void numberConv(int inputNumber){

		//Created a new integer variable called binaryNumber that is an array that holds 40 indexes
		//Set it to 40 or larger, so it can return very large binary numbers
		int binaryNumber[] = new int[40];
		//Created integer variable i and set it to the value 0
		int i = 0;
		//Created a while loop and set the condition to run while the value for inputNumber is greater than 0
		while (inputNumber >0){
			//Set the action to iterate through the binaryNumber int array for each inputNumber that is divisible by 2
			binaryNumber[i++] = inputNumber % 2 ;
			//Set the action to update the inputNumber variable to inputNumber variable / 2
			inputNumber = inputNumber / 2;
		}
		//Created a for loop that prints out the binaryNumber conversion based on the index
		//This loop creates an int variable t and set it's initial value to the (variable) i - 1,
		//it's condition is to continue looping until the variable is greater than or equal to 0
		//This loop will decrement every time it loops
		for(int t = i-1;t >= 0;t--){
			//Prints out the binaryNumber based on the index
			System.out.print(binaryNumber[t]);

		}
	}

}

