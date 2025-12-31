package com.designprinciples.levelone;

public class Account {

	private Bank bank;
    private Customer customer;
    private double balance;

    public Account(Bank bank, Customer customer, double balance) 
    {
        this.bank = bank;
        this.customer = customer;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getBankName() 
    {
        return bank.getBankName();
    }
    
}
