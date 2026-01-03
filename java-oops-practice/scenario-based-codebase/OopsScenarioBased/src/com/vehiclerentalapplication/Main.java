package com.vehiclerentalapplication;

public class Main {

	//Main method
	public static void main(String[] args) {

		//Creating object
        Customer c1 = new Customer(1, "Rahul");

        //creating sub class object
        Vehicle bike = new Bike("B101", "Yamaha", 300);
        Vehicle car = new Car("C201", "Honda", 1500);
        Vehicle truck = new Truck("T301", "Tata", 2500);

        //calling methods
        c1.rentVehicle(bike, 2);
        c1.rentVehicle(car, 3);
        c1.rentVehicle(truck, 1);
    }
}
