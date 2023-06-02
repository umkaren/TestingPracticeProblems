package com.junit.testing;

import java.util.Scanner;
public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter another number:");
        int num2 = Integer.valueOf(scanner.nextLine());

        System.out.println("Sum: " + addition(num1, num2));

        System.out.println("Difference: " + subtraction(num1, num2));

        System.out.println("Product: " + multiplication(num1, num2));

        System.out.println("Quotient: " + division(num1, num2));

        System.out.println("Modulus: " + modulus(num1, num2));
    }

    public static int addition(int one, int two) {
        return one + two;
    }

    public static int subtraction(int one, int two) {
        return one - two;
    }

    public static int multiplication(int one, int two) {
        return one * two;
    }

    public static double division(int one, int two) {
        return (double) one / two;
    }

    public static int modulus(int one, int two) {
        return one % two;
    }
}
