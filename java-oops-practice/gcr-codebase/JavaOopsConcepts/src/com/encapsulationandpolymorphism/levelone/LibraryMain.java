package com.encapsulationandpolymorphism.levelone;

import java.util.ArrayList;
import java.util.List;

public class LibraryMain {

    public static void main(String[] args) {

        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book(101, "Effective Java", "Joshua Bloch"));
        items.add(new Magazine(202, "National Geographic", "Various"));
        items.add(new DVD(303, "Inception", "Christopher Nolan"));

        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                System.out.println("Available: " + reservable.checkAvailability());
                reservable.reserveItem();
            }

            System.out.println("----------------------------------");
        }
    }
}
