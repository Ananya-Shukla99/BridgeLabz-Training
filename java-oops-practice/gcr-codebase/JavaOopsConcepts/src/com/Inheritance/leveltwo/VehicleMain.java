package com.Inheritance.leveltwo;

public class VehicleMain {

	public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle(225, "Tesla Model 3");
        ev.displayInfo();
        ev.charge();

        System.out.println();

        PetrolVehicle pv = new PetrolVehicle(180, "Honda City");
        pv.displayInfo();
        pv.refuel();
    }
}
