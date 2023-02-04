package com.practice;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {4, 5, 8, 9, 11, 13, 15, 17, 19, 20};
        int target = 13;
        int first = 0;
        int last = arr.length - 1;
        int index = search(arr, target, first, last);
        System.out.println(index);

    }

    static int search(int[] arr, int target, int first, int last) {

        while (first <= last) {

            int mid = first + (last - first) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                return search(arr, target, first, mid - 1);
            } else {
                return search(arr, target, mid + 1, last);
            }
        }

        return -1;

    }
}
