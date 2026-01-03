package com.smarthomeautomationsystem;


public class UserController {

    private String userName;

    public UserController(String userName) {
        this.userName = userName;
    }

    public void switchOn(Controllable device) {
        device.turnOn();
    }

    public void switchOff(Controllable device) {
        device.turnOff();
    }

    // Operator usage: compare energy consumption
    public void compareEnergy(Appliance a1, Appliance a2) 
    {
        if (a1.getPowerUsage() > a2.getPowerUsage())
        {
            System.out.println("First appliance uses more energy");
        }
        else if (a1.getPowerUsage() < a2.getPowerUsage()) 
        {
            System.out.println("Second appliance uses more energy");
        } 
        else 
        {
            System.out.println("Both appliances use equal energy");
        }
    }
}
