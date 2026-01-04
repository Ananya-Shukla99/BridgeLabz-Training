package com.circularlinkedlist.reservationsystem;

class TicketNode {
	//attribute 
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    TicketNode next;

    //constructor 
    TicketNode(int ticketId, String customerName, String movieName,
               String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}
