package com.practice;

public class Fibonacci {

    private static int n1 = 0, n2 = 1, n3;

    public static void main(String[] args) {

        System.out.print(n1 + " " + n2 + " ");
        int n = 10;
        fib(n - 2);

    }

    static void fib(int n) {

        if (n > 0) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;

            fib(n - 1);

        }

    }


}


