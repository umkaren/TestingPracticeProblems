package com.junit.testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageMethodTest {
    @DisplayName("Test sum method in AverageMethod")
    @Test
    void sum() {
        assertEquals(15, AverageMethod.sum(2,5,8));
    }

    @DisplayName("Test average method in AverageMethod")
    @Test
    void average() {
        assertEquals(5, AverageMethod.average(AverageMethod.sum(2,5,8)));
    }
}
