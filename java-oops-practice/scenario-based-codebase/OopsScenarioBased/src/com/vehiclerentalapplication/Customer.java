package com.vehiclerentalapplication;

public class Customer {

	//private field- for encapsulation
	private int customerId;
    private String name;

    //constructor 
    Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    //method for rent calculation
    public void rentVehicle(Vehicle v, int days) {
    	
        System.out.println(name + " rented " + v.getType());
        System.out.println("Total Rent: ₹" + v.calculateRent(days));
    }
    
    //getter method 
    public int getCustomerId() {
    	return customerId;
    	
    }
}
