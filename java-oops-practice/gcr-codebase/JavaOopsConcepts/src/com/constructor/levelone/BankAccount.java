package com.constructor.levelone;

public class BankAccount {

	public int accountNumber;
	protected String accountHolder;
	private double balance;
	
	//constructor
	public BankAccount(int accountNumber, String accountHolder, double balance) {
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
	public BankAccount() {
		//default
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
	    if (amount > 0) {
	        balance += amount;
	    } 
	    else {
	        System.out.println("Invalid deposit amount");
	    }
	}

	public void withdraw(double amount) {
	    if (amount > 0 && amount <= balance) {
	        balance -= amount;
	    } 
	    else {
	        System.out.println("Invalid or insufficient balance");
	    }
    }
}
