package com.MethodRefrences;

@FunctionalInterface
public interface MyInter {

    void sayHello();

    static void staticBody() {
        System.out.println("Hello I am a static Body !!");
    }

    default void defaultBody() {
        System.out.println("Hello I am a Default Body !!");
    }
}
