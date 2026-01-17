package com.sortingalgorithms.fleetmanager;

public class Main {

	public static void main(String[] args) {

		Vehicle[] vehicle = { new Vehicle("BMW M4 competetion", 6), new Vehicle("HILUX", 5), new Vehicle("LC-300", 10),
				new Vehicle("Supra", 3), new Vehicle("Nissan GTR", 7) };

		
		System.out.println("Before sorting");
		for(Vehicle v: vehicle) {
			System.out.println(v);
		}
		System.out.println( );
		Depot.mergeSort(vehicle, 0, vehicle.length-1);
		
		System.out.println("After sorting");
		for(Vehicle v: vehicle) {
			System.out.println(v);
		}
	}
}
