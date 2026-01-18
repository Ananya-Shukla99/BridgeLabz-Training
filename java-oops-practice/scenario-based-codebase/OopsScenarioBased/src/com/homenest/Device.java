package com.homenest;

public abstract class Device implements IControllable{

	//attribute
	private String deviceID;
	private boolean status;
	protected double energyUsage;
	private String firmwareLog;
	
	//constructor
	public Device(String deviceID) {
		this.deviceID = deviceID;
		this.status = false;
		this.energyUsage = 0.0;
		this.firmwareLog = "Initialized";
	}

	protected void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isOn() {
        return status;
    }

    public String getDeviceId() {
        return deviceID;
    }

    public double getEnergyUsage() {
        return energyUsage;
    }
	
    // Operator usage
    public double calculateMonthlyUsage(int hoursPerDay) {
        return energyUsage * hoursPerDay * 30;
    }

    // Firmware logs secured
    protected void updateFirmwareLog(String log) {
        this.firmwareLog = log;
    }

    protected String getFirmwareLog() {
        return firmwareLog;
    }
}
