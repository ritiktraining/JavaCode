package com.company;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        switch(age){
            case 18:
                System.out.println("You are going to adult");
                break;
            case 23:
                System.out.println("You are going to job");
                break;
            case 60:
                System.out.println("You are going to retire");
                break;
            default:
                System.out.println("Enjoy Your Life");
                break;
        }
    }
}
