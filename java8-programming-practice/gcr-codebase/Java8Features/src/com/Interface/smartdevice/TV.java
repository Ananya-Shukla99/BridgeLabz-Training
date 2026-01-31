package com.Interface.smartdevice;

public class TV extends Device {

	public TV() {
		super("TV");
	}

	public void turnOn() {
		System.out.println("TV is turned on !");
	}
	
	public void turnOff() {
	
		System.out.println("TV is turned off !");
	}
}