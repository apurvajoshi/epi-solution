package com.ajoshi.epi.recursion;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class PermutationTest {

    @Test
    public void testGetPermutation() throws Exception {
        int[] a = {2,3,5,7};
        ArrayList<ArrayList<Integer>> results = Permutation.getPermutation(a, 0);
        int count = 0;
        for(ArrayList<Integer> result : results) {
            count ++;
            System.out.println(Arrays.toString(result.toArray()));
        }
        System.out.println("Total permutations = " + count);
    }
}