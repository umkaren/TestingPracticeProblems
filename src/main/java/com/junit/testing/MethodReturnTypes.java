package com.junit.testing;

public class MethodReturnTypes {
    public static void main(String[] args) {
        System.out.println(returnString());
        System.out.println(returnInteger());
        System.out.println(returnBoolean());
    }
    public static String returnString() {
        return "I'm not sure if I understood this correctly.";
    }
    public static int returnInteger() {
        return 10;
    }
    public static boolean returnBoolean() {
        return true;
    }
}
