package com.droidsam.app;

public class BooleanCalculator {


    public static boolean evaluate(String input) {
        return Boolean.parseBoolean(
                input.toLowerCase()
                        .replace(" ", "")
                        .replace("not", "!")
                        .replace("!true", "false")
                        .replace("!false", "true"));
    }
}
