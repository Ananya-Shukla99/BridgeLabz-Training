package com.sortingalgorithms.movietime;

public class Movie {

	// attribute
	protected String name;
	protected int timing;

	// constructor
	public Movie(String name, int timing) {
		this.name = name;
		this.timing = timing;
	}

	@Override
	public String toString() {
		return name + " - " + timing;
	}
}
