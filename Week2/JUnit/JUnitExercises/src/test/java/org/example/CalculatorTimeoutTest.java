package org.example;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class CalculatorTimeoutTest {

    Calculator calculator = new Calculator();

    @Test
    void testTimeout() {

        assertTimeout(
                Duration.ofSeconds(2),
                () -> calculator.process()
        );

    }

}