package com.parkease;

public class Truck extends Vehicle {

    public Truck(String vehicleNumber) {
        super(vehicleNumber, 100);
    }

    @Override
    public double calculateCharges(int hours, boolean overtime) {
        double penalty = overtime ? 200 : 0;
        return (baseRate * hours) + penalty;
    }
}
