package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionThrowerTest {

    @Test
    void testThrowsIllegalArgumentException() {
        ExceptionThrower et = new ExceptionThrower();

        // Assert that IllegalArgumentException is thrown when input is null
        assertThrows(IllegalArgumentException.class, () -> {
            et.throwException(null);
        });
    }
}

