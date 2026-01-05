package com.groceryshoppingapp;

public class NonPerishableProduct extends Product{
	
	public NonPerishableProduct(String name, double price) {
		super(name, price, "NonPerishable" );
	}
	
	@Override
	public double applyDiscount(double amount) {
		return amount*0.95;
	}
}