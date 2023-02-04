package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysList {
    public static void main(String[] args) {

        int arr[]=new int[3];

        arr[0]=5;
        arr[1]=2;
        arr[2]=4;

        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> arrL = new ArrayList<Integer>(2);
        arrL.add(5);
        arrL.add(2);
        arrL.add(6);

        System.out.println(arrL);

        List<Integer> list=new ArrayList<Integer>();

//        list.add("Apple");
//        list.add("Mango");
//        list.add("Orange");

        System.out.println(list);

//        for (String a: list)
//        {
//            System.out.println(a);
//        }

        for(int a:arr)
        {
            list.add(a);
        }

        System.out.println(list);


    }
}
