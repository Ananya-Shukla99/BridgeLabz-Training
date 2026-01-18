package com.gameBox;

public class StrategyGame extends Game{

	//attribute 
	private double offer= 0.10;

	//constructor
	public StrategyGame(String title, String genre, double price, double rating) {
		super(title, "StrategyGame", price, rating);
	}

	public double getOfferPrice() {
		return offer;
	}
	
    void playDemo(Game []games) {
		
		for(Game g : games) {
			if(g.getPrice()==0) {
				System.out.println("Playing the demo of StrategyGame "+g.title);
			}
			else {
				System.out.println("This is a paid game");
				System.out.println("You have to pay : "+g.getPrice());
				System.out.println("You also get discount of :" +g.getOfferPrice());
				System.out.println("Playing demo game of "+g.title);
			}
		}
	}
}
