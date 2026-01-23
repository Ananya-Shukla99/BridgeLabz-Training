package com.sortingalgorithms.tailorshop;

public class Order {

	//attributes
	protected int orderID;
	protected int deadline;// in days left to deliver 
	
	//constructor
	public Order(int orderID, int deadline) {
		this.orderID = orderID;
		this.deadline = deadline;
	}
	
}
