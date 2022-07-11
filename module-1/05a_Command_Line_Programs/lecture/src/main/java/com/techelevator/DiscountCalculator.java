package com.techelevator;

import java.util.Scanner;

class DiscountCalculator {

    /**
     * The main method is the start and end of our program
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Discount Calculator");

        // Prompt the user for a discount amount
        // System.out.print("Please enter the discount amount: ");
        // The answer needs to be saved as a double

        System.out.print("Enter the discount amount (w/out percentage): ");

        double discount = Double.parseDouble(scanner.nextLine()) / 100;

        // Prompt the user for a series of prices
        System.out.print("Please provide a series of prices (space separated): ");
        String prices = scanner.nextLine();

        String[] priceArray = prices.split("");

        for (int i = 0; i < priceArray.length; i++) {
            //Calculate the amount off

            double amountOff = Double.parseDouble(priceArray[i]) * discount;

            //Calculate the sale price

            double salePrice = Double.parseDouble(priceArray[i]) - amountOff;

            System.out.println("Original Price: " + priceArray[i] + " Sale Price: " + salePrice);

        }

    }
}