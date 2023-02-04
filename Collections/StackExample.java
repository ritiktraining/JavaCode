package com.Collections;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(4);
        s.push(6);
        s.push(8);

        Iterator<Integer> iterator = s.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
