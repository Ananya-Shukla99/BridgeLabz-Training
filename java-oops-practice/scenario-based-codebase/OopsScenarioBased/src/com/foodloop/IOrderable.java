package com.foodloop;

import java.util.ArrayList;

public interface IOrderable {

	void placeOrder(ArrayList<FoodItem> list);
	void cancelOrder(FoodItem item);
	
}
