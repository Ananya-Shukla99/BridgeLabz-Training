package com.lambda.ecommerce;

public class Product {

	String name;
	double price;
	double rating;
	double discount;
	
	//constructor
	public Product(String name, double price, double rating, double discount) {
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", rating=" + rating + ", discount=" + discount + "]";
	}
	
	
}
