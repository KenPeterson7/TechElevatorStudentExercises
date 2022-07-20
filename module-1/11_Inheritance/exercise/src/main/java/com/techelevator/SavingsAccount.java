package com.techelevator;

public class SavingsAccount extends BankAccount {



    //default constructor
    //public SavingsAccount() {}

    //constructors
    //constructor is public and name is same as the Class
    //Variables are the same as the Super Class constructor BankAccount
    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }
    //constructor is public and name is same as the Class
    //Variables are the same as the Super Class constructor BankAccount
    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    //Overridden withdraw method for SavingsAccount
   @Override
   //method is public, return type is int, method name is withdraw, amountToWithdraw parameter is passed as an int variable through the method
    public int withdraw(int amountToWithdraw){

        //if the amountToWithdraw plus 2 is greater than the balance.. do this
        if(amountToWithdraw + 2 > getBalance()){
            //assign amountToWithdraw int var to 0
            amountToWithdraw =0;
            //else if the balance minus the amount to withdraw is less than 150. do this..
        } else if(getBalance()-amountToWithdraw < 150){
            //add 2 to the amountToWithdraw
            amountToWithdraw += 2;
        }
       //returns the code in the corresponding Bank Account method
       //super can be used to call parent class' variables and methods.
       //Calls on the BankAccount (super class) withdraw method by passing in the updated amountToWithdraw var
        return super.withdraw(amountToWithdraw);
   }
}
