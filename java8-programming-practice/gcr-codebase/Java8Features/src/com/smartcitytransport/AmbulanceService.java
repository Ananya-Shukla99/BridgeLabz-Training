package com.smartcitytransport;

public class AmbulanceService implements TransportService, EmergencyService {

	private String name, route, time;
	private double fare;

	public AmbulanceService(String name, String route, String time, double fare) {

		this.name = name;
		this.route = route;
		this.time = time;
		this.fare = fare;
	}

	public String getName() {
		return name;
	}

	public String getRoute() {
		return route;
	}

	public String getTime() {
		return time;
	}

	public double getFare() {
		return fare;
	}
}