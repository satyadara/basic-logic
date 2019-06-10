package com.satyadara.basiclogic;

import java.util.Arrays;

public class Sentences {
    static String reverseString(String original, int size) {
        return size == 0 ? "" : original.charAt(size - 1) + reverseString(original, size - 1);
    }

    static boolean palindrome(String string) {
        return string.equalsIgnoreCase(reverseString(string, string.length()));
    }

    static boolean palindromeWithoutReverseString(String string) {
        int begin, end, length, middle, i;
        length = string.length();
        begin = 0;
        end = length - 1;
        middle = end / 2;

        for (i = begin; i <= middle; i++) {
            if (string.charAt(begin) == string.charAt(end)) {
                begin++;
                end--;
            } else {
                break;
            }
        }

        return i == middle + 1;
    }

    static int indexOf(String s1, String s2) {
        int result = -1;
        for (int i = 0; i < s1.length() - s2.length() + 1; i++) {
            if (s1.substring(i, i + s2.length()).equals(s2)) {
                result = i;
                break;
            }
        }
        return result;
    }

    static int indexOf(String s1, String s2, int pos) {
        return pos == s1.length() - 1 ? -1 : (s1.substring(pos, pos + s2.length()).equals(s2)) ? pos : indexOf(s1, s2, ++pos);
    }

    static boolean uniqueCharacters(String str)
    {
        char[] chArray = str.toCharArray();

        Arrays.sort(chArray);

        for (int i = 0; i < chArray.length - 1; i++) {
            if (chArray[i] != chArray[i + 1])
                continue;
            else
                return false;
        }
        return true;
    }
}
