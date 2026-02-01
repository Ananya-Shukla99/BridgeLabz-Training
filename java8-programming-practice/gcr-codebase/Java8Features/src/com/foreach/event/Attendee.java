package com.foreach.event;

public class Attendee {

	String name;
	String EventType;
	
	
	public Attendee(String name, String eventType) {
		
		this.name = name;
		EventType = eventType;
	}
	
	@Override
	public String toString() {
		return "Attendee [name=" + name + ", EventType=" + EventType + "]";
	}
}
