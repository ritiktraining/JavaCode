package com.Recursion;

public class Fibonacci {

    static int n1 = 0, n2 = 1, n3 = 0;

    public static void main(String[] args) {

//        System.out.println(fib(4));
//        int n1 = 0, n2 = 1;
        System.out.print(n1 + " " + n2 + " ");

        int n=20;

        fibbo(n-2);

    }

    static int fib(int n) {

//        int n1=0,n2=1;
        if (n < 2)
            return n;

        return fib(n - 1) + fib(n - 2);

    }

    static void fibbo(int n) {

        if (n > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            System.out.print(n3 + " ");
            fibbo(n - 1);
        }


    }
}
