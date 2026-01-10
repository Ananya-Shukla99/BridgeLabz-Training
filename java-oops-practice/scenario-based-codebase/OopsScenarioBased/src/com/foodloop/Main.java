package com.foodloop;

import java.util.*;

public class Main {

	public static void main(String []args) {
		
		//creating food item objects
		FoodItem f= new VegItem("Pizza", "Veg", 500);
		FoodItem f2= new VegItem("Momos", "Veg", 200);
		FoodItem f3= new VegItem("Maggi", "Veg", 50);
		FoodItem f4= new NonVegItem("Masala Chicken", "Veg", 500);
		
		//order list
		ArrayList<FoodItem>list=new ArrayList<>();
		//adding the food item
		list.add(f);
		list.add(f2);
		list.add(f3);
		list.add(f4);
		
		Order o=new Order(list);
		
		System.out.println("Placing order...");
	    o.placeOrder(list);

	    System.out.println("\nCancelling one item...");
	    o.cancelOrder(f2);

	    System.out.println("\nUpdated Order:");
        o.placeOrder(list);
	}
}
