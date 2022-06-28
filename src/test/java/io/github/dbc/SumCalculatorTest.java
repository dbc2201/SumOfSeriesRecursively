package io.github.dbc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumCalculatorTest {

    private SumCalculator sumCalculator;

    @BeforeEach
    void setUp() {
        sumCalculator = new SumCalculator();
    }

    @ParameterizedTest(name = "sum of first {0} natural numbers is {1}.")
    @CsvSource({"0, 0", "1, 1", "2, 3", "3, 6", "4, 10", "5, 15", "6, 21", "7, 28", "8, 36", "9, 45", "10, 55"})
    void sum(int number, int expected) {
        assertEquals(expected, sumCalculator.sum(number));
    }
}