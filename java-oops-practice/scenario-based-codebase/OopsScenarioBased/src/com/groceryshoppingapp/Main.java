package com.groceryshoppingapp;

public class Main {
	//main method 
    public static void main(String[] args) {

        Product milk = new PerishableProduct("Milk", 50);
        Product rice = new NonPerishableProduct("Rice", 100);

        Cart cart = new Cart();
        cart.addProduct(milk);
        cart.addProduct(rice);

        cart.applyDiscount(10); 
        cart.generateBill();
    }
}