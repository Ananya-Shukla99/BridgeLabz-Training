package com.artify;

public interface IPurchasable {

	void purchase(User user);
	boolean license(String type);
	
}
