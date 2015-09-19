package com.ajoshi.epi.dynamicProgramming;

/**
 * Created by ajoshi on 9/18/15.
 */
public class LevenshteinDistance {

    public static int countCallStack1 = 0;
    public static int countCallStack2 = 0;
    public static int countCallStack3= 0;
    private static int[][] distance;

    /**
     * Attempt-1
     * Recursive solution - highly inefficient
     * Running Time - exponential
     *
     * @param s1 - String 1
     * @param s2 - String 2
     * @param i1 - Index to String 1
     * @param i2 - Index to String 2
     * @return
     */
    public static int calculateLevenshteinDistance(String s1, String s2, int i1, int i2) {
        countCallStack1++;
        if(i1 < s1.length() && i2 < s2.length()) {
            if(s1.charAt(i1) == s2.charAt(i2)) {
                return calculateLevenshteinDistance(s1, s2, i1+1, i2+1);
            }
            else {
                return 1 + Math.min(calculateLevenshteinDistance(s1, s2, i1+1, i2+1),
                        Math.min(calculateLevenshteinDistance(s1, s2, i1, i2+1),calculateLevenshteinDistance(s1, s2, i1+1, i2)));
            }
        } else if (i1 >= s1.length() && i2 < s2.length()) {
            return 1 + calculateLevenshteinDistance(s1,s2,i1, i2+1);
        } else if (i2 >= s2.length() && i1 < s1.length()) {
            return 1 + calculateLevenshteinDistance(s1,s2,i1+1, i2);
        } else {
            return 0;
        }
    }

    /**
     * Attempt-2
     * Recursive solution, much better than Attempt-1.
     * Caches the solutions for each i and j and
     * reuses it if the same i and j re-appear.
     *
     * Time complexity -  O(s1.length * s2.length)
     *
     * @param s1 - String 1
     * @param s2 - String 2
     * @return Levenshtein Distance between string s1 and s2
     */
    public static int calculateLevenshteinDistanceUsingCaching(String s1, String s2) {
        distance = new int[s1.length()+1][s2.length()+1];
        for(int i = 0; i < distance.length; i++)
            for(int j = 0; j < distance[0].length; j++)
                    distance[i][j] = -1;
        return calculateLevenshteinDistanceUsingCachingHelper(s1,s2,0,0);
    }

    private static int calculateLevenshteinDistanceUsingCachingHelper(String s1, String s2, int i1, int i2) {
        if(distance[i1][i2] != -1)
            return distance[i1][i2];
        countCallStack2++;
        if(i1 < s1.length() && i2 < s2.length()) {
            if(s1.charAt(i1) == s2.charAt(i2)) {
                distance[i1][i2] = calculateLevenshteinDistanceUsingCachingHelper(s1, s2, i1+1, i2+1);
            }
            else {
                distance[i1][i2] = 1 + Math.min(calculateLevenshteinDistanceUsingCachingHelper(s1, s2, i1+1, i2+1),
                        Math.min(calculateLevenshteinDistanceUsingCachingHelper(s1, s2, i1, i2+1),
                                calculateLevenshteinDistanceUsingCachingHelper(s1, s2, i1+1, i2)));
            }
        } else if (i1 >= s1.length() && i2 < s2.length()) {
            distance[i1][i2] = 1 + calculateLevenshteinDistanceUsingCachingHelper(s1,s2,i1, i2+1);
        } else if (i2 >= s2.length() && i1 < s1.length()) {
            distance[i1][i2] = 1 + calculateLevenshteinDistanceUsingCachingHelper(s1,s2,i1+1, i2);
        } else {
            distance[i1][i2] = 0;
        }
        return distance[i1][i2];
    }


    /**
     * Attempt-3
     * Recursive solution, slightly better than Attempt-2.
     * Caches the solutions for each i and j and
     * reuses it if the same i and j re-appear.
     *
     * Initializes the array with values for base case, hence
     * decreasing the number of stack calls.
     *
     * Time complexity -  O(s1.length * s2.length)
     *
     * @param s1 - String 1
     * @param s2 - String 2
     * @return Levenshtein Distance between string s1 and s2
     */
    public static int calculateLevenshteinDistanceUsingDP(String s1, String s2) {
        distance = new int[s1.length()+1][s2.length()+1];
        for(int i = 0; i < distance.length; i++)
            for(int j = 0; j < distance[0].length; j++) {
                if(i == 0)
                    distance[i][j] = j;
                else if (j == 0)
                    distance[i][j] = i;
                else
                    distance[i][j] = -1;
            }

        return calculateLevenshteinDistanceUsingDPHelper(s1,s2,s1.length(),s2.length());
    }

    private static int calculateLevenshteinDistanceUsingDPHelper(String s1, String s2, int i1, int i2) {
        if(distance[i1][i2] != -1)
            return distance[i1][i2];
        countCallStack3++;
        if(i1 <= s1.length() && i2 <= s2.length()) {
            if(s1.charAt(i1-1) == s2.charAt(i2-1)) {
                distance[i1][i2] = calculateLevenshteinDistanceUsingDPHelper(s1, s2, i1-1, i2-1);
            }
            else {
                distance[i1][i2] = 1 + Math.min(calculateLevenshteinDistanceUsingDPHelper(s1, s2, i1-1, i2-1),
                        Math.min(calculateLevenshteinDistanceUsingDPHelper(s1, s2, i1, i2-1),
                                calculateLevenshteinDistanceUsingDPHelper(s1, s2, i1-1, i2)));
            }
        }
        return distance[i1][i2];
    }


    /**
     * Attempt 4
     *
     * Iterative solution using Dynamic Programming
     *
     * Time complexity -  O(s1.length * s2.length)
     *
     * @param s1 - String 1
     * @param s2 - String 2
     * @return - Levenshtein Distance between string s1 and s2
     */
    public static int calculateLevenshteinDistanceUsingDPIterative(String s1, String s2) {
        distance = new int[s1.length()+1][s2.length()+1];
        for(int i = 0; i < distance.length; i++)
            for(int j = 0; j < distance[0].length; j++) {
                if(i == 0)
                    distance[i][j] = j;
                else if (j == 0)
                    distance[i][j] = i;
            }
        for(int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    distance[i][j] = distance[i-1][j-1];
                } else {
                    distance[i][j] = 1 + Math.min(distance[i-1][j-1], Math.min(distance[i-1][j], distance[i][j-1]));
                }
            }
        }
        return distance[s1.length()][s2.length()];
    }

}
