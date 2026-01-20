package com.geomeasure;

import java.util.*;

public class GeoMeasure {

	//attribute
	protected String name;
	protected ArrayList<Line> list= new ArrayList<>();
	
	//methods to add line
	public void addLine(Line l) {
		list.add(l);
		System.out.println("Added a Line : "+ l.name);
	}
	
	public void compareLength(Line l1, Line l2) {
		if(l1.calculateDistance() <l2.calculateDistance()) {
			System.out.println(l2.name + " is greater than " + l1.name);
		}
		else {
			System.out.println(l1.name + " is greater than " + l2.name);
		}
	}
}
