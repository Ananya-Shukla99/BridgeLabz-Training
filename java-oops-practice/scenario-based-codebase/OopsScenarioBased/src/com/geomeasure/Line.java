package com.geomeasure;

public class Line {

	//attribute
	protected String name;
	protected int x1;
	protected int y1;
	protected int x2;
	protected int y2;
	
	//constructor
	public Line(String name, int x1, int y1, int x2, int y2) {
		this.name = name;
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	//method
	public double calculateDistance() {
		double dis1= Math.pow((x2-x1), 2);
		double dis2= Math.pow((y2-y1), 2);
		double dis= dis1+dis2;
		return  Math.sqrt(dis);
	}
}
