package com.Collections;

import java.util.*;

public class ListMain {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        LinkedList<String> l1 = new LinkedList<>();
        LinkedList<String> l2 = new LinkedList<>();

        l1.add("Ritik");
        l1.add("RAHUL");
        l1.add("AMAN");
        l1.add("RAHUL");


        l2.add("Ritik");
        l2.add("CSE");
        l2.add("ECE");
        l2.add("EEE");


        l2.addAll(l1);

        String[] arr = l2.toArray(new String[l2.size()]);

//        System.out.println(Arrays.toString(arr));

//        System.out.println(l2.lastIndexOf("RAHUL"));
//        System.out.println(l2.indexOf("RAHUL"));

//        System.out.println(l2.get(0).equals(l1.get(0)));

//        System.out.println(l2.contains("EEE"));

//        System.out.println(l2.removeAll(l1));

//        l2.sort((a,b)->a.compareTo(b));

        Collections.sort(l2);


//        System.out.println(l1);
//        System.out.println(l2);

        ListIterator<String> it = l2.listIterator();

        while (it.hasPrevious()){
            System.out.println(it.previous());
        }

    }

}
