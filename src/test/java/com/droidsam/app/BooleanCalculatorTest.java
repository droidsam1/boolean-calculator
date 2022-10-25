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

    private static Stream<Arguments> shouldAcceptAnyNumberOfAndOrOperators() {
        return Stream.of(Arguments.of("TRUE OR NOT FALSE AND TRUE", true),//
                Arguments.of("TRUE AND NOT FALSE OR FALSE", false),//
                Arguments.of("TRUE OR TRUE OR TRUE AND FALSE", true),//
                Arguments.of("TRUE OR FALSE AND NOT FALSE", true),//
                Arguments.of("TRUE OR NOT FALSE AND NOT FALSE", true));
    }

    private static Stream<Arguments> shouldAcceptParentheses() {
        return Stream.of(Arguments.of("(TRUE)", true), //
                Arguments.of("(FALSE)", false),//
                Arguments.of("(TRUE OR FALSE) AND TRUE", true),//
                Arguments.of("(TRUE OR TRUE OR TRUE) AND FALSE", false),//
                Arguments.of("NOT(TRUE AND TRUE)", false),//
                Arguments.of("(TRUE AND (FALSE OR TRUE)) AND TRUE", true)//
        );
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

    @ParameterizedTest
    @MethodSource()
    public void shouldAcceptAnyNumberOfAndOrOperators(String input, boolean expected) {
        Assertions.assertEquals(expected, BooleanCalculator.evaluate(input));
    }

    @ParameterizedTest
    @MethodSource()
    public void shouldAcceptParentheses(String input, boolean expected) {
        Assertions.assertEquals(expected, BooleanCalculator.evaluate(input));
    }
}
