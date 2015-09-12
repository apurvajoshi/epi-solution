package com.ajoshi.epi.arraysAndStrings;

import java.util.Arrays;

/**
 * Created by ajoshi on 8/7/15.
 *
 * Write a function that takes an array A and an index i into A, and
 * rearranges the elements such that all elements less than A[i] appear first, followed by elements equal to A[i],
 * followed by elements greater than A[i]. Your algorithm should have 0(1) space complexity and OOAI)time complexity.
 *
 */

public class Partitioning {

    public static int partition(int [] a, int index) {
        System.out.println(Arrays.toString(a));

        swap(a, index, 0);
        int firstHigh = 1;
        int firstLow = 1;
        for(int i = 1; i < a.length; i++ ) {
            if(a[0] > a[i]) {
                swap(a, i, firstHigh);
                firstHigh++;
            }
            if(a[0] == a[i]) {
                if(firstHigh != firstLow)
                    swap(a, i, firstLow);
                swap(a, i, firstHigh);
                firstLow++;
                firstHigh++;
            }
        }
        int i = 0;
        while(firstLow < firstHigh) {
            swap(a,i,firstLow);
            i++;
            firstLow++;
        }

        return firstHigh-1;
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
