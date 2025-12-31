package com.designprinciples.levelone;

import java.util.ArrayList;

public class Customer
{

	private String name;
    private ArrayList<Account>accounts;

    public Customer(String name) 
    {
        this.name = name;
        accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() 
    {
        System.out.println("Balances for " + name + ":");
        
        for (Account acc : accounts)
        {
            System.out.println("Bank: " + acc.getBankName() + ", Balance: " + acc.getBalance());
        }
        System.out.println();
    }
}
