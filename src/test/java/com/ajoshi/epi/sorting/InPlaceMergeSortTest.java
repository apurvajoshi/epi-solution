package com.ajoshi.epi.sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class InPlaceMergeSortTest {

    @Test
    public void testMergeSort() throws Exception {
        int[] a = new int[8];
        a[0] = 5; a[1] = 13; a[2] = 17;
        int[] b = {3,7,11,19};
        int[] result = new int[8];
        result[0] = 3; result[1] = 5;
        result[2] = 7; result[3] = 11;
        result[4] = 13; result[5] = 17;
        result[6] = 19;

        InPlaceMergeSort.mergeSort(a,3,b,4);
        assertArrayEquals(a, result);
    }
}