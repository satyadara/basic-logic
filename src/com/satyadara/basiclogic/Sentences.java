package com.satyadara.basiclogic;

public class Sentences {
    String reverseString(String original, int size) {
        return size == 0 ? "" : original.charAt(size - 1) + reverseString(original, size - 1);
    }

    boolean palindrome(String string)   {
        return string.equalsIgnoreCase(reverseString(string, string.length()));
    }

    boolean palindromeWithoutReverseString(String string) {
        int begin, end, length, middle, i;
        length = string.length();
        begin = 0;
        end    = length - 1;
        middle = end/2;

        for (i = begin; i <= middle; i++) {
            if (string.charAt(begin) == string.charAt(end)) {
                begin++;
                end--;
            }
            else {
                break;
            }
        }

        return i == middle + 1;
    }
}
