package com.searching;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {


        int[] arr = {2, 5, 6, 8, 9, 10, 12, 15, 18, 20};
        int target = 12;
        int index = search(arr, target, 0, arr.length - 1);
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
