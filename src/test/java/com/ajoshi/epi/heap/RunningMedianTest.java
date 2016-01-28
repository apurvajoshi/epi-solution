package com.ajoshi.epi.heap;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RunningMedianTest {

    @Test
    public void testCalculateRunningMedian() throws Exception {
        int[] a = {1,0,3,5,2,0,1};
        double [] result = {1, 0.5, 1, 2, 2, 1.5, 1};
        Assert.assertArrayEquals(RunningMedian.calculateRunningMedian(a),result, 0.001);
    }

    @Test
    public void testCalculateRunningMedian1() throws Exception {
        int[] a = {8,7,6,5,4,3,2,1,0};
        double [] result = {8,7.5,7,6.5,6,5.5,5,4.5,4};
        Assert.assertArrayEquals(RunningMedian.calculateRunningMedian(a),result, 0.001);
    }

    @Test
    public void testCalculateRunningMedian2() throws Exception {
        int[] a = {0,1,2,3,4,5,6,7,8};
        double [] result = {0,0.5,1,1.5,2,2.5,3,3.5,4};
        Assert.assertArrayEquals(RunningMedian.calculateRunningMedian(a),result, 0.001);
    }

}