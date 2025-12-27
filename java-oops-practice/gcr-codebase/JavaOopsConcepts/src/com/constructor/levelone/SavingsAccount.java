package com.constructor.levelone;

public class SavingsAccount extends BankAccount{
	
	public SavingsAccount (int accountNumber, String accountHolder,double balance) {
		super(accountNumber, accountHolder, balance);
	}
	
	public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);  // public
        System.out.println("Account Holder : " + accountHolder);  // protected
        System.out.println("Balance : " + getBalance());   // private via method
    }

}
