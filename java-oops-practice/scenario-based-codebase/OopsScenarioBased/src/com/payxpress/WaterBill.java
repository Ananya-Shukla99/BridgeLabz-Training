package com.payxpress;

public class WaterBill extends Bill {

    public WaterBill(double amount) {
        super("Water", amount);
        this.penaltyRate = 0.03;
    }

    @Override
    public void sendReminder() {
        System.out.println(" Water Reminder: Pay to ensure uninterrupted supply.");
    }
}