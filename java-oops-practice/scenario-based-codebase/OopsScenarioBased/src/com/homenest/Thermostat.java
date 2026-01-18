package com.homenest;

public class Thermostat extends Device {

    public Thermostat(String deviceId) {
        super(deviceId);
        energyUsage = 2.5;
    }

    @Override
    public void turnOn() {
        setStatus(true);
    }

    @Override
    public void turnOff() {
        setStatus(false);
    }

    @Override
    public void reset() {
        updateFirmwareLog("Thermostat temperature reset");
    }
}
