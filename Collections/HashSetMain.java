package com.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;

public class HashSetMain {

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();

        hs.add("CSE");
        hs.add("ECE");
        hs.add("EEE");

        Object o = hs.clone();
//        System.out.println(hs.hashCode());
//        System.out.println(o.hashCode());

        Iterator<String> it = hs.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        Spliterator<String> sp = hs.spliterator();




    }
}
