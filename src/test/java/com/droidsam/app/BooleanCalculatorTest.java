package com.droidsam.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class BooleanCalculatorTest {

    private static Stream<Arguments> shouldAcceptSingleValuesAsInput() {
        return Stream.of(Arguments.of("TRUE", true), Arguments.of("FALSE", false));
    }

    private static Stream<Arguments> shouldAcceptTheNotOperator() {
        return Stream.of(Arguments.of("NOT TRUE", false), Arguments.of("NOT FALSE", true));
    }

    private static Stream<Arguments> shouldAcceptTheAndOperator() {
        return Stream.of(Arguments.of("TRUE AND FALSE", false), Arguments.of("TRUE AND TRUE", true));
    }

    private static Stream<Arguments> shouldAcceptTheOrOperator() {
        return Stream.of(Arguments.of("TRUE OR FALSE", true), Arguments.of("TRUE OR TRUE", true), Arguments.of("FALSE OR FALSE", false));
    }


    @ParameterizedTest
    @MethodSource()
    public void shouldAcceptSingleValuesAsInput(String input, boolean expected) {
        Assertions.assertEquals(expected, BooleanCalculator.evaluate(input));
    }

    @ParameterizedTest
    @MethodSource()
    public void shouldAcceptTheNotOperator(String input, boolean expected) {
        Assertions.assertEquals(expected, BooleanCalculator.evaluate(input));
    }

    @ParameterizedTest
    @MethodSource()
    public void shouldAcceptTheAndOperator(String input, boolean expected) {
        Assertions.assertEquals(expected, BooleanCalculator.evaluate(input));
    }

    @ParameterizedTest
    @MethodSource()
    public void shouldAcceptTheOrOperator(String input, boolean expected) {
        Assertions.assertEquals(expected, BooleanCalculator.evaluate(input));
    }
}
