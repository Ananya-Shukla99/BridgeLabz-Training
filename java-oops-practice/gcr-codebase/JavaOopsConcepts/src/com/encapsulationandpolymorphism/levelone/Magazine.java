package com.encapsulationandpolymorphism.levelone;

public class Magazine extends LibraryItem implements Reservable {

    private boolean available = true;

    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // days
    }

    @Override
    public void reserveItem() {
        if (available) {
            available = false;
            System.out.println("Magazine reserved successfully.");
        } else {
            System.out.println("Magazine is not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}

