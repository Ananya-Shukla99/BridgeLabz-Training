package com.homenest;

public class Lock extends Device {

    public Lock(String deviceId) {
        super(deviceId);
        energyUsage = 0.2;
    }

    @Override
    public void turnOn() {
        setStatus(true); // Locked
    }

    @Override
    public void turnOff() {
        setStatus(false); // Unlocked
    }

    @Override
    public void reset() {
        turnOff();
        updateFirmwareLog("Lock reset to default");
    }
}
