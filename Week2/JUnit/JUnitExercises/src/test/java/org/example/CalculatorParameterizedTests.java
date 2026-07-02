package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorParameterizedTests {

    Calculator calculator = new Calculator();

    @ParameterizedTest
    @CsvSource({
            "2,4",
            "3,9",
            "4,16",
            "5,25"
    })
    void testSquare(int input, int expected) {

        assertEquals(expected, calculator.square(input));

    }

}