package com.artify;

public abstract class Artwork implements  IPurchasable{

	//attribute
	private  String title;
	protected String artist;
	protected double price;
	protected String licenseType;
	
	//constructor
	public Artwork(  String title, String artist, double  price , String licenseType) {
		
		this.title = title;
		this.artist = artist;
		this.licenseType = licenseType;
		this.price=price;
	}
	
	//getter
	public String getTitle() {
		return title;
	}
	
	//abstract method
    public abstract boolean license(String type);
    
    //method
    public void purchase(User user) {
    	if(user.getWalletBalance() >= price){
    		user.deduct(price);
    		System.out.println(user.getName()+" bought " + title +" by "+artist);
    	}
    	else {
    		System.out.println("Sorry ! this wallet do not have sufficent balance");
    	}
    }

}
