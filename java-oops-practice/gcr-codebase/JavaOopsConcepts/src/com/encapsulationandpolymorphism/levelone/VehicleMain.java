package com.encapsulationandpolymorphism.levelone;

import java.util.ArrayList;
import java.util.List;

public class VehicleMain {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR123", 1000, "CAR-INS-001"));
        vehicles.add(new Bike("BIKE456", 300, "BIKE-INS-002"));
        vehicles.add(new Truck("TRUCK789", 2000, "TRUCK-INS-003"));

        int rentalDays = 5;

        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Rental Cost: " + vehicle.calculateRentalCost(rentalDays));

            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println("Insurance Cost: " + insurable.calculateInsurance());
                System.out.println(insurable.getInsuranceDetails());
            }

            System.out.println("----------------------------------");
        }
    }
}
