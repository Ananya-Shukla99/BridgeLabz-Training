package com.payxpress;

public class ElectricityBill extends Bill {

    public ElectricityBill(double amount) {
        super("Electricity", amount);
        this.penaltyRate = 0.05;
    }

    @Override
    public void sendReminder() {
        System.out.println(" Electricity Reminder: Avoid power disconnection!");
    }
}