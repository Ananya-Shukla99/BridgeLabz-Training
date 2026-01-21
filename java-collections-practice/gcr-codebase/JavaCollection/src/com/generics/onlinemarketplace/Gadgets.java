package com.generics.onlinemarketplace;

public class Gadgets implements Category {

	public double minPrice() {
		return 100.0;
	}

	public double maxPrice() {
		return 3000.0;
	}
	
	public String toString() {
    	return "Gadgets";
    }
}
