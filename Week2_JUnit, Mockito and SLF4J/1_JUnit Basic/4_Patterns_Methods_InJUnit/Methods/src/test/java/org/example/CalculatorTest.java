package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calc;

    // Setup method (runs before each test)
    @Before
    public void setUp() {
        System.out.println("Setting up Calculator...");
        calc = new Calculator();
    }

    // Teardown method (runs after each test)
    @After
    public void tearDown() {
        System.out.println("Cleaning up Calculator...");
        calc = null;
    }

    @Test
    public void testAddition() {
        // Act
        int result = calc.add(10, 5);

        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testSubtraction() {
        int result = calc.subtract(10, 4);
        assertEquals(6, result);
    }

    @Test
    public void testMultiplication() {
        int result = calc.multiply(3, 7);
        assertEquals(21, result);
    }

    @Test
    public void testDivision() {
        int result = calc.divide(20, 4);
        assertEquals(5, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        calc.divide(10, 0);
    }
}
