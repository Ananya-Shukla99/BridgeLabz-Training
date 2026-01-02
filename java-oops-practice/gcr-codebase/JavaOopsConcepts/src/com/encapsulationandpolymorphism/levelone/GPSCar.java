package com.encapsulationandpolymorphism.levelone;

public class GPSCar extends GPSVehicle implements GPS{

    private static final double BASE_FARE = 50.0;

    public GPSCar(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm, currentLocation);
    }

    @Override
    public double calculateFare(double distance) {
        return BASE_FARE + (ratePerKm * distance);
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
