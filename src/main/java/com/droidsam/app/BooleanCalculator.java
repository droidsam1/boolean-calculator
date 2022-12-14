package com.droidsam.app;

public class BooleanCalculator {


    public static boolean evaluate(String input) {
        return evaluateOperators(processParentheses(input));
    }

    private static String processParentheses(String input) {
        while (input.contains("(")) {
            String nestedOperation = input.substring(input.lastIndexOf("("), input.indexOf(")", input.lastIndexOf("(")) + 1);
            input = input.replace(nestedOperation, Boolean.toString(evaluateOperators(nestedOperation.replace("(", "").replace(")", ""))));
        }
        return input;
    }

    private static boolean evaluateOperators(String input) {
        String[] operands = input.toLowerCase().split("and");
        boolean result = true;
        for (String operand : operands) {
            result &= evaluateSimpleElement(operand);
        }

        operands = input.toLowerCase().split("or");
        for (String operand : operands) {
            result |= evaluateSimpleElement(operand);
        }

        return result;
    }

    private static boolean evaluateSimpleElement(String input) {
        return Boolean.parseBoolean(//
                input.toLowerCase() //
                        .replace(" ", "") //
                        .replace("not", "!") //
                        .replace("!true", "false") //
                        .replace("!false", "true")); //
    }
}
