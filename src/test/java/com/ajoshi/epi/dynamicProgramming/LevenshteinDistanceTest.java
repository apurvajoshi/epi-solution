package com.ajoshi.epi.dynamicProgramming;

import org.junit.Test;

import static org.junit.Assert.*;

public class LevenshteinDistanceTest {

    @Test
    public void testCalculateLevenshteinDistance() throws Exception {
        int result = LevenshteinDistance.calculateLevenshteinDistance("kitten","sitting",0,0);
        System.out.println("Result is " + result);
        System.out.println("CountCallStack is " + LevenshteinDistance.countCallStack1);

        result = LevenshteinDistance.calculateLevenshteinDistanceUsingCaching("kitten","sitting");
        System.out.println("Result is " + result);
        System.out.println("CountCallStack2 is " + LevenshteinDistance.countCallStack2);

        result = LevenshteinDistance.calculateLevenshteinDistanceUsingDP("kitten","sitting");
        System.out.println("Result is " + result);
        System.out.println("CountCallStack3 is " + LevenshteinDistance.countCallStack3);

        result = LevenshteinDistance.calculateLevenshteinDistanceUsingDPIterative("apuarv","poorva");
        System.out.println("Result is " + result);
    }
}