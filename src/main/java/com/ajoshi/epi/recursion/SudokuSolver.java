package com.ajoshi.epi.recursion;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by ajoshi on 10/27/15.
 */
public class SudokuSolver {


    public static void solve(int[][] matrix) {
        solveHelper(matrix, 0, 0);
    }

    private static void solveHelper(int[][] matrix, int row , int column) {
        if(row == matrix.length-1 && column == matrix[0].length-1) {
            System.out.println("RESULTS");
            for(int[] a : matrix) {
                System.out.println(Arrays.toString(a));
            }
            return;
        }

        if(matrix[row][column] != 0) {
            if(column < matrix[0].length-1)
                solveHelper(matrix, row, column+1);
            else if(column == matrix[0].length-1)
                solveHelper(matrix, row+1, 0);
            return;
        }

        HashSet<Integer> solution = new HashSet<Integer>();
        for(int i = 1; i <= 9; i++ )
            solution.add(i);

        // Check row constraint
        checkRowConstraint(matrix, solution, row);

        // Check column constraint
        checkColumnConstraint(matrix, solution, column);

        // Check submatrix constraint
        checkSubMatrixConstraint(matrix, solution, row, column);

        // Iterate through remaining solution
        for(Integer value : solution) {
            matrix[row][column] = value;
            if(column < matrix[0].length-1)
                solveHelper(matrix, row, column+1);
            else if(column == matrix[0].length-1)
                solveHelper(matrix, row+1, 0);
        }
        matrix[row][column] = 0;
    }

    private static void checkSubMatrixConstraint(int[][] matrix, HashSet<Integer> solution, int row, int column) {
        int x = (row/3)*3;
        int y = (column/3)*3;

        for(int i = x; i < x+3; i++) {
            for(int j = y; j < y+3; j++) {
                if(matrix[i][j] != 0)
                    solution.remove(matrix[i][j]);
            }
        }
    }

    private static void checkRowConstraint(int[][] matrix, HashSet<Integer> solution, int row) {
        for(int i = 0; i < matrix[0].length; i++) {
            if(matrix[row][i] != 0)
                solution.remove(matrix[row][i]);
        }
    }

    private static void checkColumnConstraint(int[][] matrix, HashSet<Integer> solution, int column) {
        for(int i = 0; i < matrix.length; i++) {
            if(matrix[i][column] != 0)
                solution.remove(matrix[i][column]);
        }
    }
}
