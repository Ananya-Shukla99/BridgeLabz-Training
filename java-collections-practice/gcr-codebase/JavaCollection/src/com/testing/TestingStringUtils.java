package com.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestingStringUtils {

	@Test
	void testReverse() {
		assertEquals("cba", StringUtils.reverse("abc"));
		assertEquals("", StringUtils.reverse(""));
		assertNull(StringUtils.reverse(null));
	}

	@Test
	void testIsPalindrome() {
		assertTrue(StringUtils.isPalindrome("madam"));
		assertTrue(StringUtils.isPalindrome(""));
		assertFalse(StringUtils.isPalindrome("hello"));
		assertFalse(StringUtils.isPalindrome(null));
	}

	@Test
	void testToUpperCase() {
		assertEquals("HELLO", StringUtils.toUpperCase("hello"));
		assertEquals("", StringUtils.toUpperCase(""));
		assertNull(StringUtils.toUpperCase(null));
	}
}
