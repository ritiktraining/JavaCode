package com.Collections;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> course=new HashMap<>();

        // adding elements
        course.put("Core Java",4000);
        course.put("Basic Python",3500);
        course.put("Spring",8000);
        course.put("Android",6000);
        course.put("Android",6000);
        course.put("Android",8000);
        course.put("Android",6000);
        course.put("Android",8000);
        course.put("PHP",5000);
        course.put(null,1200);

        System.out.println(course);
        System.out.println("--------------------");

        course.forEach((k,v)-> System.out.println(k + "=>" + v));

        System.out.println("--------------------------------");

        for(String i: course.keySet()){
            System.out.println(i);
        }
        System.out.println("--------------------------");

        for(Integer i: course.values()){
            System.out.println(i);
        }
    }
}
