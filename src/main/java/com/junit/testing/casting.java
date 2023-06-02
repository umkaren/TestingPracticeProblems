package com.junit.testing;

public class casting {
    public static void main(String[] args) {
        doubleToInt(12.1);
        stringToInt("2");

    }

    public static double doubleToInt(double data) {
        return (int) data;
    }

    public static int stringToInt(String words) {
        return Integer.parseInt(words);
    }
}
