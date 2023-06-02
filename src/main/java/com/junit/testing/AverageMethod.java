package com.junit.testing;

public class AverageMethod {
    public static void main(String[] args) {
        System.out.println("Average: " + average(sum(2,5,8)));
    }
    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    public static double average(int total) {
        return (double) total / 3;
    }
}
