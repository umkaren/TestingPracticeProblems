package com.junit.testing;


public class DivideMethod {
    public static void main (String[] args) {
        System.out.println("Quotient: " + division(8,4));
    }
    public static double division(int num1, int num2) {
        double dividing = (double) num1 / num2;
        return dividing;
    }
}
