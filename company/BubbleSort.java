package com.company;

public class BubbleSort {
    public static void main(String[] args) {

        int arr[]={5,4,8,94,58,12,1,7,9};

        sort(arr);

        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }

    static void sort(int arr[])
    {
        int n= arr.length;
        int t=0;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n-i;j++)
            {
                if(arr[j-1]>arr[j]){
                    t=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=t;
                }
            }
        }
    }
}
