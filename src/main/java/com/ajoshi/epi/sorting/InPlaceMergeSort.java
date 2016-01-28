package com.ajoshi.epi.sorting;

/**
 * Created by ajoshi on 10/6/15.
 */
public class InPlaceMergeSort {

    /**
     * Merges two sorted arrays.
     * Time Complexity - O(m + n)
     *
     * @param a is the larger array with enough space at back to contain b.
     * @param n is number of elements in a
     * @param b is the smaller of two arrays
     * @param m is the number of elements in b
     */
    public static void mergeSort(int[] a, int n, int[] b, int m) {

        int k = n + m - 1;
        int i = n-1;
        int j = m-1;
        while( i >= 0 && j >= 0) {
            if(a[i] < b[j]) {
                a[k] = b[j];
                j--;
            } else {
                a[k] = a[i];
                i--;
            }
            k--;
        }

        while(j>=0){
            a[k] = b[j];
            j--;
            k--;
        }

    }
}
