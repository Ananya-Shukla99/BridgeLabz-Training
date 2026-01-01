package com.Inheritance.leveltwo;

public class PersonnMain {
	
	public static void main(String[] args) {
        Worker chef = new Chef("Arjun", 101);
        Worker waiter = new Waiter("Ravi", 102);

        chef.performDuties();
        waiter.performDuties();
    }

}
