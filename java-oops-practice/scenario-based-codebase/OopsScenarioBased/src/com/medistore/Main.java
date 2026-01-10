package com.medistore;

import java.time.LocalDate;

public class Main {

	public static void main(String[]arge) {

		//object creation
		ISellable med1 = new Tablet( "Paracetamol", 5.0,LocalDate.of(2027, 5, 10) );

        ISellable med2 = new Syrup("Cough Syrup", 120.0, LocalDate.of(2026, 3, 15) );

        ISellable med3 = new Injection("Insulin", 350.0, LocalDate.of(2025, 12, 1));
        
        //selling medicines
        System.out.println("Selling 10 tablets:");
        System.out.println("Total: ₹" + med1.sell(10));

        System.out.println("\nSelling 2 bottles of syrup:");
        System.out.println("Total: ₹" + med2.sell(2));

        System.out.println("\nSelling 1 injection:");
        System.out.println("Total: ₹" + med3.sell(1));

        System.out.println("\nExpiry Status:");
        System.out.println("Tablet expired? " + med1.checkExpiry());
        System.out.println("Syrup expired? " + med2.checkExpiry());
        System.out.println("Injection expired? " + med3.checkExpiry());
	}
	
}
