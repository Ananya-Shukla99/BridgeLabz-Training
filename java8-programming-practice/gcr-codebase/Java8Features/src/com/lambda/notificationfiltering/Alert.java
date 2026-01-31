package com.lambda.notificationfiltering;

public class Alert {

	String name;
	boolean show;

	// constructor
	public Alert(String name, boolean show) {
		this.name = name;
		this.show = show;
	}

	@Override
	public String toString() {
		return "Alert name=" + name;
	}

}
