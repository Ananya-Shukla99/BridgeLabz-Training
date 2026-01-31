package com.Interface.smartdevice;

public class Main {

	public static void main (String []args) {
		
		//Creating device
		Device d= new Light();
		Device d2= new AC();
		Device d3= new TV();
		
		//light methods
		d.turnOn();
		d.turnOff();
		
		//A C methods
		d2.turnOn();
		d2.turnOff();
		
		//TV device
		d3.turnOn();
		d3.turnOff();
		
	}
}
