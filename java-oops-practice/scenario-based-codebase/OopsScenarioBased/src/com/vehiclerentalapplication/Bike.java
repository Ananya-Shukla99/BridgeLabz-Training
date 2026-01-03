package com.vehiclerentalapplication;

public class Bike extends Vehicle {
	
	//constructor
	Bike (String id, String type , int rent){
		super(id,type, rent);
	}
	
	//Overriding methods 
	@Override
	public double calculateRent(int days) {
		return rent* days;
	}

}
