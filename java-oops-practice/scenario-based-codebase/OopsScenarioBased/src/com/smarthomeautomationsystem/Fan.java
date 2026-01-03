package com.smarthomeautomationsystem;

//Subclass of Appliance
public class Fan extends Appliance{

	//Private fields 
	private int speedLevel;
	
	//constructor
	Fan(String name, double powerUsage, int speedLevel){
		super(name, powerUsage);
		this.speedLevel=speedLevel;
	}
	
	//Methods overriding 
	 @Override
	public void turnOn() {
	    super.turnOn();
	    System.out.println("Fan is switched on at speed " + speedLevel);
	}

	 //Methods overriding 
	@Override
	public void turnOff() {
	    super.turnOff();
	    System.out.println("Fan is switched off");
	}

	//Methods for setting speed 
	public void setSpeed(int speedLevel) {
	    this.speedLevel = speedLevel;
	}
	
}
