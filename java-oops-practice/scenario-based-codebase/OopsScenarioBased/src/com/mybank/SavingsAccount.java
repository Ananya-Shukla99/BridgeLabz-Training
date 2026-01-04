package com.mybank;

public class SavingsAccount  extends Account {

	SavingsAccount(String accountNumber , double balance){
		super(accountNumber, balance);
	}
	
	@Override
    public double calculateInterest() {
        int interestRate = 5;
        return checkBalance() * interestRate / 100;
    }

}
