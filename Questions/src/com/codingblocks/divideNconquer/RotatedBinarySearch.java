package com.codingblocks.divideNconquer;

public class RotatedBinarySearch {

    static int pivotedBinarySearch(int arr[], int n, int key) {
        int pivot = findPivot(arr, 0, n-1);

        // If we didn't find a pivot, then
        // array is not rotated at all
        if (pivot == -1) {
            return binarySearch(arr, 0, n-1, key);
        }

        // If we found a pivot, then first
        // compare with pivot and then
        // search in two subarrays around pivot
        if (arr[pivot] == key) {
            return pivot;
        }
        if (arr[0] <= key) {
            return binarySearch(arr, 0, pivot-1, key);
        }
        return binarySearch(arr, pivot+1, n-1, key);
    }

    /* Function to get pivot. For array
       3, 4, 5, 6, 1, 2 it returns
       3 (index of 6) */
    static int findPivot(int arr[], int low, int high) {
        // base cases
        if (high < low) {
            return -1;
        }
        if (high == low) {
            return low;
        }

        /* low + (high - low)/2; */
        int mid = (low + high)/2;
        if (mid < high && arr[mid] > arr[mid + 1]) {
            return mid;
        }
        if (mid > low && arr[mid] < arr[mid - 1]) {
            return (mid-1);
        }
        if (arr[low] >= arr[mid]) {
            return findPivot(arr, low, mid-1);
        }
        return findPivot(arr, mid + 1, high);
    }

    /* Standard Binary Search function */
    static int binarySearch(int[] arr, int low, int high, int key) {
        if (high < low){
            return -1;
        }

        int mid = (low + high)/2;
        if (key == arr[mid]) {
            return mid;
        }
        if (key > arr[mid]) {
            return binarySearch(arr, (mid + 1), high, key);
        }
        return binarySearch(arr, low, (mid -1), key);
    }

    public static void main(String[] args) {
        // Let us search 3 in below array
        int arr1[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int n = arr1.length;
        int key = 3;
        System.out.println(pivotedBinarySearch(arr1, n, key));
    }

    // BETTER WAY
    static int search(int[] arr, int l, int h, int key) {
        if (l > h) {
            return -1;
        }
        int mid = (l+h)/2;
        if (arr[mid] == key) {
            return mid;
        }

        if (arr[l] <= arr[mid]) {
            if (key >= arr[l] && key <= arr[mid]) {
                return search(arr, l, mid-1, key);
            }
            return search(arr, mid+1, h, key);
        }

        if (key >= arr[mid] && key <= arr[h]){
            return search(arr, mid+1, h, key);
        }

        return search(arr, l, mid-1, key);
    }

}
