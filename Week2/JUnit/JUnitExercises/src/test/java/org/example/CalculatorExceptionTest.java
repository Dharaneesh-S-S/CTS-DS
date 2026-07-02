package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorExceptionTest {

    Calculator calculator = new Calculator();

    @Test
    void testDivideByZero() {

        ArithmeticException exception =
                assertThrows(
                        ArithmeticException.class,
                        () -> calculator.divide(10,0)
                );

        assertEquals(
                "Cannot divide by zero",
                exception.getMessage()
        );

    }

}