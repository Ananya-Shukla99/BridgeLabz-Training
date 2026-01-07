package com.parkease;

public class ParkingSlot {

    private int slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;
    private String location;

    private String bookingLog;

    public ParkingSlot(int slotId, String location, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.location = location;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    // Controlled access
    public boolean isAvailable() {
        return !isOccupied;
    }

    public boolean assignSlot(Vehicle vehicle) {
        if (!isOccupied && vehicle.getClass().getSimpleName().equals(vehicleTypeAllowed)) {
            isOccupied = true;
            bookingLog = "Slot " + slotId + " booked for " + vehicleTypeAllowed;
            return true;
        }
        return false;
    }

    public void releaseSlot() {
        isOccupied = false;
        bookingLog = "Slot " + slotId + " is now free";
    }

    // Expose logs safely
    public String getBookingLog() {
        return bookingLog;
    }
}
