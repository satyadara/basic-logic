package com.satyadara.basiclogic;

public class Main {

    public static void main(String[] args) {
        Mathematics mathematics = new Mathematics();
        System.out.println("Power       : " + mathematics.pow(2, 3));
        System.out.println("Fibonacci   : " + mathematics.fibonacci(2));
        System.out.println("Prime       : " + mathematics.isPrime(3, 2));
    }


}
