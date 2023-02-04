package com.Threading;

class Example extends Thread{

    @Override
    public void run() {
        System.out.println("This thread is Example");
    }

    Example(String name){
        super(name);
    }

    Example(Runnable r,String name){
        super(r,name);
    }

    Example(Runnable r){
        super(r);
    }

}


class Other implements Runnable{

    @Override
    public void run() {
        System.out.println("This thread is Other");
    }
}

public class ThreadRunnableExample {

    public static void main(String[] args) {
        Other o=new Other();
        Example e = new Example(o);
        Thread thread = new Thread(e);
        e.start();
        thread.start();
        System.out.println(e.getId() + " " + e.getName());
        System.out.println(thread.getId() + " " +  thread.getName());
    }
}
