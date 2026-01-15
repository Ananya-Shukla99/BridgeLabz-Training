package com.callcenter;

public class Customer {

	//attribute 
	protected String id;
    protected String name;
    protected boolean vip;
	
	//constructor without priority
    public Customer(String id, String name, boolean vip) {
        this.id = id;
        this.name = name;
        this.vip = vip;
    }
}
