package com.ajoshi.epi.dynamicProgramming;

import org.junit.Test;

import static org.junit.Assert.*;

public class Path2DArrayTest {

    @Test
    public void testGetPath() throws Exception {
        boolean[][] a = new boolean[10][10];
        a[1][1] = true;
        a[0][3] = true;
        System.out.println("Number of path = " + Path2DArray.findPath(a));
        System.out.println("Number of stack calls = " + Path2DArray.FIND_PATH_STACK_CALL);

        System.out.println("Number of path = " + Path2DArray.getPathCount(a));
        System.out.println("Number of stack calls = " + Path2DArray.GET_PATH_COUNT_STACK_CALL);




    }
}