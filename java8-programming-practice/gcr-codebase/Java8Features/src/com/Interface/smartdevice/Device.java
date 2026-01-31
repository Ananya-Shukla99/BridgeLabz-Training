package com.Interface.smartdevice;

public abstract class Device implements Operator{

	String name;

	//constructor
	public Device(String name) {
		this.name = name;
	}	
}
