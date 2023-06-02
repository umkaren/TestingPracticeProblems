package com.junit.testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivideMethodTest {
    @DisplayName("Test division method in DivideMethod")
    @Test
    void division() {
        assertEquals(2, DivideMethod.division(8,4));
    }
}
