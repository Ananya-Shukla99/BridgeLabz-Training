package com.foreach.notifications;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<String> emails = Arrays.asList("alice@example.com", "bob@example.com", "charlie@example.com",
				"diana@example.com", "ethan@example.com");

		emails.forEach(email -> sendEmailNotification(email));
	}

	public static void sendEmailNotification(String email) {
		System.out.println("Notification sent to: " + email);
	}
}
