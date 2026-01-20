package com.digicontact;


public class Main {

    public static void main(String[] args) {

        EBook book = new EBook("My Address Book");

        Contact c1 = new Contact("Amit", "Sharma", 9876543210L,
                "amit@gmail.com", "Pune, Maharashtra");
        Contact c2 = new Contact("Riya", "Verma", 9123456789L,
                "riya@gmail.com", "Mumbai, Maharashtra");
        Contact c3 = new Contact("Neha", "Singh", 9988776655L,
                "neha@gmail.com", "Delhi");

        book.addContact(c1);
        book.addContact(c2);
        book.addContact(c3);

        // Duplicate test
        book.addContact(new Contact("Amit", "Sharma", 9999999999L,
                "dup@gmail.com", "Pune"));

        // Edit contact
        book.editContact(c2, "Riya", 9000000000L, "riya_new@gmail.com", "Nagpur, Maharashtra");

        // Delete contact
        book.deleteContact("Neha");

        // Search
        book.searchByCityOrState("Maharashtra");

        // Display sorted contacts
        book.displaySortedContacts();
    }
}
