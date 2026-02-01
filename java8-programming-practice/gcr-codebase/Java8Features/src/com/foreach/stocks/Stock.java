package com.foreach.stocks;

public class Stock {

	String name;
	Double price;

	public Stock(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Stock [name=" + name + ", price=" + price + "]";
	}
}
