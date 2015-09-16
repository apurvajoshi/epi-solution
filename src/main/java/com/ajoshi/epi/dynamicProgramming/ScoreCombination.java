package com.ajoshi.epi.dynamicProgramming;
import java.util.ArrayList;

/**
 * Created by ajoshi on 9/14/15.
 */
public class ScoreCombination {


    /**
     *
     * Recursive implementation.
     * Complexity exponential.
     *
     */
    public static ArrayList<int[]> findScoreCombination(int score, int[] points) {
        ArrayList<int[]> results =  new ArrayList<int[]>();
        findScoreCombinationHelper(score, points, 0, results, new int[points.length]);

        for(int[] result : results) {
            for(int i = 0; i < result.length; i++) {
                System.out.print(points[i] + "->" + result[i] + " ");
            }
            System.out.println();
        }

        return results;
    }

    private static void findScoreCombinationHelper(int score, int[] points, int index,
                                                  ArrayList<int[]> results, int[] count) {
        if(score < 0 || index > points.length)
            return;

        if(index == points.length) {
            if(score == 0)
                results.add(count.clone());
            return;
        }

        for(int i = 0; i <= Math.floor(score / points[index]); i++) {
            int newScore = score - (i * points[index]);
            count[index] = i;
            findScoreCombinationHelper(newScore, points, index+1, results, count);
        }
    }

    /**
     *
     * Implementation using dynamic programming
     * Time Complexity O(s*n) [s:# of points, n = score]
     * Space Complexity O(n)
     *
     *
     * @param score
     * @param points
     * @return
     */
    public static int findScoreCombinationUsingDP(int score, int[] points) {
        int[] combination = new int[score+1];

        // 0 can be reached in 1 way.
        combination[0] = 1;

        for(int point : points) {
            for(int i = point; i <= score; i++) {
                combination[i] += combination[i-point];
            }
        }
        return combination[score];
    }

    public static int findScorePermutationUsingDP(int score, int[] points) {
        int[] permutation = new int[score+1];

        //0 can be permuted in 1 way
        permutation[0] = 1;

        for(int i = 0; i <= score; i++) {
            for(int point:points) {
                if(i >= point)
                    permutation[i] += permutation[i-point];
            }
        }

        return permutation[score];

    }
}
