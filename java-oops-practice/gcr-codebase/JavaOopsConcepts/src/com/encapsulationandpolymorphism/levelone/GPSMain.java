package com.encapsulationandpolymorphism.levelone;

import java.util.ArrayList;
import java.util.List;

public class GPSMain{

    public static void main(String[] args) {

        List<GPSVehicle> vehicles = new ArrayList<>();

        vehicles.add(new GPSCar("C100", "Alice", 15, "Downtown"));
        vehicles.add(new GPSBike("B200", "Bob", 10, "Uptown"));
        vehicles.add(new GPSAuto("A300", "Charlie", 12, "Midtown"));

        double distance = 10; 

        for (GPSVehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails());

            double fare = vehicle.calculateFare(distance);
            System.out.println("Calculated Fare for " + distance + " km: " + fare);

            if (vehicle instanceof GPS) {
                GPS gpsVehicle = (GPS) vehicle;
                System.out.println("Current Location: " + gpsVehicle.getCurrentLocation());
                gpsVehicle.updateLocation("New Location");
                System.out.println("Updated Location: " + gpsVehicle.getCurrentLocation());
            }

            System.out.println("--------------------------------");
        }
    }
}
