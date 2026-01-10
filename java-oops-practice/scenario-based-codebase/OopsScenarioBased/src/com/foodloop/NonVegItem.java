package com.foodloop;

public class NonVegItem extends FoodItem{

	protected double discount=0.05;
	
	//constructor
	public NonVegItem(String name, String category, double price) {
		super(name, "NonVeg", price);
	}
	
	public double applyDiscount() {
		return price-(price*discount);
	}
	
}
