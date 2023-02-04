package com.Collections;

import java.util.*;

public class StartCode {
    public static void main(String[] args) {

        // type safe
        ArrayList<String> names = new ArrayList<>();
        names.add("Ritik");
        names.add("Ankit");
        names.add("Sanjay");

//        names.remove("Sanjay");

        // remove that element
//        names.set(1,"Shubham");

        // shift that element one forward
//        names.add(1,"Shubham");

        // remove all elements
//        names.clear();
//        names.removeAll(names);

        System.out.println(names);

        Vector<String> vector = new Vector<>();
        vector.addAll(names);

        System.out.println(vector);

        System.out.println("---------------------------------------------------");

//        names.forEach((String name) -> System.out.println(name));
//
//        for (String name : names
//        ) {
//            System.out.println(name);
//        }
        // it call equals method of the type
//        System.out.println(names.contains("Ankit"));


        //untype safe
//        LinkedList list=new LinkedList();
//        list.add("Sachin");
//        list.add(2);
//        list.add(true);
//        System.out.println(list);

        HashSet<Double> nms = new HashSet<>();
        nms.add(14.14);
        nms.add(123.25);
        nms.add(140.24);
        nms.add(140.24);
        nms.add(156.789);

        System.out.println(nms);

        TreeSet<Double> tset = new TreeSet<>();
        tset.addAll(nms);
        System.out.println(tset);
        System.out.println(tset.descendingSet());

        System.out.println("---------------------------------");

        Iterator<String> itr = names.iterator();

        while (itr.hasNext()) {
            String next = itr.next();
            System.out.println(next);
        }
        System.out.println("---------------------");

        // backward traversal

        ListIterator<String> listIterator = names.listIterator(names.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        System.out.println("---------------FOR EACH METHOD------------------------");

        names.forEach(e-> System.out.println(e));

        System.out.println("--------------------------------");



    }
}
