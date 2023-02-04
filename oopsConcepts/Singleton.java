package com.oopsConcepts;

public class Singleton {

    private Singleton() {

    }

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public void msg(){
        System.out.println("Hello Helll");
    }
}
