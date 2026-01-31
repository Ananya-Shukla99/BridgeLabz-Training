package com.lambda.smarthome;

public class SmartHome {
	public static void main(String[] args) {

		Light control = new Light();

		// Adding trigger
		control.addTrigger("MOTION", () -> System.out.println("Lights ON at full brightness"));

		control.addTrigger("NIGHT", () -> System.out.println("Dim warm lights ON"));

		control.addTrigger("DAYTIME", () -> System.out.println("Lights dimmed, blue ambient lighting"));

		// Activating those methods
		control.activate("MOTION");
		control.activate("NIGHT");
		control.activate("DAYTIME");
	}
}
