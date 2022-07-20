package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer  {

    //instance vars
    private String name;
    private String address;
    private String phoneNumber;

    //the new keyword sets aside memory to hold an instance of an ArrayList
    //constructor () is invoked to initialize the instance to an empty list of the type used, in this case a list of Accountables.
    //The address of the new instance is assigned to the account variable
    private List<Accountable> accounts = new ArrayList<>();

    //constructor needed to initialize the instance variables
    public BankCustomer(String name, String address, String phoneNumber, List<Accountable> accounts){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.accounts = accounts;
    }

    //defined default constructor because the above constructor was needed
    //If you define another constructor (with arguments), default constructor will not be generated. If you still want one, you need to define it yourself.
    public BankCustomer() {}

    //getters
    //getter have a return type but do not have parameters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Accountable[] getAccounts() {
        //Created new instance var accountList (Accountable Interface Class)
        //.toArray method returns an array containing all the elements in this list in proper sequence (from first to last element);
        //.size() method returns the # of elements in the list
        //assigned accountsList (Accountable array) to all the accounts in the new Accountable List
        Accountable [] accountsList = accounts.toArray(new Accountable[accounts.size()]);
        //returns an array of the customers accounts
        return accountsList;
    }

    //setters
    //return type is void since setter do not return anything
    //setters have parameters and set the parameter to the current instance of that variable
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //methods
    //public method, return type is void, method name is addAccount
    //instance variable is newAccount which is an Accountable Interface Class
    public void addAccount(Accountable newAccount){
        //adds newAccount to the customer's list of accounts
        //.add = Appends the specified element to the end of this list
        accounts.add(newAccount);
    }
    //method is public, return type is boolean, name = isVip()
    public boolean isVip() {

        int totalAccountBalance = 0; // holds the value of the combine account balances
        int vipSpecial = 25000; // holds the value of the minimum amount needed to be a VIP
        //for loop that is initialized at 0, condition is set to loop for the # of elements in the list,
        //and add +1 to i after each loop until the condition is met
        //.size() = Returns the number of elements in this list.
        for (int i = 0; i < accounts.size(); i++) {
            //each time this loops through it will add the current indexes account balance to the totalAccountBalance variable... so
            //it can be run against the second if condition (below) of whether or not the balance is over 25k
            totalAccountBalance += accounts.get(i).getBalance(); // add the account balances to total
        }
        //if the (current indexes) total account balance is greater than or equal to 25k.. then return true.. if it's not then return false..
        if (totalAccountBalance >= vipSpecial) {
            return true;
        } else {
            return false;
        }
    }
}




