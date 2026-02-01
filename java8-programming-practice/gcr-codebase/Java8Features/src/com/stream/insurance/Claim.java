package com.stream.insurance;

public class Claim {

	String type;
	Double amount;

	public Claim(String type, Double amount) {
		this.type = type;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Claim [type=" + type + ", amount=" + amount + "]";
	}

}