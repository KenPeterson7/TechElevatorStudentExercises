package com.techelevator;

public class CheckingAccount extends BankAccount{

    //constructors
    public CheckingAccount(String accountHolderName, String accountNumber){
        super(accountHolderName, accountNumber);

    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance){
        super(accountHolderName, accountNumber, balance);
    }

    //default constructor
    //public CheckingAccount() {}

    //Overridden withdraw method
    @Override
    public int withdraw(int amountToWithdraw) {
        if(getBalance() - amountToWithdraw < 0 && getBalance() - amountToWithdraw > -100){
            amountToWithdraw += 10;
        } else if(getBalance() - amountToWithdraw <= -100){
            amountToWithdraw = 0;
        }
        return super.withdraw(amountToWithdraw);
    }
}
