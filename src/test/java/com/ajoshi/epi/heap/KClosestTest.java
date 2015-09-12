package com.ajoshi.epi.heap;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class KClosestTest {

    @Test
    public void testFindKClosestValues() throws Exception {
        int[] a = {10,11,9,12,6,5,18,3,20,1,4};
        ArrayList<Integer> actual = new ArrayList<Integer>(Arrays.asList(1,3,4,6,5,9));
        Collections.sort(actual);
        ArrayList<Integer> results = KClosest.findKClosestValues(a, 6);
        for(int i = 0; i < results.size(); i++)
            System.out.println(results.get(i));

        Collections.sort(results);
        Assert.assertEquals(results, actual);

    }
}