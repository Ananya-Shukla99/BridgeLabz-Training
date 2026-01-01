package com.Inheritance.leveltwo;

public class PetrolVehicle extends Vehicle implements Refuelable
{

	 public PetrolVehicle(int maxSpeed,String model) {
	        super(maxSpeed, model);
	    }

	    @Override
	    public void refuel() {
	        System.out.println("Refueling the petrol vehicle...");
	    }
}
