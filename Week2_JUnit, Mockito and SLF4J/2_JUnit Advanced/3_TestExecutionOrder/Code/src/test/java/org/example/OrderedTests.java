package org.example;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {

    @Test
    @Order(1)
    void initialize() {
        System.out.println("Step 1: Initialization");
        assertTrue(true);
    }

    @Test
    @Order(2)
    void performAction() {
        System.out.println("Step 2: Performing action");
        assertTrue(true);
    }

    @Test
    @Order(3)
    void cleanup() {
        System.out.println("Step 3: Cleanup");
        assertTrue(true);
    }
}

