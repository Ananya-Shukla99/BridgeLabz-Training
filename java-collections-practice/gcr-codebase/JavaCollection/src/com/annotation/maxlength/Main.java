package com.annotation.maxlength;

public class Main {
	public static void main(String[] args) {
		User validUser = new User("Abhay"); 
		System.out.println("Username: " + validUser.getUsername());

		User invalidUser = new User("VeryLongUsername");
		System.out.println("Username: " + invalidUser.getUsername());
	}
}