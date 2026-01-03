package com.ewalletapplication;

public class Transaction {

	 // Private fields - data encapsulation
	 private String type;
	 private double amount;

	 //constructor
	 public Transaction(String type, double amount) {
	    this.type = type;
	    this.amount = amount;
	 }

	 // Public getter
	 public String getDetails() {
	     return type + " : " + amount;
	 }
}
