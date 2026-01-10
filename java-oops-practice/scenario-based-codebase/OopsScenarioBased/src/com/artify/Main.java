package com.artify;

public class Main {

	public static void main(String[]args) {
		
		User user =new User("Pranjali", 500);
		User user2 =new User("Rahul", 9500);	
		
		Artwork a1 =new DigitalArt("Madhubani", "Rohan", 700 );
		Artwork a2 =new PrintArt("Sunset", "Neha", 7700 );
		
		a1.purchase(user);
		System.out.println("\nLicensing:");
	    a1.license("Digital License");
	    System.out.println("\nRemaining balance:");
	    System.out.println("Pranjal : ₹" + user.getWalletBalance());
	    
	    
		a2.purchase(user2);
		
		//licensing
		System.out.println("\nLicensing:");
	    a2.license("Print License");

		//walletBalance 
		System.out.println("\nRemaining balance:");
	    System.out.println("Rahul : ₹" + user2.getWalletBalance());
	}
}
