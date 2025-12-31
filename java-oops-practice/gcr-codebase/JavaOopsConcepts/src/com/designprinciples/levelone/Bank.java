package com.designprinciples.levelone;

import java.util.ArrayList;

public class Bank {

	    private String bankName;
	    private ArrayList<Account> accounts;

	    public Bank(String bankName) {
	        this.bankName = bankName;
	        accounts = new ArrayList<>();
	    }

	   
	    public String getBankName() {
	        return bankName;
	    }
	    
	    public Account openAccount(Customer customer, double initialBalance) 
	    {
	        Account account = new Account(this, customer, initialBalance);
	        accounts.add(account);
	        customer.addAccount(account);

	        System.out.println("Account opened for " + customer.getName() + " in " + bankName);
	        
	        return account;
	    }
}
