package com.eventmanagementplatform;

public class BirthdayEvent extends Event {

    public BirthdayEvent(int eventId, String name, String location, String date,
                         int attendees, User organizer,
                         double venueCost, double serviceCost) {

        super(eventId, name, location, date, attendees,
              organizer, venueCost, serviceCost, 500);
    }

    @Override
    public void schedule() {
        System.out.println("Birthday event scheduled with decorations and cake.");
    }
}