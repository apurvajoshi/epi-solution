package com.ajoshi.epi.dynamicProgramming;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ScoreCombinationTest {

    @Test
    public void testFindScoreCombination() throws Exception {
        System.out.println("\ntestFindScoreCombination");
        int score = 12;
        int[] points = {2,3,7};
        ScoreCombination.findScoreCombination(score, points);
    }

    @Test
    public void testFindScoreCombination2() throws Exception {
        System.out.println("\ntestFindScoreCombination2");
        int score = 50;
        int[] points = {3,5,10,25};
        ScoreCombination.findScoreCombination(score, points);
    }

    @Test
    public void testFindScoreCombinationUsingDP() throws Exception {
        System.out.println("\ntestFindScoreCombinationUsingDP");
        int score = 50;
        int[] points = {3,5,10,25};
        assertEquals(ScoreCombination.findScoreCombinationUsingDP(score, points),8867);
    }

    @Test
    public void testFindScoreCombinationUsingDP1() throws Exception {
        System.out.println("\ntestFindScoreCombinationUsingDP1");
        int score = 12;
        int[] points = {2,3,7};
        assertEquals(ScoreCombination.findScoreCombinationUsingDP(score, points),18);
    }

    @Test
    public void testFindScorePermutationUsingDP() throws Exception {
        System.out.println("\ntestFindScorePermutationUsingDP");
        int score = 50;
        int[] points = {3,5,10,25};
        assertEquals(ScoreCombination.findScorePermutationUsingDP(score, points),20);
    }

    @Test
    public void testFindScorePermutationUsingDP1() throws Exception {
        System.out.println("\ntestFindScorePermutationUsingDP1");
        int score = 12;
        int[] points = {2,3,7};
        assertEquals(ScoreCombination.findScorePermutationUsingDP(score, points),4);
    }
}
