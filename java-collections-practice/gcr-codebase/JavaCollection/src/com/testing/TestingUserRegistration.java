package com.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestingUserRegistration {

	@Test
	void testValidUserRegistration() {
		assertTrue(UserRegistration.registerUser("aman_sahu", "aman@example.com", "secret98123"));
	}

	@Test
	void testInvalidUsername() {
		assertThrows(IllegalArgumentException.class, () -> {
			UserRegistration.registerUser("", "Sudha@example.com", "9990000");
		});
	}

	@Test
	void testInvalidPassword() {
		assertThrows(IllegalArgumentException.class, () -> {
			UserRegistration.registerUser("Ravi_rai", "Ravi@example.com", "123");
		});
	}

}
