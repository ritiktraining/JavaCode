package com.company;

import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {
//        int n = 4;
//        for (int i = n; i > 0; i--) {
//            for(int j=i;j>0;j--){
//                System.out.print("*");
//            }
//            System.out.println("\n");
//        }
//
//        int sum2=0;
//
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter thr total no.s");
//        int a=sc.nextInt();
//        int sum=0;
//
//        // sum of first n even numbers
//        while(a>=0){
//          sum+=2*a;
//          a--;
//        }
//        System.out.println("The sum of the even no.s is : "+ sum);
//
//        for(int i=0;i<a;i++){
//
//            sum2+=2*i;
//
//        }
//        System.out.println(sum2);

//        int n=5;
//        for(int i=1;i<=10;i++){
////            System.out.println("5*" + i + "=" + n*i);
//            System.out.printf("%d * %d = %d\n",n,i,n*i);
//        }
//        System.out.print("\n");

//        int n = 10;
//        for (int i = 10; i >= 1; i--) {
////            System.out.println("5*" + i + "=" + n*i);
//            System.out.printf("%d * %d = %d\n", n, i, n * i);
//        }
//        System.out.print("\n");

//        int n=sc.nextInt();
//        int i=1;
//        int fact=1;
//
//        while(i<=n){
//            fact*=i;
//            i++;
//        }
//        System.out.println(fact);

//        while (i>4){
//            System.out.println(i);
//
//        }

//        while(i<=5){
//            System.out.println(i);
//            i++;
//        }

        int n = 8;
        int sum=0;
        for (int i = 10; i >= 1; i--) {
            System.out.printf("%d * %d = %d\n", n, i, n * i);
            sum+=n*i;
        }
        System.out.print("\n");
        System.out.println(sum);




    }
}
