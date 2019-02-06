package com.satyadara.basiclogic;

public class Sentences {
    String reverseString(String original, int size) {
        return size == 0 ? "" : original.charAt(size - 1) + reverseString(original, size - 1);
    }

    boolean palindrome(String string)   {
        return string.equalsIgnoreCase(reverseString(string, string.length()));
    }
}
