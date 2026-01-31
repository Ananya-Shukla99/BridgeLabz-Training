package com.Interface.multivehicle;

public class Main {

	public static void main(String []args) {
		
		//Vehicle objects
		Vehicle v = new Bus();
		Vehicle v2= new Bike();
		Vehicle v3= new Car();
		
		//Bus methods
		v.rent();
		v.returnVehicle();
		
		//Bike method
		v2.rent();
		v2.returnVehicle();
		
		//Car method 
		v3.rent();
		v3.returnVehicle();
	}
}
