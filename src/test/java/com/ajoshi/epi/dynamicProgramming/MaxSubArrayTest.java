package com.ajoshi.epi.dynamicProgramming;

import org.junit.Ignore;
import org.junit.Test;
public class MaxSubArrayTest {
    @Test
    public void testFindScoreCombination1() throws Exception {
        System.out.println("\ntestFindScoreCombination1");
        int[] a = {1,7,-6,-4,11,2,5,-4,-12,8};
        MaxSubArray.calculateMaxSubArray(a);
        MaxSubArray.findMaxSubArray(a);
    }

    @Test
    public void testFindScoreCombination2() throws Exception {
        System.out.println("\ntestFindScoreCombination2");
        int[] a = {-1,-2,-3,-4,-5};
        MaxSubArray.calculateMaxSubArray(a);
        MaxSubArray.findMaxSubArray(a);
    }

    @Test
    public void testFindScoreCombination22() throws Exception {
        System.out.println("\ntestFindScoreCombination22");
        int[] a = {-2,-3,-1,-4,-5};
        MaxSubArray.calculateMaxSubArray(a);
        MaxSubArray.findMaxSubArray(a);
    }


    @Ignore
    public void testFindScoreCombination3() throws Exception {
        System.out.println("\ntestFindScoreCombination3");
        int[] a = {};
        MaxSubArray.calculateMaxSubArray(a);
        MaxSubArray.findMaxSubArray(a);
    }

    @Test
    public void testFindScoreCombination4() throws Exception {
        System.out.println("\ntestFindScoreCombination4");
        int[] a = {1,2,3,4,5};
        MaxSubArray.calculateMaxSubArray(a);
        MaxSubArray.findMaxSubArray(a);
    }

    @Test
    public void testFindScoreCombination5() throws Exception {
        System.out.println("\ntestFindScoreCombination5");
        int[] a = {-1,2,3,-4,5,-6,2,-1};
        MaxSubArray.calculateMaxSubArray(a);
        MaxSubArray.findMaxSubArray(a);
    }

}