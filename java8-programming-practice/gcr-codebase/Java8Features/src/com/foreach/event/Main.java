package com.foreach.event;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Attendee> attendees = new ArrayList<>();

		attendees.add(new Attendee("Rahul", "Conference"));
		attendees.add(new Attendee("Priya", "Workshop"));
		attendees.add(new Attendee("Amit", "Seminar"));
		attendees.add(new Attendee("Sneha", "Tech Talk"));
		attendees.add(new Attendee("Vikram", "Hackathon"));

		// Print a welcome message for all attendees
		attendees.forEach((c) -> System.out.println("Welcome " + c.name + " for your event " + c.EventType));
	}
}
