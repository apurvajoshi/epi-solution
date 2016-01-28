package com.ajoshi.epi.arraysAndStrings;

/**
 * Created by ajoshi on 11/10/15.
 */
public class BuyAndSellStock {
    public static int maxProfit(int[] values) {
        int maxDiff = Integer.MIN_VALUE;
        int minSoFar = Integer.MAX_VALUE;

        for(int i = 0; i < values.length; i++) {
            minSoFar = Math.min(minSoFar, values[i]);
            maxDiff = Math.max(maxDiff, values[i] - minSoFar);
        }
        return maxDiff;
    }
}
