package com.satyadara.basiclogic;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Mathematics mathematics = new Mathematics();
        System.out.println("Power       : " + mathematics.pow(2, 3));
        System.out.println("Fibonacci   : " + mathematics.fibonacci(2));
        System.out.println("Prime       : " + mathematics.isPrime(3, 2));
        System.out.println("Factorial   : " + mathematics.factorial(5));
        System.out.println("Prime Factor: " + mathematics.primeFactor(new ArrayList<>(), 45, 2));
        System.out.println("=====================");
        Sentences sentences = new Sentences();
        String val = "APA";
        System.out.println("Reverse String  : " + sentences.reverseString(val, val.length()));
        System.out.println("Palindrome      : " + sentences.palindrome(val));
        System.out.println("====================");
        EzPattern pattern = new EzPattern();
        System.out.println("Triangle    : \n" + pattern.triangle(5, 0, 0));

    }


}
