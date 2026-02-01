package com.stream.transformingnames;

public class Customer {

	String name;
	Double amount;

	public Customer(String name, Double amount) {
		this.name = name;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", amount=" + amount + "]";
	}

}
