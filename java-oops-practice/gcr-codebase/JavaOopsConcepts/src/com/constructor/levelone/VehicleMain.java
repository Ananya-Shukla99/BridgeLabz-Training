package com.constructor.levelone;

public class VehicleMain {

	public static void main(String[]args) {
		
		//creating the objects
        Vehicle v1=new Vehicle("Ram", "Car");
        Vehicle v2=new Vehicle("Sammy", "Scooty");
        Vehicle v3=new Vehicle("Rom", "Bike");
        Vehicle v4=new Vehicle("Billy", "Truck");
        Vehicle v5=new Vehicle("Frank", "Car");
        
        //calling display method
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
       
        //updating
        Vehicle.updateRegistrationFee(5000); 
        
        //after updating 
        v3.displayVehicleDetails();
        v4.displayVehicleDetails();
        v5.displayVehicleDetails();
	}
}
