package com.techelevator;

//CreditCardAccount Can-Do Accountable (getBalance) so we implement it
public class CreditCardAccount implements Accountable {

    //instance vars
    private String accountHolder;
    private String accountNumber;
    private int debt;

    //constructor w/ given variables
    public CreditCardAccount(String accountHolder, String accountNumber){
        //assigning what's in accountHolder to this instance of the accountHolder var
        this.accountHolder = accountHolder;
        //assigning what's in accountNumber to this instance of the accountNumber var
        this.accountNumber = accountNumber;
        //assign debt int var to 0
        debt = 0;
    }

    //getters
    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getDebt() {
        return debt;
    }

    //methods

    //This method has to be declared so the Accountable Interface can be implemented
    public int getBalance() {
        //simply returns the debt * negative.. it returns the number and turns it into a negative number
        //Ex. -(100) = -100
        return -(debt);
    }

    public int pay(int amountToPay) {
        //created new int var new debt that is equal to the current debt minus the amount to pay
        int newDebt = debt -= amountToPay;
        //just return the newDebt var
        return newDebt;
    }

    public int charge(int amountToCharge){
        //created new int var new charge that is equal to the current debt plus the amount to pay
         int newCharge = debt += amountToCharge;
         //just return the newCharge var
        return newCharge;
    }
}
