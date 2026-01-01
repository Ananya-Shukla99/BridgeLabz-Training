package com.Inheritance.levelone;

public class VehicleMain
{

	public static void main(String[] args) 
	{
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 15.5);
        vehicles[2] = new Motorcycle(160, "Petrol", false);

        for (Vehicle vehicle : vehicles)
        {
        	
            vehicle.displayInfo(); 
        }
    }
}
