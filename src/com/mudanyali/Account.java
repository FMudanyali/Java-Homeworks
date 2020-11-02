package com.mudanyali;
/**
 * This account class has name and balance, along with setters and getters,
 * it can also add given amount to the balance, and transfer into other accounts.
 * @author Furkan Mudanyali
 * @version 1.0
 * @since 2020-10-25
 */
public class Account{
    private String firstName;
    private String lastName;
    private double balance;

    public Account(){}
    public Account(String firstName, String lastName, double balance){
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void deposit(double deposit){
        this.balance += deposit;
    }
    public void transfer(Account target, double deposit){
        target.deposit(deposit);
        this.balance -= deposit;
    }
    
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public double getBalance(){
        return balance;
    }
}