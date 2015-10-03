package com.ajoshi.epi.sorting;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayIntersectionTest {

    @Test
    public void testFindIntersection() throws Exception {
        int[] a = {2,3,3,5,5,6,7,7,8,12};
        int[] b = {5,5,6,8,8,9,10,10};
        Integer[] c = {5,6,8};
        ArrayList<Integer> actual = new ArrayList<Integer>(Arrays.asList(c));
        ArrayList<Integer> result = ArrayIntersection.findIntersection(a,b);
        assertEquals(result, actual);
    }

    @Test
    public void testFindIntersectionWithEmptyArrays() throws Exception {
        int[] a = {2,7,8,8,9,10};
        int[] b = {};
        Integer[] c = {};
        ArrayList<Integer> actual = new ArrayList<Integer>(Arrays.asList(c));
        ArrayList<Integer> result = ArrayIntersection.findIntersection(a,b);
        assertEquals(result, actual);
    }

    @Test
    public void testFindIntersectionWitLotsOfDuplicates() throws Exception {
        int[] a = {2,2,2,3,3,3,3,3,5,5,5,6,7,7,8,12,12,12,12};
        int[] b = {2,2,2,3,3,3,5,5,5,6,7,7,8,8,8,8,12,12};
        Integer[] c = {2,3,5,6,7,8,12};
        ArrayList<Integer> actual = new ArrayList<Integer>(Arrays.asList(c));
        ArrayList<Integer> result = ArrayIntersection.findIntersection(a,b);
        assertEquals(result, actual);
    }
}