package com.ajoshi.epi.dynamicProgramming;
/**
 * Created by ajoshi on 9/16/15.
 */
public class MaxSubArray {
    public static class Pair {
        int low;
        int high;

        public Pair(int low, int high) {
            this.low = low;
            this.high = high;
        }
    }

    public static void calculateMaxSubArray(int[] a) {
        Pair pair = new Pair(0,0);
        int lowIndex = -1;
        int sum = 0;
        int max_sum = 0;
        int min_sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
            if(min_sum > sum) {
                min_sum = sum;
                lowIndex = i;
            }
            if(sum-min_sum > max_sum) {
                max_sum = sum-min_sum;
                pair = new Pair(lowIndex+1, i);
            }
        }
        System.out.println("low index = " + pair.low);
        System.out.println("high index = " + pair.high);
        System.out.println("Max subarray = " + max_sum);
    }
}
