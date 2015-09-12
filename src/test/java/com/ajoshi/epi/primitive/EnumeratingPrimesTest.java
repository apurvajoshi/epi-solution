package com.ajoshi.epi.primitive;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class EnumeratingPrimesTest{

    @Test
    public void testEnurmeratingPrime() throws Exception  {
        Assert.assertEquals(EnumeratingPrimes.enumeratePrimes(23), Arrays.asList(23, 19, 17, 13, 11, 7, 5, 3, 2));
    }
}