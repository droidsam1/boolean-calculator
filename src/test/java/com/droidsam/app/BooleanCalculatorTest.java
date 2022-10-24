package com.droidsam.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BooleanCalculatorTest {

    @Test
    public void shouldAcceptSingleValueTrueAsInput() {
        Assertions.assertTrue(BooleanCalculator.evaluate("TRUE"));
    }

    @Test
    public void shouldAcceptSingleValuesFalseAsInput() {
        Assertions.assertFalse(BooleanCalculator.evaluate("FALSE"));
    }
}
