package com.annotation.jsonfield;

public class User {
	@JsonField(name = "user_name")
	private String username;

	@JsonField(name = "user_email")
	private String email;

	private int age; 

	public User(String username, String email, int age) {
		this.username = username;
		this.email = email;
		this.setAge(age);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
