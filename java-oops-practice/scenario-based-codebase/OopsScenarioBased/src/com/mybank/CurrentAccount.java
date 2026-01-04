package com.mybank;

public class CurrentAccount extends Account {
	
	CurrentAccount(String accountNumber , double balance){
		super(accountNumber, balance);
	}

	@Override
    public double calculateInterest() {
        return 0; // no interest
    }
}
