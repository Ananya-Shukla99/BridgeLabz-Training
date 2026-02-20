package com.reviewManager;

public class Review {

	public String userName;
	public String message;
	
	public Review (String userName, String message) {
		this.message =message;
		this.userName=userName;
	}
	@Override
	public String toString() {
		return userName +" : "+message;
	}
}
