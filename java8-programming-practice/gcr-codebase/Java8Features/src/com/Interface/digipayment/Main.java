package com.Interface.digipayment;

public class Main {

	public static void main(String[] args) {

		// Creating Payment objects
		Payable p1 = new UPI();
		Payable p2 = new Credit();
		Payable p3 = new Wallet();

		//Calling methods 
		p1.pay(500);
		p2.pay(1200);
		p3.pay(300);
	}
}
