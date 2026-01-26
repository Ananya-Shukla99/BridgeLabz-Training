package com.testing;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TestingMathUtils {

	@Test
	void testDivideByZero() {
		assertThrows(ArithmeticException.class, () -> {
			MathUtils.divide(9, 0);
		});
	}

}
