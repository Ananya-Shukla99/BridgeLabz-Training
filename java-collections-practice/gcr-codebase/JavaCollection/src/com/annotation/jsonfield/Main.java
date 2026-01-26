package com.annotation.jsonfield;

public class Main {
	public static void main(String[] args) throws Exception {
		User user = new User("Purvi", "purvi@gmail.com", 25);
		String json = JsonSerializer.toJson(user);
		System.out.println(json);
	}
}