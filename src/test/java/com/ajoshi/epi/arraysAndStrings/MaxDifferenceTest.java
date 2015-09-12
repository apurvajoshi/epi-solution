package com.ajoshi.epi.arraysAndStrings;


import org.junit.Assert;
import org.junit.Test;

public class MaxDifferenceTest{

    @Test
    public void testFindMaxDiff() throws Exception {
        int[] a = {5,7,2,9,1,2,5,4,3,6,8,10};
        Assert.assertEquals(MaxDifference.findMaxDiff(a),9);
    }

    @Test
    public void testImprovedFindMaxDiff() throws Exception {
        int[] a = {5,7,2,9,1,2,5,4,3,6,8,10};
        Assert.assertEquals(MaxDifference.improvedFindMaxDiff(a),9);
    }

    @Test
    public void testImprovedFindMaxDiffWithEmptyArray() throws Exception {
        int[] a = {};
        Assert.assertEquals(MaxDifference.improvedFindMaxDiff(a),Integer.MIN_VALUE);
    }

    @Test
    public void testImprovedFindMaxDiffWithDecreasingValues() throws Exception {
        int[] a = {5,4,3,2,1};
        Assert.assertEquals(MaxDifference.improvedFindMaxDiff(a), 0);
    }

    @Test
    public void testImprovedFindMaxDiffWitNegativeValues() throws Exception {
        int[] a = {5,-4,3,-2,1, 2,6,-6,0};
        Assert.assertEquals(MaxDifference.improvedFindMaxDiff(a), 10);
    }
}