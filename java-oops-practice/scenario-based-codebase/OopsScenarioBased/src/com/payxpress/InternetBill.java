package com.payxpress;

public class InternetBill extends Bill {

	public InternetBill(double amount) {
		super("Internet", amount);
		this.penaltyRate = 0.07;
	}

	@Override
	public void sendReminder() {
		System.out.println(" Internet Reminder: Stay connected, pay your bill!");
	}
}