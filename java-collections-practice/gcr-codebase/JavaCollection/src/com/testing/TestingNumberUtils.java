package com.testing;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestingNumberUtils {

	@ParameterizedTest
	@ValueSource(ints = {2,4, 6})
	void testEven(int num) {
		assertTrue(NumberUtils.isEven(num));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {9,5})
	void testOdd(int num) {
		assertFalse(NumberUtils.isEven(num));
	}
}
