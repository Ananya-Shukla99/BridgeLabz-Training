package com.generics.onlinemarketplace;

public class Books implements Category {
	public double minPrice() {
		return 5.0;
	}

	public double maxPrice() {
		return 50.0;
	}

	@Override
    public String toString() {
    	return "Book";
    }
}
