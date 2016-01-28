package com.ajoshi.epi.dynamicProgramming;

/**
 * Created by ajoshi on 10/12/15.
 */
public class KnapSack {

    /**
     *
     * Time Complexity - O(n*w)
     * Space Complexity - O(n*w)
     *
     * @param maxWeight
     * @param weights
     * @param values
     * @return
     */
    public static int calculateMaxValue(int maxWeight, int [] weights, int[] values) {
        if(weights.length != values.length)
            return 0;

        // m[i][w] is the maximum value that can be be packed
        // with weight less than or equal to w using the first i+1 items.
        int[][] m = new int[values.length][maxWeight+1];

        for(int i = 0; i < values.length; i++) {
            for(int j = 0; j <= maxWeight; j++) {
                if(weights[i] <= j)
                    m[i][j] = i == 0 ? values[i]:Math.max(m[i-1][j], m[i-1][j-weights[i]] + values[i]);
                else
                    m[i][j] = i == 0 ? 0:m[i-1][j];
            }
        }

        return m[values.length-1][maxWeight];
    }
}
