package com.eventmanagementplatform;

public abstract class Event implements ISchedulable {

    private final int eventId;  
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;
    protected User organizer;

    private double venueCost;
    private double serviceCost;
    private double discount;

    // Constructor without services
    public Event(int eventId, String eventName, String location, String date,int attendees, User organizer, double venueCost) {

        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.organizer = organizer;
        this.venueCost = venueCost;
    }

    // Constructor with services
    public Event(int eventId, String eventName, String location, String date, int attendees, User organizer,double venueCost, double serviceCost, double discount) {

        this(eventId, eventName, location, date, attendees, organizer, venueCost);
        this.serviceCost = serviceCost;
        this.discount = discount;
    }

    // Cost calculation using operators
    public double calculateCost() {
        return venueCost + serviceCost - discount;
    }

    public int getEventId() {
        return eventId;
    }

    @Override
    public void reschedule(String newDate) {
        date = newDate;
        System.out.println("Event rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Event cancelled");
    }

    // Poly morphic method
    public abstract void schedule();
}
