package com.smarthomeautomationsystem;


public class Main {

    public static void main(String[] args) {

        // Creating appliances
        Appliance light = new Light("Living Room Light", 20, 80);
        Appliance fan = new Fan("Ceiling Fan", 75, 3);
        Appliance ac = new AC("Bedroom AC", 1500, 24);

        // User controller
        UserController user = new UserController("Ananya");

        // method calls
        user.switchOn(light);
        user.switchOn(fan);
        user.switchOn(ac);

        System.out.println();

        // Compare energy usage
        user.compareEnergy(ac, fan);

        System.out.println();

        // Switching off devices
        user.switchOff(light);
        user.switchOff(fan);
        user.switchOff(ac);
    }
}
