package com.example.test.util;

public class StringCaseConverter {
    // Converts a string to uppercase
    public static String toUpperCase(String input) {
        if (input == null) {
            return null;
        }
        return input.toUpperCase();
    }

    // Converts a string to lowercase
    public static String toLowerCase(String input) {
        if (input == null) {
            return null;
        }
        return input.toLowerCase();
    }
}
