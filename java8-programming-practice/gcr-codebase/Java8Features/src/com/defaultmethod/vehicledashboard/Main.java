package com.defaultmethod.vehicledashboard;

public class Main {

    public static void main(String[] args) {

        Vehicle Car = new Car();
        Vehicle ev = new ElectricCar();

        Car.displaySpeed();
        Car.displayBatteryStatus();

        ev.displaySpeed();
        ev.displayBatteryStatus();    
    }
}
