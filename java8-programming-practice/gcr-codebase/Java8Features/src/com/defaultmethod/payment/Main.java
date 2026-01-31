package com.defaultmethod.payment;

public class Main {

	public static void main(String[]args) {
		
		// Interface object
		PaymentProcessor p= ()->System.out.println("Payment object is created");
		
		// calling default method for payment and refund
		p.payment(200);
		
		p.payment(5000);
		
		p.refund(200);
		
		p.refund(5000);
	}
	
}
