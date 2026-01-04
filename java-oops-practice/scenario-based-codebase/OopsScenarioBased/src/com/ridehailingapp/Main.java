package com.ridehailingapp;

public class Main {

	//main method 
	public static void main(String[] args) {

		//objects of driver class
        Driver driver = new Driver("Amit", "DL1234", 4.5);
        Vehicle car = new Mini("KA01AB1234");

        
        System.out.println("Driver: " + driver.name);
        
        //displaying ride details
        User ride = new User(car);
        ride.bookRide(10);
        ride.endRide();
    }
}
