package com.practice;

import com.company.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);


//        ArrayList<Object> list = new ArrayList(3);
//        list.add(45);
//        list.add(44);
//        list.add(47);
//        list.add(456);
//        list.add(478);
//        list.add("sgsg");
//
//        for (int i = 0; i < 5; i++) {
//            list.add(in.nextInt());
//        }
//
//        System.out.println(list);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                list.get(i).add(in.nextInt());
            }
        }

        System.out.print(list + " ");

    }
}
