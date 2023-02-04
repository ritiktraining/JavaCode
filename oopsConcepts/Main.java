package com.oopsConcepts;

public class Main {

    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();

        obj1.msg();
        obj2.msg();
        obj3.msg();
    }
}
