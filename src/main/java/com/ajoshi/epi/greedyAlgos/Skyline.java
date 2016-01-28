package com.ajoshi.epi.greedyAlgos;

import java.util.Stack;

/**
 * Created by ajoshi on 11/16/15.
 */
public class Skyline {

    /**
     *
     * Time Complexity - O(n^2)
     *
     * @param A - Array of height, each building has unit width
     * @return
     */
    public static int maxContainedRectangle(int[] A) {
        int min = A[0];
        int max_rect = 0;

        for(int i = 0; i < A.length; i++) {
            min = A[i];
            for(int j = i; j < A.length; j++) {
                min = Math.min(min, A[j]);
                max_rect = Math.max(max_rect, (j-i+1) * min);
            }
        }
        return max_rect;
    }

    /**
     *
     * Time Complexity - O(n)
     *
     * @param A - Array of height, each building has unit width
     * @return
     */
    public static int maxContainedRectangleOptimized(int[] A) {
        Stack<Integer> s = new Stack<>();
        int max_rect = 0;

        for(int i = 0; i <= A.length; i++) {
            while(!s.empty() && (i == A.length || A[i] < A[s.peek()])) {
                int height = A[s.pop()];
                max_rect = Math.max(max_rect, height * (s.empty() ? i : i-1-s.peek()));
            }
            s.push(i);
        }
        return max_rect;
    }
}
