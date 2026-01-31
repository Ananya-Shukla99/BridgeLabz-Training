package com.defaultmethod.payment;

@FunctionalInterface
public interface PaymentProcessor {

	void payment();
	default void payment(double price) {
		System.out.println("Payment successful of rupees : "+ price);
	}
	default void refund(double price) {
		
		System.out.println("Refund for the lat transaction of rupees: "+price);
		
	}
}
