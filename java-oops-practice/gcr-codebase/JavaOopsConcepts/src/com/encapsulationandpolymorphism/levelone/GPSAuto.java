package com.encapsulationandpolymorphism.levelone;

public class GPSAuto extends GPSVehicle implements GPS {

    private static final double BASE_FARE = 30.0;

    public GPSAuto(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm, currentLocation);
    }

    @Override
    public double calculateFare(double distance) {
        return BASE_FARE + (ratePerKm * distance * 1.1);
    }

    @Override
    public String getCurrentLocation() {
        return super.getCurrentLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        super.setCurrentLocation(newLocation);
    }
}
