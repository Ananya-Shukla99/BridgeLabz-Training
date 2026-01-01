package com.Inheritance.levelone;

public class Vehicle {

	int  maxSpeed;
	String fuelType;
	
	public Vehicle(int maxSpeed, String fuelType) 
	{
		this.maxSpeed=maxSpeed;
		this.fuelType=fuelType;
	}
	
	public void displayInfo() 
	{
		System.out.println("MaxSpeed is "+ maxSpeed + "Km/h");
		System.out.println("Fule Type is "+ fuelType);
	}
}
