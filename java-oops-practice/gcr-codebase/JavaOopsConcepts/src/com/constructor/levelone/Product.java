package com.constructor.levelone;

public class Product {
	
	// Attributes
	String productName;
	int quantity;
	double price;
	
	//constructor
    public Product(String productName, int quantity, double price) {
    	this.productName=productName;
    	this.quantity=quantity;
    	this.price=price;
    }
    //display method
    public void displayProductDetails() {
    	System.out.println("Product : "+ this.productName );
    	System.out.println("Quantity : "+ this.quantity );
    	System.out.println("Price : "+ this.price );
    }
    //method to calculate total cost
    public void displayTotalProducts() {
    	System.out.println("The total cost will be :" +(this.quantity * this.price) );
    }
}
