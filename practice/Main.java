package com.practice;

class Outer{
    int a=20;

    class Inner{
        int b=10;
    }
}

public class Main {

    public static void main(String[] args) {
        Outer outer=new Outer();
        Outer.Inner inner=outer.new Inner();

        System.out.println(outer.a);
        System.out.println(inner.b);
    }
}
