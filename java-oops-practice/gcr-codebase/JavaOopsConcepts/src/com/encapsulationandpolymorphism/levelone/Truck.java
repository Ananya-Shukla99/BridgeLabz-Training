package com.encapsulationandpolymorphism.levelone;

public class Truck extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days + 100; // Additional load charge
    }

    @Override
    public double calculateInsurance() {
        return 100.0;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + insurancePolicyNumber;
    }
}
