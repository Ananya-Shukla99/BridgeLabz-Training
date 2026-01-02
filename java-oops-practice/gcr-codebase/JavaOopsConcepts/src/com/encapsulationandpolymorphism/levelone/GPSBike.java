package com.encapsulationandpolymorphism.levelone;
public class GPSBike extends GPSVehicle implements GPS
{

    private static final double BASE_FARE = 20.0;

    public GPSBike(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm, currentLocation);
    }

    @Override
    public double calculateFare(double distance) {
        return BASE_FARE + (ratePerKm * distance * 0.9);
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
