package com.Inheritance.leveltwo;

public class Thermostat extends Device {
	
	private int temperatureSetting;
	
	public Thermostat (String DeviceId, String status, int temperatureSetting){
		super(DeviceId, status);
		this.temperatureSetting=temperatureSetting;
	}
	
	@Override
	void displayStatus() {
		super.displayStatus();
		System.out.println("Temperature Setting id :"+ temperatureSetting + "C");
	}

}
