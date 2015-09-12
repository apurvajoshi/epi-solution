package com.ajoshi.epi.arraysAndStrings;


import org.junit.Test;

import java.util.Arrays;

public class PartitioningTest {

    @Test
    public void testPartition() throws Exception {
        int[] a = {2,4,1,7,2,6,5,2,1,3,0,9,2};
        int i = Partitioning.partition(a, 0);
        System.out.println(Arrays.toString(a));

        System.out.println("\n");

        int b[] = {2,3,4,5,2,3,4,5,0,2,3,4,5,2,3,4,5,1,3,4,5,0};
        i = Partitioning.partition(b, 1);
        System.out.println(Arrays.toString(b));

    }
}