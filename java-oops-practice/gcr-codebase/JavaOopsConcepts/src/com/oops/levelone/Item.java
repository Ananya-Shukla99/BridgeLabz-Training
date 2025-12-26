package com.oops.levelone;

public class Item {
    
	String [] itemCode;
	String []  itemName;
	double []  price;
	
	//constructor
	public Item(String[] itemCode, String []itemName, double[]price){
		this.itemCode=itemCode;
		this.itemName=itemName;
		this.price= price;
		
	}
	
	public void display(int i) {
		System.out.println("itemCode : "+itemCode[i]);
		System.out.println("itemPrice : "+price[i]);
		System.out.println("itemName : "+itemName[i]);
		System.out.println("----------------------------");

	}
	public static void main(String[]args) {
		String[] itemName= {"bottle","flower","Shirt"};
		String[] itemCode= {"01AA","01BB","02AA"};
		double[] price= {500,700,400};
        Item obj=new Item(itemName,itemCode, price);
        
        for(int i=0; i<price.length ; i++) {
        	obj.display(i);
        }
	}
}
