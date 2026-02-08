package com.smartcitytransport;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SmartCitySystem {

	public static void main(String[] args) {

		// CREATE SERVICES
		List<TransportService> services = new ArrayList<>();

		services.add(new Bus("Bus-101", 20, "08:00", "A-B"));
		services.add(new Bus("Bus-102", 15, "09:30", "A-C"));

		services.add(new Metro("Metro-1", "X-Y", "07:45", 30));
		services.add(new Metro("Metro-2", "Y-Z", "09:00", 25));

		services.add(new Taxi("Taxi-21", "M-N", "08:15", 50));

		services.add(new AmbulanceService("Ambulance-1", "Hospital-City", "Anytime", 0));

		// FUNCTIONAL INTERFACE + LAMBDA
		FareCalculator calculator = distance -> distance * 6;

		double distance = GeoUtils.calculateDistance(2, 3, 7, 9);

		System.out.println("Distance = " + distance + " km");
		System.out.println("Calculated Fare = Rs." + calculator.calculateFare(distance));

		// FILTER + SORT (LAMBDA)

		System.out.println("\nCheapest Services (Fare < 25):");

		services.stream().filter(s -> s.getFare() < 25).forEach(TransportService::printServiceDetails);

		System.out.println("\nSorted by Time:");

		services.stream().sorted(Comparator.comparing(TransportService::getTime))
				.forEach(TransportService::printServiceDetails);

		// DASHBOARD (forEach)

		System.out.println("\nLIVE DASHBOARD:");

		services.forEach(TransportService::printServiceDetails);

		// PASSENGER DATA

		List<Passenger> passengers = new ArrayList<>();

		passengers.add(new Passenger("Rahul", "A-B", 20, true));
		passengers.add(new Passenger("Amit", "A-B", 20, false));
		passengers.add(new Passenger("Neha", "X-Y", 30, true));
		passengers.add(new Passenger("Priya", "M-N", 50, true));
		passengers.add(new Passenger("Karan", "A-C", 15, false));

		// GROUP BY ROUTE

		System.out.println("\nPassengers Grouped by Route:");

		Map<String, List<Passenger>> byRoute = passengers.stream().collect(Collectors.groupingBy(Passenger::getRoute));

		byRoute.forEach((k, v) -> System.out.println(k + " : " + v.size()));

		// PARTITION PEAK/NON-PEAK

		System.out.println("\nPeak / Non-Peak Trips:");

		Map<Boolean, List<Passenger>> peakData = passengers.stream()
				.collect(Collectors.partitioningBy(Passenger::isPeakTime));

		System.out.println("Peak Trips: " + peakData.get(true).size());

		System.out.println("Non-Peak Trips: " + peakData.get(false).size());

		// SUMMARIZE FARES

		System.out.println("\nRevenue Report:");

		DoubleSummaryStatistics stats = passengers.stream().collect(Collectors.summarizingDouble(Passenger::getFare));

		System.out.println("Total Revenue: Rs." + stats.getSum());
		System.out.println("Average Fare: Rs." + stats.getAverage());
		System.out.println("Max Fare: Rs." + stats.getMax());

		// EMERGENCY SERVICE CHECK

		System.out.println("\nEmergency Services:");

		for (TransportService s : services) {

			if (s instanceof EmergencyService) {

				System.out.println("Priority Given To: " + s.getName());
			}
		}

		// SYSTEM EXTENSION (FERRY)

		TransportService ferry = new TransportService() {

			public String getName() {
				return "Ferry-1";
			}

			public String getRoute() {
				return "River-A";
			}

			public String getTime() {
				return "10:00";
			}

			public double getFare() {
				return 40;
			}
		};

		services.add(ferry);

		System.out.println("\nAfter Adding Ferry:");

		services.forEach(TransportService::printServiceDetails);
	}
}