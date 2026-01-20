package com.bagnball;

import java.util.*;

public class Bag {

	// attribute
	protected int uniqueID;
	protected String color;
	protected int capacity;
	protected ArrayList<Ball> list = new ArrayList<>();

	// constructor
	public Bag(int uniqueID, String color, int capacity) {
		this.uniqueID = uniqueID;
		this.color = color;
		this.capacity = capacity;
	}

	//methods 
	public void addBall(Ball b) {
		if(list.size() <capacity) {
			list.add(b);
			System.out.println(b.getUniqueID()+" ball with color " +b.color +" of size "+b.size + " is added ");
			System.out.println( );
		}
		else {
			System.out.println("Bag capacity is full, no more ball can be added ");
			System.out.println();
		}
	}
	
	public void removeBall(Ball b) {
		if(list.size() > 0) {
			list.remove(b);
			System.out.println(b.getUniqueID() + " is removed");
			System.out.println();
		}
		else {
			System.out.println("Bag is empty ");
			System.out.println();
		}
	}
	
	public void display() {
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Bag with ID : " + uniqueID + " of color " + color + " consist of balls " );
		System.out.println("----------------------------------------------------------------------");
		for(Ball b: list) {
			System.out.println(b.getUniqueID() +" ball with color " +b.color +" of size "+b.size );
		}
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Total number of ball in the bag : "+ capacity);
		System.out.println("----------------------------------------------------------------------");
	}
}
