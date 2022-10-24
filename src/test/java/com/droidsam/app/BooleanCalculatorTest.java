package com.droidsam.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BooleanCalculatorTest {

    @Test
    public void shouldAcceptSingValuesAsInput() {
        Assertions.assertTrue(BooleanCalculator.evaluate("TRUE"));
    }
}
