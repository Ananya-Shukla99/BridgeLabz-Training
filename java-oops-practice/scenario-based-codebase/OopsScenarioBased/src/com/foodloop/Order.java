package com.foodloop;

import java.util.ArrayList;

public class Order implements IOrderable
{
	//attribute
    public FoodItem item;
	public ArrayList<FoodItem> list=new ArrayList<>();
	
	//constructor
	public Order ( ArrayList<FoodItem> list) {
		this.list=list;
	}
	
	public void addItem(FoodItem i) {
		list.add(i);
	}
	
	//methods
	double totalPrice;
	double discountedPrice;
	@Override
	public void placeOrder(ArrayList<FoodItem> list) {
		 totalPrice=0.0;
		 discountedPrice=0;
		for(FoodItem f:list) {
			totalPrice+=f.price;
	        discountedPrice+=f.applyDiscount();
		}
		System.out.println("Your order is placed ");
		System.out.println("Your total : "+totalPrice);
		System.out.println("Your total discounted price : "+discountedPrice);
	}

	//method
	@Override
	public void cancelOrder(FoodItem item) {
		if(list.contains(item)) {
			System.out.println("Your item is cancelled "+ item);
			item.setAvailability(item.getAvailability()+1);	
		}
		else {
			System.out.println("No items to cancel");
		}
	}

}
