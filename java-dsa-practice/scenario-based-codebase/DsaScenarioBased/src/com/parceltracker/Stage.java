package com.parceltracker;

public class Stage {

	//attribute
	String name;
	Stage next;

	//constructor
	Stage(String name) {
		this.name = name;
		this.next = null;
	}
}
