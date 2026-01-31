package com.Interface.smartdevice;

public class Light extends Device  {

	public Light() {
		super("Light");
	}

	public void turnOn() {
		System.out.println("Light is turned on !");
	}
	
	public void turnOff() {
	
		System.out.println("Light is turned off !");
	}
}
