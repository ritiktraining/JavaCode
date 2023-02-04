package com.company;

public class Interface {
    public static void main(String[] args) {

        Cycle c=new Cycle();
        System.out.println(c.run());

    }


}

interface hello
{
    int run();
}

class Cycle implements hello
{


    @Override
    public int run() {
        return 0;
    }
}
