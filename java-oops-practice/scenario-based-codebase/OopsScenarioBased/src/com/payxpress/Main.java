package com.payxpress;

public class Main {

	public static void main(String[] args) {

		Bill b1 = new ElectricityBill(1200);
		Bill b2 = new WaterBill(500);
		Bill b3 = new InternetBill(1500);

		Bill[] bills = { b1, b2, b3 };

		System.out.println("---- Sending Reminders ----");
		for (Bill b : bills) {
			b.sendReminder();
		}

		System.out.println("\n---- Paying Bills ----");
		for (Bill b : bills) {
			b.pay();
		}

		System.out.println("\n---- Re-paying Attempt ----");
		b1.pay(); 
	}
}