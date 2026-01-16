package com.sortingalgorithms.robowarehouse;

public class Package {

	//attributes
	protected String name;
	protected int weight;
	
	//constructor
	public Package(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return name + " - " +weight;
	}
}
