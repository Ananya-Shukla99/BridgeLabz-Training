package com.groceryshoppingapp;

public abstract class Product {

	//attribute
	private String name;
	private double price;
	public String category;
	
	//constructor
	public Product(String name, double price, String category) {
		this.name=name;
		this.price=price;
		this.category=category;
	}
	
	public abstract double applyDiscount(double amount);
	
	public double getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
	
}
