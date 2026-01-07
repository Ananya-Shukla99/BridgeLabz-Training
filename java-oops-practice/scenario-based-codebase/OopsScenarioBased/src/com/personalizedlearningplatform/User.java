package com.personalizedlearningplatform;

abstract class User {

	//attribute
	String name;
	String email;
	int UserId;
	
	//constructor
	User(String name, String email, int UserId){
		this.name=name;
		this.email=email;
		this.UserId=UserId;
	}
	
}
