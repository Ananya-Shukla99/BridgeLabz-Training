package com.gameBox;

import java.util.*;

public abstract class User implements IDownloadable {
	
	//attributes
	protected String name;
	protected ArrayList<Game> game=new ArrayList<>();
	
	
	//constructor
	public User(String name, ArrayList<Game> game) {
		this.name = name;
		this.game = game;
	}
	
	
	public void applyOffer(Game [] games) {
		
		double total=0;
		double offerTotal=0;
		for(Game g: games) {
			total+=g.getPrice();
			offerTotal+=g.getPrice()-(g.getPrice()*g.getOfferPrice());
		}
		
		System.out.println("Total without offer : "+total);
		System.out.println("Total with all offers : "+ offerTotal);
	}
	
	public void download(Game []games) {
		
		for(Game g : games) {
			System.out.println( g.title + "  is downloaded of genre " + g.genre + " and its rating is "+ g.getRating() );
		}
	}
	
    public void playDemo(Game []games) {
		
		for(Game g : games) {
			if(g.getPrice()==0) {
				System.out.println("Playing the demo of "+g.title);
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
