package com.parkease;

public class Main {
	//main method 
    public static void main(String[] args) {

    	//creating slots
        ParkingSlot slot = new ParkingSlot(101, "Basement A", "Car");
        //parking slots
        Vehicle car = new Car("MH12AB1234");

        if (slot.assignSlot(car)) {
            double charges = car.calculateCharges(3, true);
            System.out.println("Parking Charges: ₹" + charges);
        }

        System.out.println(slot.getBookingLog());
        slot.releaseSlot();
        System.out.println(slot.getBookingLog());
    }
}
