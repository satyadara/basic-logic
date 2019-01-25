package com.satyadara.basiclogic;

public class Main {

    public static void main(String[] args) {
        Mathematics mathematics = new Mathematics();
        System.out.println("Power       : " + mathematics.pow(2, 3));
        System.out.println("Fibonacci   : " + mathematics.fibonacci(2));
        System.out.println("Prime       : " + mathematics.isPrime(3, 2));
        System.out.println("=====================");
        Sentences sentences = new Sentences();
        System.out.println("Reverse String : " + sentences.reverseString("satya syahputra", 15));
        
    }


}
