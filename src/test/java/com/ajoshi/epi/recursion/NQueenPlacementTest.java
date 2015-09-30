package com.ajoshi.epi.recursion;

import org.junit.Test;


public class NQueenPlacementTest {

    @Test
    public void testPlacementOfQueen() throws Exception {
        boolean[][] a = new boolean[4][4];
        NQueenPlacement.placeQueen(a, 0);

        a = new boolean[6][6];
        NQueenPlacement.placeQueen(a, 0);
    }



}