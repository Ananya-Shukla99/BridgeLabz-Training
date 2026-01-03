package com.ewalletapplication;

import java.util.ArrayList;
import java.util.List;

public class Wallet implements Transferrable {

	// Private fields - data encapsulation
    private double balance; 
    protected List<Transaction> transactions;

    //Constructor
    public Wallet() {
        balance = 0;
        transactions = new ArrayList<>();
    }

    //methods for Wallet
    public Wallet(double referralBonus) {
        this();
        balance += referralBonus;
        transactions.add(new Transaction("Referral Bonus", referralBonus));
    }

    //public getter for balance
    public double getBalance() {
        return balance;
    }

    //methods for loadMone
    public void loadMoney(double amount) {
        balance += amount;
        transactions.add(new Transaction("Load Money", amount));
    }

    //methods for Transfer
    protected boolean canTransfer(double amount) {
        return balance >= amount;
    }

    //method for deduct
    protected void deduct(double amount) {
        balance -= amount;
    }

    //method for show transaction
    public void showTransactions() {
        for (Transaction t : transactions) {
            System.out.println(t.getDetails());
        }
    }

    //method overriding 
    @Override
    public void transferTo(User receiver, double amount) {

    }
}
