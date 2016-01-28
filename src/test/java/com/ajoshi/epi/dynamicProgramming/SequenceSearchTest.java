package com.ajoshi.epi.dynamicProgramming;

import org.junit.Test;

import static org.junit.Assert.*;

public class SequenceSearchTest {

    @Test
    public void testIsContained() throws Exception {
        int[][] A = {{1,2,3,4,5},{5,6,6,7,7},{2,3,2,3,5},{4,3,2,1,6},{5,1,2,3,4},{7,1,7,2,3}};
        int [] s = {7,2,2,2,3};

        assertEquals(SequenceSearch.isContained(A,s), true);
        System.out.println("Count = " + SequenceSearch.COUNT);
    }
}