package com.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestingDateFormatter {

	@Test
	void testValidDate() {
		assertEquals("15-08-2023", DateFormatter.formatDate("2023-08-15"));
	}

	@Test
	void testAnotherValidDate() {
		assertEquals("01-01-2024", DateFormatter.formatDate("2024-01-01"));
	}

	@Test
	void testInvalidDateFormat() {
		assertNull(DateFormatter.formatDate("15-08-2023"));
	}

	@Test
	void testInvalidDateValue() {
		assertNull(DateFormatter.formatDate("2023-13-40"));
	}

	@Test
	void testNullInput() {
		assertNull(DateFormatter.formatDate(null));
	}
}
