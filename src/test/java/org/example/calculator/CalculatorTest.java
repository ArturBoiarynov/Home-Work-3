package org.example.calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(5.0, calculator.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(-1.0, calculator.subtract(2, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(6.0, calculator.multiply(2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2.5, calculator.divide(5, 2));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
    }
}
