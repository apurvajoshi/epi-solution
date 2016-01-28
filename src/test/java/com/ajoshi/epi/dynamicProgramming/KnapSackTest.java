package com.ajoshi.epi.dynamicProgramming;

import org.junit.Test;

import static org.junit.Assert.*;

public class KnapSackTest {

    @Test
    public void testCalculateMaxValue() throws Exception {
        int[] weights = {1,4,1,2,12};
        int[] values = {2,10,1,2,4};
        int maxWeight = 15;

        System.out.println(KnapSack.calculateMaxValue(maxWeight,weights,values));

    }

    @Test
    public void testCalculateMaxValue1() throws Exception {
        int[] weights = {20,8,60,55,40,70,85,25,30,65,75,10,95,50,40,10};
        int[] values = {65,35,245,195,65,150,275,155,120,320,75,40,200,100,220,99};
        int maxWeight = 130;

        System.out.println(KnapSack.calculateMaxValue(maxWeight,weights,values));

    }
}