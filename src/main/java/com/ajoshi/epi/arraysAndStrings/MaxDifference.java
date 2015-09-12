package com.ajoshi.epi.arraysAndStrings;

/**
 * Created by ajoshi on 8/11/15.
 *
 * Design an algorithm that takes a sequence of n three-dimensional coordinates to be traversed,
 * and returns the minimum battery capacity needed to complete the journey.
 * The robot begins with a fully charged battery.
 *
 */
public class MaxDifference {

    public static int findMaxDiff(int[] a) {
        int maxDiff = Integer.MIN_VALUE;
        for(int i = 1; i < a.length; i++) {
            for(int j = i-1; j >= 0; j--) {
                if(a[i] - a[j] > maxDiff)
                    maxDiff = a[i]  - a[j];
            }
        }
        System.out.println("Max difference is " + maxDiff);
        return maxDiff;
    }

    public static int improvedFindMaxDiff(int[] a) {
        int minSoFar = Integer.MAX_VALUE;
        int maxdiff = Integer.MIN_VALUE;

        for(int i = 0; i < a.length; i++) {
            minSoFar = Math.min(a[i], minSoFar);
            maxdiff = Math.max(maxdiff, a[i]-minSoFar);
        }
        System.out.println("Max difference is " + maxdiff);
        return maxdiff;

    }

}
