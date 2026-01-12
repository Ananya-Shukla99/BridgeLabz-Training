package com.traincompanion;

public class Main {

	public static void main(String[] args) {

		// creating Compartment objects
		Compartment c1 = new Compartment(101, "Genrel");
		Compartment c2 = new Compartment(102, "Sleeper");
		Compartment c3 = new Compartment(103, "Food");
		Compartment c4 = new Compartment(104, "Sleeper2");
		Compartment c5 = new Compartment(105, "AC");
		Compartment c6 = new Compartment(106, "Special");

		// creating Train object
		Train t = new Train();

		t.addCompartent(c6);
		t.addCompartent(c5);
		t.addCompartent(c4);
		t.addCompartent(c3);
		t.addCompartent(c2);
		t.addCompartent(c1);
		t.removeCompartment(c6);

		t.moveForward();
		t.moveForward();
		t.moveForward();
		t.moveForward();
		t.moveForward();
		t.moveForward();
		
		t.moveBackward();
		t.moveBackward();
		t.moveBackward();
		t.moveBackward();
		t.moveBackward();
		t.moveBackward();

		t.adjacentShow(c4);
		t.adjacentShow(c1);
		t.adjacentShow(c3);
		
		
	}
}
