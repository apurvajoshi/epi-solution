package com.ajoshi.epi.recursion;

import java.util.Arrays;

/**
 * Created by ajoshi on 9/24/15.
 */
public class NQueenPlacement {

    public static void placeQueen(boolean[][] a, int n) {
        if(n  == a.length) {
            System.out.println("\nBefore return");
            for(int i = 0; i < a.length; i++)
                System.out.println(Arrays.toString(a[i]));
            return ;
        }


        for(int i = 0; i < a[0].length; i++) {
            if(check(a, n, i)) {
                a[n][i] = true;
                placeQueen(a, n+1);
            }
            a[n][i] = false;
        }
    }

    private static boolean check(boolean[][] a, int row, int column) {
        // Check same row placement
        for(int i = 0; i < column; i++)
            if(a[row][i])
                return false;

        // Check same column placement
        for(int i = 0; i < row; i++)
            if(a[i][column])
                return false;

        // Check diagonal placement
        for(int i = row-1, j = column-1; i>=0 && j>=0; i--,j--) {
            if(a[i][j])
                return false;
        }

        // Check diagonal placement
        for(int i = row-1, j = column+1; i>=0 && j<a.length; i--,j++) {
            if(a[i][j])
                return false;
        }

        return true;
    }
}
