package com.artify;

public class DigitalArt extends Artwork{
	
	public DigitalArt( String title, String artist, double  price) {
    
		super(title, artist,price,"Digital License");
	}
	
	@Override
    public boolean license(String type) {
        if (licenseType.equals(type)) {
            System.out.println("Digital art licensed");
            return true;
        }
        System.out.println("Invalid digital license");
        return false;
    }

}
