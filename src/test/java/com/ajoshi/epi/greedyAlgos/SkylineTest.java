package com.ajoshi.epi.greedyAlgos;

import org.junit.Test;

import static org.junit.Assert.*;

public class SkylineTest {

    @Test
    public void testMaxContainedRectangle() throws Exception {
        int[] A = {2,4,2,5,4,1,6,7,8,7,6,4,2};
        assertEquals(Skyline.maxContainedRectangle(A), 30);

        int[] B = {2,4,2,5,4,1,6,7,8,7,6,100,2};
        assertEquals(Skyline.maxContainedRectangle(B), 100);
    }

    @Test
    public void testMaxContainedRectangleOptimized() throws Exception {
        int[] A = {2,4,2,5,4,1,6,7,8,7,6,4,2};
        assertEquals(Skyline.maxContainedRectangleOptimized(A), 30);
        assertEquals(Skyline.maxContainedRectangleOptimized(A), Skyline.maxContainedRectangle(A));

        int[] B = {2,4,2,5,4,1,6,7,8,7,6,100,2};
        assertEquals(Skyline.maxContainedRectangleOptimized(B), 100);
        assertEquals(Skyline.maxContainedRectangleOptimized(B), Skyline.maxContainedRectangle(B));
    }
}