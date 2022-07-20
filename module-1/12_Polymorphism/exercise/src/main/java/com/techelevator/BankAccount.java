package com.techelevator;

public class BankAccount implements Accountable {

    //instance vars
    private String accountHolderName;
    private String accountNumber;
    private int balance;

    //constructors
    public BankAccount(String accountHolder, String accountNumber) {
        this.accountHolderName = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public BankAccount(String accountHolder, String accountNumber, int balance) {
        this.accountHolderName = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //getters

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    //methods

    public int deposit(int amountToDeposit) {
        balance = balance + amountToDeposit;
        return balance;
    }

    public int withdraw(int amountToWithdraw) {
        balance = balance - amountToWithdraw;
        return balance;
    }


    //transferTo method is public, it's accessible outside the class, return type is an int
    //it holds instance variables destinationAccount (BankAccount Class) and transferAmount (int var)
    public int transferTo(BankAccount destinationAccount, int transferAmount){
        //assigned newBalance (int var) to the value of what the current balance is minus the transfer amount
        //this variable is needed to determine which condition it meets in the if-else statement
        int newBalance = this.getBalance() - transferAmount;
        //if statement that reads if the newBalance is less than 0.. do this..
        //assuming that you can't make a withdrawal when you have less than 0 in your account
        if(newBalance < 0) {
            //just return the current balance
            return this.getBalance();
            //else.. if the newBalance is greater than 0.. do this..
        } else{
            //withdraws the transfer amount from this account
            //It's going to take this transfer amount and run it through the withdrawal method defined above..
            //so it takes the balance and subtracts the amount to withdrawal (transfer amount) and returns the new balance
            this.withdraw(transferAmount);
            //deposits the transfer amount into the destination account
            //Takes the transfer amount and runs it through the deposit method defined above and then stores it in the destinationAccount BankAccount var
            //so it takes the balance and adds the amount to withdrawal (transfer amount), returns a new balance and stores it in destinationAccount
            destinationAccount.deposit(transferAmount);
        }
        //returns the current balance of the account
        return this.balance;
    }
}
