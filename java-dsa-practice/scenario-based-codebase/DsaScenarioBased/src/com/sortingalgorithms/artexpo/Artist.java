package com.sortingalgorithms.artexpo;

public class Artist {

	//attribute
	protected String name;
	protected int regTime;
	
	//constructor
	public Artist(String name, int regTime) {
		this.name = name;
		this.regTime = regTime;
	}
	
	@Override
	public String toString() {
		return name + " - timing of register - "+regTime;
	}
}
