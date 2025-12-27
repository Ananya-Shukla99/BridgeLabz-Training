package com.constructor.levelone;

public class HotelBooking {
    
	// Attributes
	String guestName;
	int roomType;
	int nights;
	
	//Default constructor
	public HotelBooking() {
		System.out.println("This is default constructor");
	}
	
	//parameterized constructor
	public HotelBooking(String guestName , int roomType ,int nights) {
		this.guestName=guestName;
		this.roomType=roomType;
		this.nights=nights;
		System.out.println("This is parameterized constructor");
	}
	
	//Copy constructor
	public HotelBooking(HotelBooking booking) {
		this.guestName=booking.guestName;
		this.roomType=booking.roomType;
		this.nights=booking.nights;
		
		System.out.println("This is copy constructor");
	}

}
