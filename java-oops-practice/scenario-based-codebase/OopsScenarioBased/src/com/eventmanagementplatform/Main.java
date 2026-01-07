package com.eventmanagementplatform;

public class Main {

	public static void main(String[] args) {

        User user = new User("Alice", "alice@gmail.com");
        
        User user2 = new User("Canny", "canny@gmail.com");

        Event event = new BirthdayEvent( 101 ,"Alice Birthday","Community Hall", "10-06-2026",50,user,5000,2000);

        Event event2 = new ConferenceEvent( 200 ,"Conference event"," Hall", "07-07-2025",80, user2 ,9000,3000);

        event.schedule();
        System.out.println("Event ID: " + event.getEventId());
        System.out.println("Total Cost: " + event.calculateCost());

        event2.schedule();
        System.out.println("Event ID: " + event2.getEventId());
        System.out.println("Total Cost: " + event2.calculateCost());

        event.reschedule("12-06-2026");
        event.cancel();
    }
}
