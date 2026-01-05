package com.groceryshoppingapp;

import java.util.*;

public class Cart implements ICheckout{

	//attribute
	public double totalPrice;
    public ArrayList<Product> products;
    
    //constructor
    public Cart(){
    	this.totalPrice=0.0;
        products=new ArrayList<>();
    }
    //for pre-selected item
    public Cart(ArrayList<Product> products) {
    	this.products=products;
    	calculateTotal();
    }
    
    //update price
    public void calculateTotal() {
    	totalPrice=0;
    	for(Product p:products) {
    		totalPrice+=p.getPrice();
    	}
    } 
    
    public void addProduct(Product p) {
    	products.add(p);
    	calculateTotal();
    }
    
    public void applyDiscount(double coupon) {
        double discountedTotal = totalPrice;
        
        for (Product p : products) {
            discountedTotal = p.applyDiscount(discountedTotal);
        }

        totalPrice = discountedTotal - coupon; 
    }

    @Override
    public void generateBill() {
    	
        System.out.println("SwiftCart Bill");
        for (Product p : products) {
            System.out.println(p.getName() + " - ₹" + p.getPrice());
        }
        System.out.println("Total Price: ₹" + totalPrice);
    }
    
    
}
