package com.gameBox;

public class Game {

	//attribute
	protected String title;
	protected String genre;
	private double price;
	private double rating;
	protected double offer;
	
	//constructor
	public Game(String title, String genre, double price, double rating) {
		this.title = title;
		this.genre = genre;
		this.price = price;
		this.rating = rating;
		this.offer=0;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getRating() {
		return rating;
	}
	
	public double getOfferPrice() {
		return offer;
	}
}
