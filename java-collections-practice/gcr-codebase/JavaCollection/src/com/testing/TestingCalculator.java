package com.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestingCalculator {

	private Calculator calculator;
	
	@BeforeEach
	void setUp() {
		calculator = new Calculator();
	}
	
	@Test
	void testAdd() {
		assertEquals(9, calculator.add(3, 6));
	}
	
	 @Test
	    void testSubtract() {
	        assertEquals(6, calculator.subtract(10, 4));
	    }
	 
	 @Test
	    void testMultiply() {
	        assertEquals(20, calculator. multiplication(4, 5));
	    }
	 
	 @Test
	    void testDivide() {
	        assertEquals(5, calculator.division(10, 2));
	    }

	 @Test
	 void testDivideByZero() {
		 assertThrows(ArithmeticException.class, () -> {
			 calculator.division(9,0);
		 });
		 
	 }
}

