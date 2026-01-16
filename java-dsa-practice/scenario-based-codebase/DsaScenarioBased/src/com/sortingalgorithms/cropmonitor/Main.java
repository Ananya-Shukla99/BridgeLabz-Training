package com.sortingalgorithms.cropmonitor;

public class Main {

	public static void main(String[] args) {

		SensorData[] readings = { new SensorData(1685012300L, 28.4), new SensorData(1685011100L, 26.8),
				new SensorData(1685014500L, 30.2), new SensorData(1685010900L, 25.9),
				new SensorData(1685013000L, 29.1) };

		System.out.println("Before Sorting:");
		for (SensorData s : readings)
			System.out.println(s);

		CropMonitor.quickSort(readings, 0, readings.length - 1);

		System.out.println("\nAfter Sorting by Timestamp:");
		for (SensorData s : readings)
			System.out.println(s);
	}
}
