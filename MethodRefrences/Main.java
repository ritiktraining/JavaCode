package com.MethodRefrences;

public class Main {



    public static void main(String[] args) {

        // Static Method Refrence
        MyInter i=Demo::staticRefrence;
        i.sayHello();
//        i.defaultBody();
//        MyInter.staticBody();


        // Constructor Method Refrence
        MyInter s=Demo::new;
        s.sayHello();

        // Instance Method Refrence
        Demo d = new Demo();
        MyInter c=d::methodRefrence;
        c.sayHello();
//        d.defaultBody();


    }
}
