package com.ajoshi.epi.searching;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareRootTest {

    @Test
    public void testFindSquareRoot() throws Exception {
        assertEquals(SquareRoot.findSquareRoot(5), 2.236, 0.001);
        assertEquals(SquareRoot.findSquareRoot(10), 3.162, 0.001);
        assertEquals(SquareRoot.findSquareRoot(16), 4, 0.001);
        assertEquals(SquareRoot.findSquareRoot(21), 4.582, 0.001);

        assertEquals(SquareRoot.findSquareRoot(-5), -2.236, 0.001);
        assertEquals(SquareRoot.findSquareRoot(-10), -3.162, 0.001);
        assertEquals(SquareRoot.findSquareRoot(-16), -4, 0.001);
        assertEquals(SquareRoot.findSquareRoot(-21), -4.582, 0.001);

        assertEquals(SquareRoot.findSquareRoot(0.9), 0.948, 0.001);
        assertEquals(SquareRoot.findSquareRoot(0.2), 0.447, 0.001);
        assertEquals(SquareRoot.findSquareRoot(0.1), 0.316, 0.001);
        assertEquals(SquareRoot.findSquareRoot(0.6), 0.7745, 0.001);

        assertEquals(SquareRoot.findSquareRoot(-0.9), -0.948, 0.001);
        assertEquals(SquareRoot.findSquareRoot(-0.2), -0.447, 0.001);
        assertEquals(SquareRoot.findSquareRoot(-0.1), -0.316, 0.001);
        assertEquals(SquareRoot.findSquareRoot(-0.6), -0.7745, 0.001);



    }
}