package com.example.Code;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

	@Test
	void testAdd() {
		// Arrange
		CalculatorService calculatorService = new CalculatorService();

		// Act
		int result = calculatorService.add(8, 12);

		// Assert
		assertEquals(20, result);
	}
}

