package com.techelevator.farm;

import java.util.Scanner;

public class PlayingWithSwitchStatements {
    public static void main(String [] args){
        System.out.println("Movie ticket prices: ");
        System.out.println("1. Adult - $14");
        System.out.println("2. Child = $8");
        System.out.println("3. Senior = $11");
        System.out.print("Enter a choice: ");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        System.out.print("Enter number of tickets: ");
        int quantity = Integer.parseInt(input.nextLine());
        int total = 0;

       switchStatement(total, quantity, choice);
       ifStatement(total, quantity, choice);
    }

    public static void switchStatement(int total, int quantity, String choice){
        switch(choice){
            case "1":
                total = quantity * 14;
                break;
            case "2":
                total = quantity * 8;
                break;
            case "3":
                total = quantity * 11;
                break;
            default:
                System.out.println("Invalid Entry");
        }
        System.out.println(total);
    }

    public static void ifStatement(int total, int quantity, String choice){
        if(choice.equals("1")){
            total = quantity * 14;
        }else if(choice.equals("2")){
            total = quantity * 8;
        } else if (choice.equals("3")){
            total = quantity * 11;
        } else {
            System.out.println("Invalid Entry");
        }

        System.out.println(total);
    }
}
