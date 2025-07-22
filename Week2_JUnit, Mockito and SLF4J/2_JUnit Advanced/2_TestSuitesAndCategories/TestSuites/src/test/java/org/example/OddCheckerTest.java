package org.example;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class OddCheckerTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7})
    void testOddNumbers(int number) {
        assertTrue(OddChecker.isOdd(number), number + " should be odd");
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    void testEvenNumbersAreNotOdd(int number) {
        assertFalse(OddChecker.isOdd(number), number + " should not be odd");
    }
}

