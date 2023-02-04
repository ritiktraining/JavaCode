package com.practice;

public class BinarySearchPractice {

    public static void main(String[] args) {
        int[] arr = {4, 5, 8, 9, 11, 13, 15, 17, 19, 20};
        int target = 425;
        int first = 0;
        int last = arr.length - 1;
        int index = binarySearch(arr, target, first, last);
        System.out.println(index);

    }

    static int binarySearch(int[] arr, int target, int first, int last) {


        while (first <= last) {
            int mid = first + (last - first) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                return binarySearch(arr, target, first, mid - 1);
            }
            if (arr[mid] < target) {
                return binarySearch(arr, target, mid + 1, last);
            }

        }

        return -1;
    }
}
