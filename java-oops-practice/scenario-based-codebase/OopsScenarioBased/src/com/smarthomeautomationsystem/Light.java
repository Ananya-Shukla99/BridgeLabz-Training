package com.smarthomeautomationsystem;

public class Light extends Appliance{

	//Public field 
	int brightnessLevel;
	
	//constructor
	Light(String name, double powerUsage, int brightnessLevel){
		super(name, powerUsage);
		this.brightnessLevel=brightnessLevel;
	}
	
	//Overriding interface method 
	@Override
	public void turnOn() {
		 super.turnOn();
		 System.out.println("Light is on with brightness " + brightnessLevel);
		
	}
	
	//Overriding interface method
	@Override
	public void turnOff() {
		super.turnOff();
		System.out.println("Lights are off ");
		
	}
	
}
