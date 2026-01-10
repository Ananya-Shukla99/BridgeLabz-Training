package com.artify;

public class PrintArt extends Artwork{

	public PrintArt(String title, String artist, double price) {
        super(title, artist, price, "Print License");
    }

    @Override
    public boolean license(String type) {
        if (licenseType.equals(type)) {
            System.out.println("Print art licensed");
            return true;
        }
        System.out.println("Invalid print license");
        return false;
    }
}
