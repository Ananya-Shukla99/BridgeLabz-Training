package com.onlinemarketplace;

public class Main {

	public static void main(String[] args) {

		Product<Books> book = new Product<>("Java Guide", 30, new Books());

		Product<Clothing> shirt = new Product<>("T-Shirt", 50, new Clothing());

		Product<Gadgets> phone = new Product<>("Smartphone", 500, new Gadgets());

		ProductCatalog catalog = new ProductCatalog();
		catalog.addProduct(book);
		catalog.addProduct(shirt);
		catalog.addProduct(phone);

		Discount.applyDiscount(book, 10);
		Discount.applyDiscount(phone, 20);

		catalog.showCatalog();

	}
}
