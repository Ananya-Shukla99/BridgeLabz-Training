package com.ecowing;

import java.util.*;

public class Sanctuary {

	// attribute
	protected String name;
	protected ArrayList<Bird> list = new ArrayList<>();

	// constructor
	Sanctuary(String name, ArrayList<Bird> list) {
		this.name = name;
		this.list = list;
	}

	public void display() {
		System.out.println(this.name + " Sanctuary ");
		for (Bird b : list) {
			System.out.println("Bird is " + b.name + " with ID " + b.uniqueID + " of " + b.species);
		}
	}

	public void displayFlyingBird() {
		for (Bird b : list) {
			if (b instanceof Flyable) {
				((Flyable) b).fly();
			}
		}
	}

	public void displaySwimmingBird() {
		for (Bird b : list) {
			if (b instanceof Swimmable) {
				((Swimmable) b).swim();
			}
		}
	}

	public void sanctuaryReport() {
		int fly = 0, swim = 0, both = 0, neither = 0;

		for (Bird b : list) {
			boolean f = b instanceof Flyable;
			boolean s = b instanceof Swimmable;

			if (f && s)
				both++;
			else if (f)
				fly++;
			else if (s)
				swim++;
			else
				neither++;
		}

		System.out.println("Flyable: " + fly);
		System.out.println("Swimmable: " + swim);
		System.out.println("Both: " + both);
		System.out.println("Neither: " + neither);
	}
}
