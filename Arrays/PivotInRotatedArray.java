package com.Arrays;

public class PivotInRotatedArray {

    public static void main(String[] args) {

        int[] arr={3,4,5,6,7,8,9,10,11,12,15,18,20,25,29,1,2};
        System.out.println(findPivot(arr));
    }

    static int findPivot(int[] arr) {

        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid-1]>arr[mid]){
                return mid-1;
            }
            if(arr[mid]>=start){
                start=mid+1;
            }
            if(arr[mid]<start){
                end=mid-1;
            }
        }

        return -1;
    }
}
