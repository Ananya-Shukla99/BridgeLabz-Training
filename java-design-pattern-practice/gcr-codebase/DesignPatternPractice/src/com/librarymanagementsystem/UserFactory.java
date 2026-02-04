package com.librarymanagementsystem;

public class UserFactory {

	public static User createUser(String type, String name) {
		
		if(type.equalsIgnoreCase("Student")){
			return new Student( name);
		}
		else if(type.equalsIgnoreCase("faculty")){
			return new Faculty(name);
		}
		else if(type.equalsIgnoreCase("librarian")){
			return new Librarian(name);
		}
		else
			return null;
	}
}
