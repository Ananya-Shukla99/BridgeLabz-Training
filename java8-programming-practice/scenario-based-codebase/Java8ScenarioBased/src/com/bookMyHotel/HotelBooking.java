package com.bookMyHotel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class HotelBooking {

	
	String name;
	int age;
	String email;
	String creditCard;

	public HotelBooking(String name, int age, String email, String creditCard) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.creditCard = creditCard;
	}

	public static List<String> hotelList = Arrays.asList("Hilton","Hyatt","Marriott");
	

	public static void validateUserDetails(int age, String email, String creditCard)
			throws InvalidBookingDetailsException {

		if (age < 18 && age > 100) {
			
			System.out.println("Invalid age");
			throw new InvalidBookingDetailsException("Invalid age");
		}

		if (!email.matches("^[a-zA-Z0-9._-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
			
			throw new InvalidBookingDetailsException("Invalid email");

		}
		if (!creditCard.matches("(\\d){16}")) {
			throw new InvalidBookingDetailsException("Invalid credit card number");
		}
	}

	public static void validateBookingDetails(String hotelName,  String roomType, LocalDate checkIn, LocalDate checkOut) throws InvalidBookingDetailsException  {
		
		if(hotelList.contains(hotelName)) {
			throw new  InvalidBookingDetailsException("Invalid hotel name");
		}
		
		if(roomType.equals("Standard") || roomType.equals("Deluxe")|| roomType.equals("Suite")) {
			
			throw new  InvalidBookingDetailsException("Invalid roomType");
		}
		
		DateTimeFormatter df= DateTimeFormatter.ofPattern("yyyy-MM-dd");
		

		String inDate = checkIn.toString();
		String outDate= checkOut.toString();
		if(LocalDate.parse(inDate, df) != null) {
			throw new InvalidBookingDetailsException("Invalid check in format");

		}
		
		if(LocalDate.parse(outDate, df)!=null) {
			throw new InvalidBookingDetailsException("Invalid check in");

		}
		if(!checkIn.isAfter(LocalDate.now())) {
			throw new InvalidBookingDetailsException("Invalid check in");
		}
		
		if(!checkOut .isAfter(checkIn)) {
			throw new  InvalidBookingDetailsException("Invaild check out ");
		}
	}
	
	public static double calculateBookingCost(String roomType, int numNights, boolean breakfast) { 
		
		double cost=0;
		if(roomType.equals("Standard")) {
			cost+=1000;
		}
		else if(roomType.equals("Deluxe")) {
			cost+=2000;
		}else {
			cost+=3000;
		}
		if(breakfast) {
			cost+=100* numNights;
		}
		return cost*numNights;
	} 
}

