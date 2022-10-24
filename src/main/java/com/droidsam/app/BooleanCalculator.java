package com.droidsam.app;

public class BooleanCalculator {


    public static boolean evaluate(String input) {
        String[] operands = input.toLowerCase().split("and");
        boolean result = true;
        for (String operand : operands) {
            result &= parseBoolean(operand);
        }
        return result;
    }

    private static boolean parseBoolean(String input) {
        return Boolean.parseBoolean(//
                input.toLowerCase() //
                        .replace(" ", "") //
                        .replace("not", "!") //
                        .replace("!true", "false") //
                        .replace("!false", "true")); //
    }
}
