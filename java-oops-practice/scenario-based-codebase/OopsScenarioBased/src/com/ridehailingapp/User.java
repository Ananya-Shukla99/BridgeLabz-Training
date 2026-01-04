package com.ridehailingapp;

public class User implements IRideService{
	
	//fields for encapsulation
    private double fare;
    double baseFare = 50;
    Vehicle vehicle;

    //constructor 
    User(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    //method to calculate 
    public void bookRide(double distance) {
        fare = baseFare + distance * vehicle.rate;
        System.out.println("Ride booked in " + vehicle.type);
    }

    //method to end ride
    public void endRide() {
        System.out.println("Total Fare: " + fare);
    }
	
	
}
