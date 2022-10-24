package com.droidsam.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class BooleanCalculatorTest {

    private static Stream<Arguments> shouldAcceptSingleValuesAsInput() {
        return Stream.of(Arguments.of("TRUE", true), Arguments.of("FALSe", false));
    }

    @ParameterizedTest
    @MethodSource()
    public void shouldAcceptSingleValuesAsInput(String input, boolean expected) {
        Assertions.assertEquals(expected, BooleanCalculator.evaluate(input));
    }
}
