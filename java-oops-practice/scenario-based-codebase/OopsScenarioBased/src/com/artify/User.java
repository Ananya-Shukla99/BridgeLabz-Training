package com.artify;

public class User {

	//attributes
	private String name;
	private double walletBalance;
	
	//constructor
	public User(String name, double walletBalance) {
		this.name = name;
		this.walletBalance = walletBalance;
	}

	public double getWalletBalance() {
		return walletBalance;
	}
	public String getName() {
	        return name;
	}
	
	public void deduct(double price) {
		walletBalance-=price;
		System.out.println("Transfer successful !");
	}
}