package com.company;

import java.util.Arrays;

public class Array {
//    public static void main(String[] args) {
////        sum(new int[]{1,2,3});
//
//        int a[]=new int[5];
//
//        a[0]=1;
//        a[1]=2;
//        a[2]=3;
//        a[3]=4;
//        a[4]=5;
//
//        int b[]={1,2,3,4,5};
//        int sum=0;
//        int sum1=0;
//        for(int i=0;i<a.length;i++) {
//            sum +=a[i];
//        }
//        System.out.println(sum);
//
//        for(int i : b) {
//            System.out.println(i);
//        }
//        System.out.println(sum1);
//
//    }
//
////    public static void sum(int[] a)
////    {
////        int total=0;
////
////        for(int i: a) {
////            total = total + i;
////        }
////
////        System.out.println(total);
////    }
//

    public static void main(String[] args) {
//        int a[]={33,3,1,4,5};
//        min(a);
//        int a[]=get();
//        for(int i:a)
//            System.out.println(i);

        int ab[]={5,6,1,2,4,3,7};

        Arrays.sort(ab);

        for (int i=0;i<ab.length;i++)
        {
            System.out.println(ab[i]);
        }

    }

    static void min(int arr[])
    {
//        int min=arr[0];
//        for(int i=0;i<arr.length;i++)
//        {
//            if(min>arr[i])
//                min=arr[i];
//        }
//        System.out.println(min);


    }

//    static int[] get()
//    {
//        return new int[]{3,4,5,6,7,8,7,8};
//    }

}
