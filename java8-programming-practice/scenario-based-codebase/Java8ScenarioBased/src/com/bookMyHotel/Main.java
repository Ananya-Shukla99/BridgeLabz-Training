package com.bookMyHotel;

import java.util.*;
import java.time.*;


public class Main {

	public static void main(String[]args) {
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter name ");
	//	String username =sc.nextLine();
		System.out.println("Enter age");
		int age=sc.nextInt();
		System.out.println("Enter email ");
		String email=sc.next();
		System.out.println("Enter card :");
		String card= sc.next();
		
	//	HotelBooking h= new HotelBooking(username, age, email, card);
		
		try {
			HotelBooking.validateUserDetails(age, email, card);
		}catch( InvalidBookingDetailsException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Enter hotel name ");
		String name=sc.nextLine();
		System.out.println("Enter room type ");
		String type =sc.next();
		System.out.println("Enter check-in");
		String checkin=sc.next();
		LocalDate l=LocalDate.parse(checkin);
		System.out.println("Enter chcek-out");
		String checkout=sc.next();
		LocalDate ll= LocalDate.parse(checkout);
		
		try {
			HotelBooking.validateBookingDetails(name, type, l,ll);
		}catch( InvalidBookingDetailsException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Do you want breakfast -(true/false)");
		boolean breakfast=sc.nextBoolean();
				
		double cost=HotelBooking.calculateBookingCost(type, age, breakfast);
		
		System.out.println("Total cost "+cost);
		
		sc.close();
	}
}
