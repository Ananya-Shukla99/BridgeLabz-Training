package com.constructor.levelone;

public class ProductMain {
    
	public static void main(String[]args) {
		
		//creating the object
		Product p1=new Product("Laptop", 1, 90000);
		Product p2=new Product("Car", 5, 900000);
		Product p3=new Product("Cycle", 4, 5000);
		Product p4=new Product("Toy", 5, 500);
		
		//displaying the details
		p1.displayProductDetails();
		p2.displayProductDetails();
		p3.displayProductDetails();
		p4.displayProductDetails();
		
		//displaying the total cost
		p1.displayTotalProducts();
		p2.displayTotalProducts();
		p3.displayTotalProducts();
		p4.displayTotalProducts();
	}
}

