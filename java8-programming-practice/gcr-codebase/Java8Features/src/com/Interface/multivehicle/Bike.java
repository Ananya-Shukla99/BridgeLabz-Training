package com.Interface.multivehicle;

public class Bike extends Vehicle {

	public Bike() {
		super("Bike");
	}

	public void rent() {
		System.out.println("Renting a Bike !");
	}
	
	public void returnVehicle() {
		System.out.println( "Bike is returned back !");
	}
}
