package com.ajoshi.epi.graph;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PaintMatrixTest {

    @Test
    public void testPaintBooleanMatrix() throws Exception {
        int[][] a = {
                {1,0,1,0,0,0,1,1,1,1},
                {0,0,1,0,0,1,0,0,1,1},
                {1,1,1,0,0,1,1,0,1,1},
                {0,1,0,1,1,1,1,0,1,0},
                {1,0,1,0,0,0,0,1,0,0},
                {1,0,1,0,0,1,0,1,1,1},
                {0,0,0,0,1,0,1,0,0,1},
                {1,0,1,0,1,0,1,0,0,0},
                {1,0,1,1,0,0,0,1,1,1},
                {0,0,0,0,0,0,0,1,1,0}
        };

        int x = 5;
        int y = 4;

        for(int i = 0; i < a.length; i++)
            System.out.println(Arrays.toString(a[i]));

        PaintMatrix.paintBooleanMatrixEfficient(a,x,y);

        System.out.println("After painting");

        for(int i = 0; i < a.length; i++)
            System.out.println(Arrays.toString(a[i]));

        x = 6;
        y = 3;

        PaintMatrix.paintBooleanMatrixEfficient(a,x,y);

        System.out.println("After painting");

        for(int i = 0; i < a.length; i++)
            System.out.println(Arrays.toString(a[i]));

    }
}