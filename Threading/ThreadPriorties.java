package com.Threading;

class MyThr1 extends Thread{


    MyThr1(String name){
        super(name);
    }


    @Override
    public void run(){

        int i=34;
        System.out.println("ThankYou" + " " + this.getName());
//         while (true){
//             System.out.println("I am a thread");
//         }
    }


}

public class ThreadPriorties {


    public static void main(String[] args) {

        MyThr1 t1 = new MyThr1("Ritik");
        MyThr1 t2 = new MyThr1("Ankit");
        MyThr1 t3 = new MyThr1("Shubham");
        MyThr1 t4 = new MyThr1("JC");
        MyThr1 t5 = new MyThr1("Abhishek");

        t2.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
