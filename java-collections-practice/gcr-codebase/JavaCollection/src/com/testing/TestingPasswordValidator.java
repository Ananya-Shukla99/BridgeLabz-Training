package com.testing;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestingPasswordValidator {

	@Test
	void testValidPasswords() {
		assertTrue(PasswordValidator.isValid("Password1"));
		assertTrue(PasswordValidator.isValid("SecureA9"));
	}

	@Test
	void testInvalidTooShort() {
		assertFalse(PasswordValidator.isValid("Pass1"));
	}

	@Test
	void testInvalidNoUppercase() {
		assertFalse(PasswordValidator.isValid("password1"));
	}

	@Test
	void testInvalidNoDigit() {
		assertFalse(PasswordValidator.isValid("Password"));
	}

	@Test
	void testNullPassword() {
		assertFalse(PasswordValidator.isValid(null));
	}
}
