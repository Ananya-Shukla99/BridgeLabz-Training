package com.generics.onlinemarketplace;

public class Clothing implements Category {

	public double minPrice() {
		return 10.0;
	}

	public double maxPrice() {
		return 200.0;
	}
	
	public String toString() {
    	return "Clothing";
    }
}

