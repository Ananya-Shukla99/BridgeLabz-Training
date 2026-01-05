package com.groceryshoppingapp;

public class PerishableProduct extends Product{
	
	public PerishableProduct(String name, double price) {
		super(name, price, "Perishable" );
	}
	
	@Override
	public double applyDiscount(double amount) {
		return amount*0.90;
	}
}