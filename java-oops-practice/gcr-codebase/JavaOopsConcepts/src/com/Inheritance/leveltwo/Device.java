package com.Inheritance.leveltwo;

public class Device {

	String DeviceId;
	String status;
	
	Device(String DeviceId, String status){
		this.DeviceId=DeviceId;
		this.status=status;
	}
	void displayStatus() {
		System.out.println("Device info");
		System.out.println("Device id :"+DeviceId);
		System.out.println("Device status :"+status);
	}
}
