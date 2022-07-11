package com.techelevator;
import java.util.Scanner; //imported java.util.Scanner to access Scanner Class

//public class for main method
public class Fibonacci {

	//method is public (can be accessed outside the class, static means the method belongs to the class, return type is void (nothing to return)
	//variables is a String array
	public static void main(String[] args) {

		//Created an int variable called initial and initialized it to 0;
		int initial = 0;
		//Created an int variable called addInitial and initialized it to 1;
		int addInitial = 1;
		//Created an int variable called keepInitial and initialized it to 0;
		int keepInitial = 0;
		//Created new scanner variable named input
		Scanner input = new Scanner(System.in);
		//Told the system to output a mesasge to the user to enter an integer
		System.out.print("Please enter an integer: ");
		//Created an int variable called topNumber and stores/initializes the value of the (next) input as an integer
		int topNumber = input.nextInt();
		//Told the system to store the last entered value in the input variable
		input.nextLine();
		//Created an if statement to account for when the topNumber is equal to 0 or less
		if (topNumber == 0 || topNumber < 0) {
			//System prints outs 0 ,1 if this condition is met
			System.out.print("0, 1");
		//Created an else statement when the above IF condition is not met (any other scenario besides 0)
		} else {
			//System prints out 0 + a (placeholder) empty string when the above IF Condition is not met
			System.out.print(0 + " ");
			//Created FOR loop to determine what output should be displayed when the user enters a positive integer
			//Initialized the FOR loop at 1, set the condition to loop until the topNumber (user input) is equal to or greater
			//than the nextNum variable (which is calculated in the FOR loop below)
			for (int nextNum = 1; nextNum <= topNumber;) {
				//Told the system to print out value of the nextNum variable + an empty string
				System.out.print(nextNum + " ");
				//Set the keepInitial variable to initial (Ex. 17 = 17)
				keepInitial = initial;
				//Set the initial variable to nextNum (Ex. 17 = 17)
				initial = nextNum;
				//fibonacci calculation - set the  nextNum variable equal to the nextNum value + keepInitial value (Ex. 1 = 1 + 1 or 1 = 2)
				nextNum += keepInitial;
			}
		}
	}
}


