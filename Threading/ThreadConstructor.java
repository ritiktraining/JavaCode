package com.Threading;

class MyThr extends Thread {


    MyThr(String name) {
        super(name);
    }


    @Override
    public void run() {

        int i = 34;
        System.out.println("ThankYou");
//         while (true){
//             System.out.println("I am a thread");
//         }
    }


}

public class ThreadConstructor {
    public static void main(String[] args) {

        MyThr myThr = new MyThr("Ritik");
        MyThr myThr2 = new MyThr("Shubham");
        myThr.start();
        System.out.println("The id of thread t is " + myThr.getId());
        System.out.println("The name of thread t is " + myThr.getName());

        System.out.println("The id of thread t is " + myThr2.getId());
        System.out.println("The name of thread t is " + myThr2.getName());
    }
}
