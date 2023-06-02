package com.junit.testing;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class MethodReturnTypesTest {
    @DisplayName("Test returnString method in MethodReturnTypes")
    @Test
    void returnString() {
        String result = MethodReturnTypes.returnString();
        Assert.assertTrue(result instanceof String);
    }

    @DisplayName("Test returnInteger method in MethodReturnTypes")
    @Test
    void returnInteger() {
        Assert.assertEquals(int.class, Integer.TYPE); //since this is primitive, we must use assertsEquals to verify the return value matches the expected type
    }

    @DisplayName("Test returnBoolean method in MethodReturnTypes")
    @Test
    void returnBoolean() {
        Assert.assertEquals(boolean.class, Boolean.TYPE); //primitive types should use assertEquals
    }
}
