package com.homenest;

public class Main {

	public static void main(String[] args) {

		Device[] devices = { new Light("L1"), new Camera("C1"), new Thermostat("T1"), new Lock("K1") };

		for (Device d : devices) {
			d.turnOn();
			d.reset();
			System.out.println(d.getDeviceId() + " Monthly Energy: " + d.calculateMonthlyUsage(6));
		}
	}

}
