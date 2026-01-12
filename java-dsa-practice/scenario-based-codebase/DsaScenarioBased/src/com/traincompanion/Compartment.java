package com.traincompanion;

public class Compartment {

	// attributes
	protected int id;
	private String name;
	protected Compartment next;
	protected Compartment prev;

	// constructor
	public Compartment(int id, String name) {
		this.id = id;
		this.name = name;
		this.next = null;
		this.prev = null;
	}

	public String getName() {
		return name;
	}

}
