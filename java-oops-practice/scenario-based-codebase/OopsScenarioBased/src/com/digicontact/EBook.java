package com.digicontact;

import java.util.*;

public class EBook {

	// attribute
	protected String name;
	protected ArrayList<Contact> list = new ArrayList<>();

	// constructor
	public EBook(String name) {

		this.name = name;
	}

	// methods
	public void addContact(Contact c) {
		list.add(c);
		System.out.println("Contact added " + c.getFirstName() + " " + c.getLastName());
		System.out.println("--------------------------------------------------");
	}

	public void deleteContact(String firstName) {

		boolean found = false;
		for (Contact con : list) {

			if (con.getFirstName().equals(firstName)) {
				list.remove(con);
				System.out.println("Contact deleted " + con.getFirstName() + " " + con.getLastName());
				System.out.println("--------------------------------------------------");
				found = true;
                return;
			} 
		}
		if (!found) {
            System.out.println("No such contact exists");
            System.out.println("--------------------------------------------------");
        }
		
	}

	public void editContact(Contact c, String newFirstName, Long newNumber, String newEmail, String newAddress) {
		for (Contact con : list) {

			if (con.getFirstName().equals(c.getFirstName())) {
				
				System.out.println("Contact " + con.getFirstName() + " " + con.getLastName());
				System.out.println("Previous details ");
				System.out.println("Contact number" + con.getPhoneNumber());
				System.out.println("Contact email" + con.getEmail());
				System.out.println("Contact Address" + con.getAddress());
				System.out.println("--------------------------------------------------");
				con.setFirstName(newFirstName);
				con.setPhoneNumber(newNumber);
				con.setEmail(newEmail);
				con.setAddress(newAddress);
				System.out.println("Contact edited " + con.getFirstName() + " " + con.getLastName());
				System.out.println("After editing details ");
				System.out.println("Contact number" + con.getPhoneNumber());
				System.out.println("Contact email" + con.getEmail());
				System.out.println("Contact Address" + con.getAddress());
				System.out.println("--------------------------------------------------");
				return;
			} 
		}
		System.out.println("No such contact exist ");
		System.out.println("--------------------------------------------------");
	}
	
	
	public void searchByCityOrState(String keyword) {
        boolean found = false;
        for (Contact con : list) {
            if (con.getAddress().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(con.getFirstName() + " " + con.getLastName()
                        + " | " + con.getAddress());
                System.out.println("--------------------------------------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No contacts found in " + keyword);
            System.out.println("--------------------------------------------------");
        }
    }
	
	
	public void displaySortedContacts() {
        list.sort(Comparator.comparing(Contact::getFirstName).thenComparing(Contact::getLastName));
        System.out.println("--------------------------------------------------");

        System.out.println("---- Address Book ----");
        for (Contact con : list) {
            System.out.println(con.getFirstName() + " " + con.getLastName()+ " - " + con.getPhoneNumber()+ " - " + con.getEmail() + " - " + con.getAddress());
            System.out.println("--------------------------------------------------");
        }
	}
}
