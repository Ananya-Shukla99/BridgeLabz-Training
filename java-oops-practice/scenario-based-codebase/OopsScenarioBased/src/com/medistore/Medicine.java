package com.medistore;

import java.time.LocalDate;

public abstract class Medicine implements ISellable {

	//attributes
	private String name;
	private double price;
	private LocalDate expiryDate;//in days
	private int quantity;
    
	//for default quantity
	public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 10); 
    }
    //constructor
	public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
		this.name = name;
		this.price = price;
		this.expiryDate= expiryDate;
		this.quantity = quantity;
	}
    
	//getter
	protected LocalDate getExpiryDate() {
	    return expiryDate;
	}
	
	//price calculation
	protected double calculateTotal(int qty) {
		return price*qty;
	}
	
	//selling method 
	public double sell(int qty) {
	    if (qty > quantity) {   
	        throw new RuntimeException("Not enough stock");
	    }

	    quantity -= qty;       // stock adjustment
	    return calculateTotal(qty);
	}

	//abstract method 
	public abstract boolean checkExpiry();

}
