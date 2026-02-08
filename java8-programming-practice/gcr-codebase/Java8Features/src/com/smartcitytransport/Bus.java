package com.smartcitytransport;

public class Bus implements TransportService {

	private String name;
	private double fare;
	private String route;
	private String time;

	public Bus(String name, double fare, String route, String time) {
		this.name = name;
		this.fare = fare;
		this.route = route;
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public double getFare() {
		return fare;
	}

	public String getRoute() {
		return route;
	}

	public String getTime() {
		return time;
	}
}
