package com.techelevator;

public class SavingsAccount extends BankAccount {



    //default constructor
    //public SavingsAccount() {}

    //constructors
    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    //method
   @Override
    public int withdraw(int amountToWithdraw){

        if(amountToWithdraw + 2 > getBalance()){
            amountToWithdraw =0;
        } else if(getBalance()-amountToWithdraw < 150){
            amountToWithdraw += 2;

        }
        return super.withdraw(amountToWithdraw);
   }

}
