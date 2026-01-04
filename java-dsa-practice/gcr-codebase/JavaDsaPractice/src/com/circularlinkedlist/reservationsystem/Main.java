package com.circularlinkedlist.reservationsystem;

public class Main {
	//main method 
    public static void main(String[] args) {

    	//node creation 
        TicketReservation system = new TicketReservation();

        system.addTicket(101, "Alice", "Inception", "A1", "10:30 AM");
        system.addTicket(102, "Bob", "Avatar", "B5", "11:00 AM");
        system.addTicket(103, "Alice", "Avatar", "C3", "11:15 AM");

        System.out.println("All Tickets:");
        system.displayTickets();

        System.out.println("\nSearch by Movie:");
        system.searchTicket("Avatar");

        system.removeTicket(102);

        System.out.println("\nAfter Cancellation:");
        system.displayTickets();

        system.totalTickets();
    }
}
