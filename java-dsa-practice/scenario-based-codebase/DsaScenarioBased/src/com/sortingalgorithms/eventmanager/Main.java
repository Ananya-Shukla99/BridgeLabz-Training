package com.sortingalgorithms.eventmanager;

public class Main {

	public static void main(String[] args) {

        Ticket[] tickets = {
            new Ticket("Concert", 1200),
            new Ticket("Movie", 300),
            new Ticket("Comedy Show", 800),
            new Ticket("Sports", 1500),
            new Ticket("Theatre", 600)
        };

        EventManager.quickSort(tickets, 0, tickets.length - 1);

        System.out.println("Sorted Tickets by Price:");
        for (Ticket t : tickets)
            System.out.println(t);
    }
}
