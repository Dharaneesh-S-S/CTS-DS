package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @BeforeAll
    static void beforeAllTests() {
        System.out.println("=== Starting Calculator Tests ===");
    }

    @BeforeEach
    void setup() {
        calculator = new Calculator();
        System.out.println("Calculator object created");
    }

    @Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3));
        System.out.println("Addition Test Executed");
    }

    @Test
    void testSubtraction() {
        assertEquals(7, calculator.subtract(10, 3));
        System.out.println("Subtraction Test Executed");
    }

    @AfterEach
    void cleanup() {
        System.out.println("Cleaning resources");
    }

    @AfterAll
    static void afterAllTests() {
        System.out.println("=== All Tests Completed ===");
    }
}