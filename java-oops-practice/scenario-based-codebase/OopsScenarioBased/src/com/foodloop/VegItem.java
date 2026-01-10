package com.foodloop;

public class VegItem extends FoodItem{

	protected double discount=0.10;

	//constructor
	public VegItem(String name, String category, double price) {
		super(name, "Veg", price);
	}
	
	public double applyDiscount() {
		return price-(price*discount);
	}
	
}
