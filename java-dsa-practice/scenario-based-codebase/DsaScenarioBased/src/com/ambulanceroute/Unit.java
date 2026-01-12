package com.ambulanceroute;

public class Unit {

	//attribute
	protected String name;
	protected boolean avalibility;
	protected Unit next;
	
	//constructor
	Unit (String name, boolean avalibility){
		this.name=name;
		this.avalibility=avalibility;
		this.next=null;
		
	}
	
	public String toString() {
		return name + " : " +avalibility;
	}
}

