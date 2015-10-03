package com.ajoshi.epi.recursion;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class PowerSetTest {

    @Test
    public void testGeneratePowerSetRecursive() throws Exception {

        int[] a = {1,2,3};
        ArrayList<ArrayList<Integer>> results = PowerSet.generatePowerSetRecursive(a, 0);
        for(ArrayList<Integer> result : results)
            System.out.println(Arrays.toString(result.toArray()));

    }
}