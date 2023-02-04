package com.practice;

public class Factorial {

    public static void main(String[] args) {
        int n = 6;
        int fact = fact(n);
        System.out.println(fact);
    }

    static int fact(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }


    }
}
