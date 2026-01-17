package com.sortingalgorithms.fleetmanager;

public class Vehicle {

	//attribute
	protected String name;
	protected int mileage;
	
	//constructor
	public Vehicle(String name, int mileage) {
		this.name = name;
		this.mileage = mileage;
	}
	
	public String toString () {
		return name + " - " + mileage;
	}
}
