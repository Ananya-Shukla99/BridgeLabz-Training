package com.vehiclerentalapplication;

public class Vehicle implements Rentable {

	//Protected fields 
	protected String VehicleNumber;
	protected String type;
	protected int rent;
	
	//constructor 
	Vehicle(String VehicleNumber, String type, int rent){
		this.VehicleNumber=VehicleNumber;
		this.type=type;
		this.rent=rent;
	}
	
	//Public getter
	public String getType() {
		return type;
	}
	
	//Public getter
	public double getRent() {
		return rent;
	}
	
	//method to calculate rent 
	public double calculateRent(int days) {
		return rent*days;
	}
	
}
