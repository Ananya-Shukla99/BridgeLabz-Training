package com.smarthomeautomationsystem;


public class Appliance implements Controllable{

	// Private fields - data encapsulation
	private String applianceName;
	private boolean isOn;
	private double powerUsage;
	
	//constructor
	Appliance (String name, double powerUsage){
		this.applianceName=name;
		this.powerUsage=powerUsage;
	}

	//public getter 
	public String getApplianceName() {
		return applianceName;
	}
	
	//method to turn on 
	 public void turnOn() {
		isOn = true;
	 }
	 
	 //method to turn off
	 public void turnOff() {
		 isOn = false;
	 }
	 
	 //method for power usage 
	 public double getPowerUsage() {
		return powerUsage;
	 }
	 
	 //method to check status
	 public boolean isOn() {
		 return isOn;
	 }
}
