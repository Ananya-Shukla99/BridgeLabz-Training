package com.ambulanceroute;

public class AmbulanceRoute {

	public static void main(String[]args) {
		
		//creating unit objects 
		Unit one=new Unit ("Emergency", true );
		Unit two=new Unit ("Radiology", true );
		Unit three=new Unit ("Surgery", true );
		Unit four=new Unit ("ICU", true );
		
		//creating linked list 
		AbulanceLinkedList list=new AbulanceLinkedList();
		
		//adding units 
		list.addUnit(one);
		list.addUnit(two);
		list.addUnit(three);
		list.addUnit(four);
		
		//admitting patient and displaying changes 
		list.admit(one);
		list.display();
		
		list.admit(four);
		list.display();
		
		list.discharge(four);
		list.display();

		list.discharge(one);
		list.display();
	}
}
