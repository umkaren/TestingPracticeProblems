package com.junit.testing;

import org.junit.*;

public class CalculationsTest {

    @Test
    public void testAddition() {
        int result = Calculations.addition(3, 4);
        Assert.assertEquals(7, result);
    }

    @Test
    public void testSubtraction() {
        int result = Calculations.subtraction(3, 4);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testMultiplication() {
        int result = Calculations.multiplication(3, 4);
        Assert.assertEquals(12, result);
    }

    @Test
    public void testDivision() {
        double result = Calculations.division(3, 4);
        Assert.assertEquals(0.75, result, 0.001);
    }

    @Test
    public void testModulus() {
        int result = Calculations.modulus(3, 4);
        Assert.assertEquals(3, result);
    }
}
