package com.company;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        byte m1,m2,m3;
//        System.out.println("Enter your marks in Physics");
//        m1=sc.nextByte();
//        System.out.println("Enter your marks in Chemistry");
//        m2=sc.nextByte();
//        System.out.println("Enter your marks in Maths");
//        m3=sc.nextByte();
//
//        float avg=(m1+m2+m3)/3.0f;
//        System.out.println("Overall percentage is: "+ avg);
//
//        if(avg>=40 && m1>=33 && m2>=33 && m3>=33)
//        {
//            System.out.println("You hav been promoted");
//
////        }
////        else{
////            System.out.println("You have not promoted");
////        }
//
//        float tax=0;
//        System.out.println("Enter Your income in lakhs");
//        float income= sc.nextFloat();
//        if(income<=2.5){
//            tax=tax+0;
//        }
//        else if(income>2.5f && income<=5.0f){
//            tax=tax+0.05f*(income-2.5f);
//        }
//        else if(income>5.0f && income<=10.0f){
//            tax=tax+0.05f*(5.0f-2.5f);
//            tax=tax+0.2f*(income-5f);
//        }
//        else if(income>10.0f){
//            tax=tax+0.05f*(5.0f-2.5f);
//            tax=tax+0.2f*(10.0f-5.0f);
//            tax=tax+0.3f*(income-10.0f);
//        }
//        System.out.println("Your Total tax is : "+ tax);
        System.out.println("Enter the name of website");
        String w1=sc.next();

        if(w1.endsWith("com")){
            System.out.println("It is a commercial website");
        }
        else if(w1.endsWith("org"))
            System.out.println("It is a organizational website");
        else if(w1.endsWith("in"))
            System.out.println("It is an Indian Website");
        else
            System.out.println("We don't know");



    }
}
