package com.Inheritance.levelone;

public class Motorcycle extends Vehicle{

	 private boolean hasSidecar;

	    public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
	        super(maxSpeed, fuelType);
	        this.hasSidecar = hasSidecar;
	    }

	    @Override
	    public void displayInfo() 
	    {
	        System.out.println("Motorcycle Details:");
	        super.displayInfo();
	        System.out.println("Has Sidecar: " + hasSidecar);
	        System.out.println();
	    }
	    
}
