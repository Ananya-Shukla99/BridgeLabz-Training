package com.bagnball;

public class Ball {

	//attribute 
	private int uniqueID;
	protected String color;
	protected String size; //(small/medium/large)
	
	//constructor
	public Ball(int uniqueID, String color, String size) {
		this.uniqueID = uniqueID;
		this.color = color;
		this.size = size;
	}

	public int getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(int uniqueID) {
		this.uniqueID = uniqueID;
	}
	
}
