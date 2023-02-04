package com.Recursion;

public class Main {
    public static void main(String[] args) {

        print(1);
    }

    static void print(int n) {

        if (n == 5) {
            System.out.println(n);
            return;
        }

        System.out.println(n);

        // this is called tail recursion
        // this is the last function call
        print(n + 1);
    }
}
