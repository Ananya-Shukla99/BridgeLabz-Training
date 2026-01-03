package com.vehiclerentalapplication;

public class Truck extends Vehicle {

	//field 
	double loadCharge = 500;

	//constructor 
    Truck(String id, String brand, int rent) {
        super(id, brand, rent);
    }

    //Methods for Overriding 
    @Override
    public double calculateRent(int days) {
        return (rent * days) + loadCharge;
    }
}
