package com.foodloop;

public abstract class FoodItem {

	//attribute
	public String name;
	protected String category;
	public double price;
	private int availability;
	
	//constructor
	public FoodItem(String name, String category, double price) {
		this.name = name;
		this.category = category;
		this.price = price;
	}
	

	//getter
	public int getAvailability() {
		return availability;
	}
	
	public void reduceStock()
	{ availability--; }
	//setter
	public void setAvailability(int availability) {
		this.availability=availability;
	}
	
	public abstract double applyDiscount();
}