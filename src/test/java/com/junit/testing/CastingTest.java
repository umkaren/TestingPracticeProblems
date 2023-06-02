package com.junit.testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CastingTest {
    @DisplayName("Test doubletoInt method in casting")
    @Test
    public void doubletoInt() {
        assertEquals(12, casting.doubleToInt(12.1));
    }

    @DisplayName("Test stringToInt method in casting")
    @Test

    public void stringToInt() {
        assertEquals(2, casting.stringToInt("2"));
    }
}

