package com.ajoshi.epi.dynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by ajoshi on 10/7/15.
 */
public class SequenceSearch {

    public static int COUNT = 0;

    private static HashMap<String, Boolean> cache = new HashMap<String, Boolean>();

    private static class Point {
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    /**
     *
     * Search for Array S in 2D array A
     *
     * @param A - 2D array
     * @param s - Array to be search
     * @return true if s is contained in A else false
     */
    public static boolean isContained(int[][] A, int[] s) {
        for(int i = 0; i < A.length; i++) {
            for (int j = 0; j <  A[0].length; j++) {
                if(isContainedHelper(A,s,0,i,j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isContainedHelper(int[][] A, int[] s, int index, int i, int j) {
        //System.out.println("i = " + i + " j = " + j + " index = " + index);
        if(cache.containsKey(i+"_"+j+"_"+index))
            return cache.get(i+"_"+j+"_"+index);
        COUNT++;
        if(index == s.length) {
            cache.put(i+"_"+j+"_"+index, true);
            return true;
        }

        for(Point p : getAdjacent(A,i,j)) {
            if(A[p.x][p.y] == s[index] && isContainedHelper(A, s, index+1, p.x, p.y)) {
                cache.put(i+"_"+j+"_"+index, true);
                return true;
            }

        }

        cache.put(i+"_"+j+"_"+index, false);
        return false;
    }

    private static ArrayList<Point> getAdjacent(int[][] A, int i, int j) {

        if(i < 0 || j < 0 || i >= A.length || j >= A[0].length)
            return null;

        ArrayList<Point> adjacent = new ArrayList<Point>();
        if(i+1 < A.length)
            adjacent.add(new Point(i+1, j));
        if(j+1 < A[0].length)
            adjacent.add(new Point(i, j+1));
        if(i-1 >= 0)
            adjacent.add(new Point(i-1, j));
        if(j-1 >= 0)
            adjacent.add(new Point(i, j-1));
        return adjacent;
    }
}
