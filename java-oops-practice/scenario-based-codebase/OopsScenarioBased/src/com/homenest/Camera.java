package com.homenest;

public class Camera extends Device {

    public Camera(String deviceId) {
        super(deviceId);
        energyUsage = 1.2;
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
        updateFirmwareLog("Camera recalibrated");
    }
}