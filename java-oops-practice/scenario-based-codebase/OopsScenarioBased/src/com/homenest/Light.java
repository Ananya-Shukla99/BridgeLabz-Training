package com.homenest;

public class Light extends Device {

	 public Light(String deviceId) {
	        super(deviceId);
	        energyUsage = 0.5;
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
	        turnOff();
	        updateFirmwareLog("Light reset completed");
	    }
}
