package com.bookMyHotel;

public class InvalidBookingDetailsException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidBookingDetailsException(String message) {
		super(message);
	}
}
