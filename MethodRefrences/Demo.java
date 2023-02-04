package com.MethodRefrences;

public class Demo {

    // Constructor Refrence
    Demo() {
        System.out.println("Demo Class Constructor Refrence is Calling !!");
    }

    // Static Refrence
    static int staticRefrence() {
        System.out.println("hello Demo class static Refrence is calling");
        int n = 5;
        System.out.println(n);
        return n;
    }

    // Instance Mehod Refrence
    public void methodRefrence() {
        System.out.println("Method Refrence is Calling !!");
    }


//    @Override
//    public void sayHello() {
//
//        System.out.println("Inteface Implementation");
//
//    }
//
//    @Override
//    public void defaultBody() {
//        System.out.println("Default Body Implementation");
//    }

}
