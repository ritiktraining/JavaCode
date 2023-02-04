package com.Threading;

class MyThr2 extends Thread {


    @Override
    public void run() {

        int i = 0;
        while(i<500) {
            System.out.println("ThankYou");
            i++;
        }

//         while (true){
//             System.out.println("I am a thread");
//         }
    }


}

class MyThr3 extends Thread{





    @Override
    public void run(){

        int i=0;
        while(i<600) {
            System.out.println("Welcome");
            i++;
        }

//         while (true){
//             System.out.println("I am a thread");
//         }
    }


}

public class ThreadMethods {
    public static void main(String[] args) {
        MyThr2 t1 = new MyThr2();
        MyThr3 t2 = new MyThr3();

        t1.start();
//        try {
//            t1.join();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
        t2.start();

    }
}
