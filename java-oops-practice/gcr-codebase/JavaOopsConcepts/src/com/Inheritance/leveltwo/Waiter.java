package com.Inheritance.leveltwo;

public class Waiter extends Personn implements Worker{

	public Waiter(String name, int id) {
		super(name, id);
	}
	
	@Override
	public void performDuties() {
		System.out.println("Waiter "+name+" is serving customers.");
	}
}
