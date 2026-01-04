package com.mybank;

public class Account {

	//Private fields for encapsulation
	private String accountNumber;
	private double balance;
	
	//constructor
	Account (String accountNumber, double balance){
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	//getter
	public String getAccountNo() {
		return accountNumber;
	}
	
	//methods 
	public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double checkBalance() {
        return balance;
    }

    public double calculateInterest() {
        return 0;
    }
}
