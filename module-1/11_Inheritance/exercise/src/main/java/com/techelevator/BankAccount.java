package com.techelevator;

public class BankAccount {

    //instance vars

    private String accountHolderName;
    private String accountNumber;
    private int balance;

    public BankAccount() {}

    public BankAccount(String accountHolderName, String accountNumber) {

        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        balance = 0;
    }

    public BankAccount(String accountHolderName, String accountNumber, int balance) {

        this.accountHolderName = accountHolderName;
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
        balance += amountToDeposit; // adds a deposit to balance
        return balance;
    }

    public int withdraw(int amountToWithdraw) {
        balance -= amountToWithdraw; // subtracts a withdraw from balance
        return balance;
    }

}

