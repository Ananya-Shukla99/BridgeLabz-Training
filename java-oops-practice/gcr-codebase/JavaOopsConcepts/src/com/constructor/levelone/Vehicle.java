package com.constructor.levelone;

public class Vehicle
{
    
	//Attributes
	String ownerName;
	String vehicleType;
	
	//class variable
    static int registrationFee =1000;
    
    //constructor
    public Vehicle (String ownerName, String vehicleType) {
    	this.ownerName=ownerName;
    	this.vehicleType=vehicleType;
    }
    //display method 
    public void displayVehicleDetails()
    {
    	System.out.println("Registration fees :"+ registrationFee);
    	System.out.println("Owner Name :"+ this.ownerName);
    	System.out.println("Vehicle Type :"+ this.vehicleType);
    }
    
    //method updateRegistrationFee() 
    public static void updateRegistrationFee(int newFees) {
    	registrationFee =newFees;
    }
}
