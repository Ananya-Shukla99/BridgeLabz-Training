package com.Interface.multivehicle;

public class Bus extends Vehicle {

	public Bus() {
		super("Bus");
	}

	public void rent() {
		System.out.println("Renting a Bus !");
	}
	
	public void returnVehicle() {
		System.out.println( "Bus is returned back !");
	}
}
