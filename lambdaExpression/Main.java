package com.lambdaExpression;

public class Main {

    static int findLength(String s) {
        return s.length();
//        System.out.println(s.length());
    }

    public static void main(String[] args) {

        System.out.println("My System Starts..");

//        MyInterImpl myInter=new MyInterImpl();
//        myInter.sayHello();

//        MyInter i = new MyInter() {
//            @Override
//            public void sayHello() {
//
//                System.out.println("This is first anonymous class");
//            }
//        };
//
//        i.sayHello();
//
//        MyInter i2=new MyInter() {
//            @Override
//            public void sayHello() {
//                System.out.println("Second Implementation of anonymous class");
//            }
//        };
//
//        i2.sayHello();

        // using our interface with the help of Lamda

//        MyInter i=() -> System.out.println("My lamda Expression");
//
//        i.sayHello();
//
//        MyInter i2=()-> System.out.println("Second tome using lamda");
//        i2.sayHello();

//        Sum sum = (a, b) -> a + b;
//
//
//        System.out.println(sum.sum(8,9));
//        System.out.println(sum.sum(10,25));

        MyInter i = () -> System.out.println("hello");


        StrLengthInter l = str -> str.length();

        StrLengthInter length = Main::findLength;

//        System.out.println(length.length("asadd"));

//        System.out.println(l.length("Ritik"));
//        System.out.println(l.length("Shubham"));
//        System.out.println(l.length("JC"));

        OddEven o = (n) -> n % 2 == 0;
        System.out.println(o.isOddOrEven(4));


    }
}
