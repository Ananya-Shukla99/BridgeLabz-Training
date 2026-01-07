package com.eventmanagementplatform;

public class ConferenceEvent extends Event {

    public ConferenceEvent(int eventId, String name, String location, String date,
                           int attendees, User organizer,
                           double venueCost, double serviceCost) {

        super(eventId, name, location, date, attendees,
              organizer, venueCost, serviceCost, 1000);
    }

    @Override
    public void schedule() {
        System.out.println("Conference scheduled with seating and projector.");
    }
}
