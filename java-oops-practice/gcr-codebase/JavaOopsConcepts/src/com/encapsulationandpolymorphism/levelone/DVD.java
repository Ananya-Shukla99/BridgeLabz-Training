package com.encapsulationandpolymorphism.levelone;

public class DVD extends LibraryItem implements Reservable {

    private boolean available = true;

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; 
    }

    @Override
    public void reserveItem() {
        if (available) {
            available = false;
            System.out.println("DVD reserved successfully.");
        } else {
            System.out.println("DVD is not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}
