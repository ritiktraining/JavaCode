package com.company;

public class Main {

    public static void main(String[] args) {
//        int i=10;
//        int b=++i;
//        System.out.println(b);
//        System.out.println(b);
//        System.out.println(i);

//        char a='a';
//        char b=++a;
//        System.out.println(b);
//
//        int x=7;
//        int y=++x*8;
//        System.out.println(y);

//        int v=4;
//        int u=2;
//        int a=3;
//        int s=2;
//
//        int x=(v*v-u*u)/(2*a*s);
//
//        System.out.println(x);
//
//        int z=7*49/7+35/7;
//        System.out.println(z);

//        String str="Ritik";
//        String s=str +"\n";
//        String g=s.repeat(5);
//        System.out.println(""+ g);

        int [][] flats;
        flats=new int[2][3];
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;

        for (int i=0;i< flats.length;i++)
        {
            for (int j=0;j< flats[i].length;j++)
            {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
