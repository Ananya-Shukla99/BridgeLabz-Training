package com.sortingalgorithms.cropmonitor;

public class SensorData {

	protected long timestamp;
	protected double temperature;

	public SensorData(long timestamp, double temperature) {
		this.timestamp = timestamp;
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "SensorData{timestamp=" + timestamp + ", temperature=" + temperature + "}";
	}
}