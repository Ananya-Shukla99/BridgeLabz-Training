package com.parkease;

public abstract class Vehicle implements IPayable {

    protected String vehicleNumber;
    protected double baseRate;

    public Vehicle(String vehicleNumber, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.baseRate = baseRate;
    }


    @Override
    public abstract double calculateCharges(int hours, boolean overtime);
}
