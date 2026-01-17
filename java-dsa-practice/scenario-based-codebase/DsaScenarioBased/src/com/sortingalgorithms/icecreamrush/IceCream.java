package com.sortingalgorithms.icecreamrush;

public class IceCream {

	//attribute
	protected String flavor;
	protected int choiceCount;
	
	//constructor
	public IceCream(String flavor, int choiceCount) {
		this.flavor = flavor;
		this.choiceCount = choiceCount;
	}
	
	@Override
	public String toString() {
		return flavor +" = Picked - "+ choiceCount +" times";
	}
	
}
