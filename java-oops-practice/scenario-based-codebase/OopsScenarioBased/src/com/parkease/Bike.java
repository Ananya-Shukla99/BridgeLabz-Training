package com.parkease;

public class Bike extends Vehicle {

    public Bike(String vehicleNumber) {
        super(vehicleNumber, 20);
    }

    @Override
    public double calculateCharges(int hours, boolean overtime) {
        double penalty = overtime ? 40 : 0;
        return (baseRate * hours) + penalty;
    }
}
