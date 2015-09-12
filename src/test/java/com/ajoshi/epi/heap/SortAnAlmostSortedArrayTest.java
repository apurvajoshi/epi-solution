package com.ajoshi.epi.heap;

import org.junit.Assert;
import org.junit.Test;

public class SortAnAlmostSortedArrayTest {

    @Test
    public void testSortArray() throws Exception {
        int[] a = {3,-1,2,6,4,5,8};
        int [] result = {-1,2,3,4,5,6,8};
        Assert.assertArrayEquals(SortAnAlmostSortedArray.sortArray(a,3), result);


    }

    @Test
    public void testSortArray1() throws Exception {
        int[] a = {4,3,5,0,7,6,8,12,10,9,11};
        int [] result = {0,3,4,5,6,7,8,9,10,11,12};
        Assert.assertArrayEquals(SortAnAlmostSortedArray.sortArray(a,4), result);
    }
}