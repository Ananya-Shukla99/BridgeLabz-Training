package com.defaultmethod.vehicledashboard;

public class ElectricCar implements Vehicle {

    public void displaySpeed() {
        System.out.println("Electric car speed: 40 km/h");
    }

    @Override
    public void displayBatteryStatus() {
        System.out.println("Battery level: 75%");
    }
}