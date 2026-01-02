package com.encapsulationandpolymorphism.levelone;

public class Book extends LibraryItem implements Reservable {

    private boolean available = true;

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 21; 
    }

    @Override
    public void reserveItem() {
        if (available) {
            available = false;
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}

