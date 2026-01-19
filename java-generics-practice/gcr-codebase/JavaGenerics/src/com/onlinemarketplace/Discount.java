package com.onlinemarketplace;

public class Discount {

	public static <T extends Product <?>>  void applyDiscount(T product, double percentage) {
		
		double discountrdPrice= product.getPrice()* (1 - percentage / 100);
		
		product.setPrice(discountrdPrice);
	}
}
