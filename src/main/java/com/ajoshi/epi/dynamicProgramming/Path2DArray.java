package com.ajoshi.epi.dynamicProgramming;

import java.util.Arrays;

/**
 * Created by ajoshi on 9/23/15.
 */
public class Path2DArray {

    public static int FIND_PATH_STACK_CALL = 0;
    public static int GET_PATH_COUNT_STACK_CALL = 0;


    /**
     * This function returns the total
     * count of all possible paths and also
     * prints the possible paths
     *
     * Time Complexity - exponential
     *
     * @param a - Boolean 2D array
     * @return - count of all possible paths from top right to bottom left
     */
    public static int findPath(boolean[][] a) {
        char[] path = new char[a.length-1 + a[0].length-1];
        return findPathHelper(a, 0, 0, path);
    }

    private static int findPathHelper(boolean[][] a, int i, int j, char[] path) {
        FIND_PATH_STACK_CALL++;

        int result = 0;

        if(i > a.length-1 || j > a[0].length-1 )
            return 0;

        if(i == a.length-1 && j == a[0].length-1) {
            System.out.println(Arrays.toString(path));
            return 1;
        }

        // Going down
        if(i < a.length-1 && !a[i+1][j]) {
            path[i+j] = 'D';
            result += findPathHelper(a, i+1, j, path);
        }

        //Going right
        if(j < a[0].length-1 && !a[i][j+1]) {
            path[i+j] = 'R';
            result += findPathHelper(a, i, j+1, path);
        }
        return result;
    }


    /**
     * This function returns the total
     * count of all possible paths
     *
     * Caches the count for i and j, so
     * that they can be re-used.
     *
     * Time Complexity - O(n*m)
     *
     * @param a - Boolean 2D array
     * @return - count of all possible paths from top right to bottom left
     */
    public static int getPathCount(boolean[][] a){
        int[][] count = new int[a.length][a[0].length];
        for(int i = 0; i < count.length; i++)
            for(int j = 0; j < count[0].length; j++)
                count[i][j] = -1;
        return getPathCountHelper(a, 0, 0, count);
    }

    private static int getPathCountHelper(boolean[][] a, int i, int j, int[][] count) {
        GET_PATH_COUNT_STACK_CALL++;

        if(i > a.length-1 || j > a[0].length-1 )
            return 0;

        if(i == a.length-1 && j == a[0].length-1) {
            count[i][j] = 1;
            return count[i][j];
        }

        if(count[i][j] != -1)
            return count[i][j];

        count[i][j] = 0;

        // Going down
        if(i < a.length-1 && !a[i+1][j]) {
            count[i][j] += getPathCountHelper(a, i+1, j, count);

        }

        //Going right
        if(j < a[0].length-1 && !a[i][j+1]) {
            count[i][j] += getPathCountHelper(a, i, j+1, count);
        }
        return count[i][j];
    }


}
