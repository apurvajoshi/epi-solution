package com.ajoshi.epi.searching;

import org.junit.Test;

import static org.junit.Assert.*;

public class CyclicSortedArrayTest {

    @Test
    public void testFindElement() throws Exception {
        int[] a = {1,2,3,4,5,6};
        assertEquals(CyclicSortedArray.findElement(a,1), 0);

        int[] b = {2,3,4,5,6,1};
        assertEquals(CyclicSortedArray.findElement(b,1), 5);

        int[] c = {3,4,5,6,1,2};
        assertEquals(CyclicSortedArray.findElement(c,1), 4);

        int[] d = {4,5,6,1,2,3};
        assertEquals(CyclicSortedArray.findElement(d,1), 3);

        int[] e = {5,6,1,2,3,4};
        assertEquals(CyclicSortedArray.findElement(e,1), 2);

        int[] f = {6,1,2,3,4,5};
        assertEquals(CyclicSortedArray.findElement(f,1), 1);



        int[] g = {1,2,3,4,5,6,7};
        assertEquals(CyclicSortedArray.findElement(g,1), 0);

        int[] h = {2,3,4,5,6,7,1};
        assertEquals(CyclicSortedArray.findElement(h,1), 6);

        int[] i = {3,4,5,6,7,1,2};
        assertEquals(CyclicSortedArray.findElement(i,1), 5);

        int[] j = {4,5,6,7,1,2,3};
        assertEquals(CyclicSortedArray.findElement(j,1), 4);

        int[] k = {5,6,7,1,2,3,4};
        assertEquals(CyclicSortedArray.findElement(k,1), 3);

        int[] l = {6,7,1,2,3,4,5};
        assertEquals(CyclicSortedArray.findElement(l,1), 2);

        int[] m = {7,1,2,3,4,5,6};
        assertEquals(CyclicSortedArray.findElement(m,1), 1);

    }
}