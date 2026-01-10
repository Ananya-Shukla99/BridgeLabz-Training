package com.tourmate;

public class Main {

	public static void main(String []args) {
		
		Transport flight = new Transport(15000);
        Hotel hotel = new Hotel(10000);
        Activity activity = new Activity(5000);
		
        Trip trip1 = new DomesticTrip("Goa", 5, flight, hotel, activity);
        Trip trip2 = new InternationalTrip("Paris", 7, flight, hotel, activity);
        Trip trip3 = new InternationalTrip("UK" , 4, flight, hotel, activity);
		
		System.out.println("Trip Detail");
		
		trip1.book();
		
		trip2.book();
		
		trip3.book();
		
		trip2.cancel();
		
	}
}
