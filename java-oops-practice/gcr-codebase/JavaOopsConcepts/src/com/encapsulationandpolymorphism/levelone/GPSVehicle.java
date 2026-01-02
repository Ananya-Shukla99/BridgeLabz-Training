package com.encapsulationandpolymorphism.levelone;

public abstract class GPSVehicle {

    private String vehicleId;
    private String driverName;
    protected double ratePerKm;  
    private String currentLocation;

    public GPSVehicle(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = currentLocation;
    }


    public abstract double calculateFare(double distance);


    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId +", Driver: " + driverName +", Rate per Km: " + ratePerKm +", Current Location: " + currentLocation;
    }


    protected void setCurrentLocation(String location) {
        this.currentLocation = location;
    }

    protected String getCurrentLocation() {
        return currentLocation;
    }
}
