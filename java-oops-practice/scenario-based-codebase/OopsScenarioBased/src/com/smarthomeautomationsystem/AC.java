package com.smarthomeautomationsystem;

//Subclass extending appliance class
public class AC extends Appliance{
	
	//private field 
	private int temperature;
	
	//constructor
	public AC(String name, double powerUsage, int temperature){
		super(name, powerUsage);
		this.temperature=temperature;
	}

	//Overriding the methods
	@Override
	public void turnOn() {
		super.turnOn();
		System.out.println("AC is switched on at " + temperature + "°C");
	}
	
	//Overriding the methods
	@Override
	public void turnOff() {
		super.turnOff();
		System.out.println("AC is switched off");
	}
	
	//method to display method
	public void setTemperature(int temperature) {
		this.temperature=temperature;
	}
}
