package com.techelevator;

public class CheckingAccount extends BankAccount{

    //constructors
    //constructor is public and name is same as the Class
    //Variables are the same as the Super Class constructor BankAccount
    public CheckingAccount(String accountHolderName, String accountNumber){
        //called BankAccount parent class to access the BankAccount's properties (variables) and methods.
        super(accountHolderName, accountNumber);
    }
    //constructor is public and name is same as the Class
    //Variables are the same as the Super Class constructor BankAccount
    public CheckingAccount(String accountHolderName, String accountNumber, int balance){
        //called BankAccount parent class to access the BankAccount's properties (variables) and methods.
        super(accountHolderName, accountNumber, balance);
    }

    //default constructor
    //public CheckingAccount() {}

    //Overridden withdraw method for BankAccount
    @Override
    //method is public, return type is int, method name is withdraw, amountToWithdraw parameter is passed as an int variable through the method
    public int withdraw(int amountToWithdraw) {
        //if the value of getBalance minus the amount withdrawn is less than 0 and more than -100.. then do this...
        //if 200 - 250 = -50 < 0  && 200 -250 = -50 > -100
        if(getBalance() - amountToWithdraw < 0 && getBalance() - amountToWithdraw > -100){
            //add 10 to the amountToWithdraw int var
            amountToWithdraw += 10;
            //else if the value of getBalance minus the amount withdrawn is less than or equal to -100.. do this
            //else if 200-350 = -150 <= -100
        } else if(getBalance() - amountToWithdraw <= -100){
            //assign amountToWithdraw to 0
            amountToWithdraw = 0;
        }
        //returns the code in the corresponding Bank Account method
        //super can be used to call parent class' variables and methods.
        //Calls on the BankAccount (super class) withdraw method by passing in the updated amountToWithdraw var
        return super.withdraw(amountToWithdraw);
    }
}
