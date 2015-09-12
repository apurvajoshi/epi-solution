package com.ajoshi.epi.primitive;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ajoshi on 8/3/15.
 */
public class PowerSetTest {
    @Ignore
    public void testPowerSet() {
        int[] a = {1,2};
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        result.add(new ArrayList<Integer>());
        result.add(new ArrayList<Integer>(Arrays.asList(1)));
        result.add(new ArrayList<Integer>(Arrays.asList(2)));
        result.add(new ArrayList<Integer>(Arrays.asList(1,2)));
        Assert.assertEquals(PowerSet.calculatePowerSet(a), result);
    }

    @Test
    public void testRecursivePowerSet() {
        int[] a = {1,2};
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        result.add(new ArrayList<Integer>());
        result.add(new ArrayList<Integer>(Arrays.asList(1)));
        result.add(new ArrayList<Integer>(Arrays.asList(2)));
        result.add(new ArrayList<Integer>(Arrays.asList(1,2)));
        Assert.assertEquals(PowerSet.recursivePowerSet(a), result);

        System.out.println("\n\n");

        int[] b = {1,2,3};
        ArrayList<ArrayList<Integer>> result1 = new ArrayList<ArrayList<Integer>>();
        result1.add(new ArrayList<Integer>());
        result1.add(new ArrayList<Integer>(Arrays.asList(1)));
        result1.add(new ArrayList<Integer>(Arrays.asList(2)));
        result1.add(new ArrayList<Integer>(Arrays.asList(1,2)));
        result1.add(new ArrayList<Integer>(Arrays.asList(3)));
        result1.add(new ArrayList<Integer>(Arrays.asList(1,3)));
        result1.add(new ArrayList<Integer>(Arrays.asList(2,3)));
        result1.add(new ArrayList<Integer>(Arrays.asList(1,2,3)));
        Assert.assertEquals(PowerSet.recursivePowerSet(b), result1);
    }
}
