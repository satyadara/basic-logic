package com.satyadara.basiclogic;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /* MATHEMATICS */
        System.out.println("Power       : " + Mathematics.pow(2, 3));
        System.out.println("Fibonacci   : " + Mathematics.fibonacci(7));
        System.out.println("Prime       : " + Mathematics.isPrime(3, 2));
        System.out.println("Factorial   : " + Mathematics.factorial(5));
        System.out.println("Prime Factor: " + Mathematics.primeFactor(new ArrayList<>(), 45, 2));
        System.out.println("=====================");

        /* Sentences */
        String val = "APA";
        System.out.println("Reverse String  : " + Sentences.reverseString(val, val.length()));
        System.out.println("Palindrome      : " + Sentences.palindrome(val));
        System.out.println("Palindrome 2    : " + Sentences.palindromeWithoutReverseString(val));
        System.out.println("Index Of Str    : " + Sentences.indexOf("Blibli.com", "li."));
        System.out.println("Index Of Str 2  : " + Sentences.indexOf("Blibli.com", "li.", 0));
        System.out.println("Unique Chars    : " + Sentences.uniqueCharacters("unik"));
        /* Pattern */
        System.out.println("====================");
        System.out.println("Triangle    : \n" + EzPattern.triangle(5, 0, 0));
        System.out.println("Pascal      : \n" + EzPattern.pascal(6));
        System.out.println("Floyds      : \n" + EzPattern.floyds(6));
        System.out.println("Print Parenthesis : \n");
        EzPattern.printParenthesis(new char[2 * 3], 3);
    }
}
