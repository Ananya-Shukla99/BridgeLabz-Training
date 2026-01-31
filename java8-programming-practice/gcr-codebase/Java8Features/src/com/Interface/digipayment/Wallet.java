package com.Interface.digipayment;

public class Wallet implements Payable{

	public void pay(double amount) {
        System.out.println("Paid " + amount + " using Wallet");
    }
}
