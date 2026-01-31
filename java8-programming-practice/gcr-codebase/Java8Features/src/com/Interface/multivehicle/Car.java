package com.Interface.multivehicle;

public class Car extends Vehicle {

	public Car() {
		super("Car");
	}

	public void rent() {
		System.out.println("Renting a Car !");
	}
	
	public void returnVehicle() {
		System.out.println( "Car is returned back !");
	}
}
