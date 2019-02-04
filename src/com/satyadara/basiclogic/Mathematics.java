package com.satyadara.basiclogic;

import java.util.ArrayList;

class Mathematics {
    int pow(int num, int n) {
        return n == 0 ? 1 : num * pow(num, n - 1);
    }

    int fibonacci(int n) {
        return n == 0 ? 0 : n == 1 ? 1 : fibonacci(n - 1) + fibonacci(n - 2);
    }

    boolean isPrime(int number, int div) {
        if (number <= 2) return number == 2;
        if (number % div == 0) return false;
        if (div * div > number) return true;

        return isPrime(number, div + 1);
    }

    int factorial(int n) {
        return n == 1 ? 1 : n * factorial(--n);
    }

    ArrayList<Integer> primeFactor(ArrayList<Integer> list, int num, int div) {
        if (num == div) {
            list.add(div);
            return list;
        }
        if (isPrime(div, 2)) {
            if (num % div == 0) {
                list.add(div);
                return primeFactor(list, num / div, div);
            } else {
                return primeFactor(list, num, ++div);
            }
        } else {
            return primeFactor(list, num, ++div);
        }
    }
}
