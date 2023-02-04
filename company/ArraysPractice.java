package com.company;

public class ArraysPractice {
    public static void main(String[] args) {
//        float sum=0;
//        float arr[]={1.5f,2.67f,3.17f,4.44f,5.46f};
//        for(float i : arr){
//            sum+=i;
//        }
//        System.out.println(sum);
//        float arr[]={1.5f,2.67f,3.17f,4.44f,5.46f};
//        float num=2.67f;
//        boolean isInArray=false;
//        for(float i : arr){
//            if (num==i){
//                isInArray=true;
//                break;
//
//            }
//        }
//        if (isInArray){
//            System.out.println("Element is present");
//        }
//        else
//            System.out.println("Element is not present");

//        float sum=0;
//        float arr[]={1.5f,2.67f,3.17f,4.44f,5.46f};
//        for(float i : arr){
//            sum+=i;
//        }
//        System.out.println(sum/arr.length);

//

        // Reverese an Array

//        int temp=0;
//        int arr[]={1,2,3,4,5,6};
//        int n=Math.floorDiv(arr.length, 2);
//        for(int i=0;i<n;i++){
//            temp=arr[i];
//            arr[i]=arr[arr.length-1-i];
//            arr[arr.length-1-i]=temp;
//        }
//
//        for (int i:arr){
//            System.out.println(i);
//        }

//        int arr[]={111,214,10,47,55,15};
//        int max=0,min=Integer.MAX_VALUE;
//        for(int i:arr){
////            if(i>max){
////                max=i;
////            }
//
//            if (i<min){
//                min=i;
//            }
//
//        }
//        System.out.println(min);


        int arr[]={1,2,3,4,7,5,6};
        boolean isSorted=true;

        for (int i=0;i< arr.length-1;i++)
        {
            if(arr[i]>arr[i+1]){
               isSorted=false;
               break;
            }
        }

        if (isSorted){
            System.out.println("Array is sorted");
        }
        else
            System.out.println("Array is not sorted");


    }
}
