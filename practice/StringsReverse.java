package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class StringsReverse {

    public static void main(String[] args) {
//        String s=null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = sc.next();

        String[] arr = str.split("[.]");


        int l = arr.length - 1;
        for (int i = l; i >= 0; i--) {
//            s +=arr[i];
//
//            if(i==(l-1))
//                break;
//
//            s+=".";
            System.out.print(arr[i]);
            if (i == 0)
                break;

            System.out.print(".");

        }

//        System.out.println(s);


//        System.out.println(arr.length);


    }
}
