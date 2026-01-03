package com.hospitalpatientmanagementsystem;

public class Main {

	//main method
	public static void main(String[] args) {

		//creating patient objects
        Patient p1 = new InPatient(101, "Alice", 5);
        Patient p2 = new OutPatient(102, "Bob", "10-Jan-2026");

        //creating doctor object
        Doctor d1 = new Doctor(1, "Dr. Smith", "Cardiology");

        Bill bill = new Bill(10000);

        //Calling methods  
        p1.displayInfo(); 
        p2.displayInfo();
        d1.displayInfo();

        System.out.println("Total Bill Amount: ₹" + bill.calculatePayment());
    }
}
