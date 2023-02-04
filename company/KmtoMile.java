package com.company;

import java.util.Scanner;

public class KmtoMile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of miles");
        float mile=sc.nextFloat();


        System.out.println("The no. of km in "+ mile + " miles are : "+ convert(mile));

    }

    static float convert(float mile){
        float km= (float) (1.60934 * mile);
        return km;
    }
}
