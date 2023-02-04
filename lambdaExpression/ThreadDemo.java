package com.lambdaExpression;

public class ThreadDemo {

    public static void main(String[] args) {

        Runnable thread1=()->{
            // this is the body of thread
            for (int i=1;i<=10;i++){
                System.out.println("Value of i is " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t=new Thread(thread1);
        t.setName("Hello");
        t.start();

        Runnable thread2=()->{
            for(int i=1;i<=10;i++){
                System.out.println("2 * " + i + " = " + 2* i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t2=new Thread(thread2);
        t2.setName("t2");
        t2.start();
    }
}
