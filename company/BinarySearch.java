package com.company;

public class BinarySearch {
    public static void main(String[] args) {

        int arr[] = {5, 6, 7, 9, 13, 21, 25, 27, 29, 39, 48, 56, 59};
        int key = 39;
        int last = arr.length - 1;
        search(arr, 0, last,key);


    }

    static void search(int arr[], int first, int last, int key) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                break;
            } else if (arr[mid] < key) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element is not present in the array");
        }
    }
}
