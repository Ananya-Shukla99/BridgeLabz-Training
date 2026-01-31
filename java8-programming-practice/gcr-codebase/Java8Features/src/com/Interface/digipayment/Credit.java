package com.Interface.digipayment;

public class Credit implements Payable{

	 public void pay(double amount) {
	        System.out.println("Paid " + amount + " using Credit Card");
	    }
}
