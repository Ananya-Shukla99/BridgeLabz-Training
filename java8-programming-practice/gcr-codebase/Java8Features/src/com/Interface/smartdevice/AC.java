package com.Interface.smartdevice;

public class AC extends Device {

	public AC() {
		super("AC");
	}

	public void turnOn() {
		System.out.println("AC is turned on !");
	}
	
	public void turnOff() {
	
		System.out.println("AC is turned off !");
	}
}