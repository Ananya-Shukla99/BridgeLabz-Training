package com.exceptions;

public class InvalidAgeException extends Exception {

	private static final long serialVersionUID = 1L;// for serialization compatibility
	
	public InvalidAgeException(String message) {
		super (message);
	}
}
