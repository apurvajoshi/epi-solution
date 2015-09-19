package com.ajoshi.epi.dynamicProgramming;

import org.junit.Test;

import static org.junit.Assert.*;

public class LCSTest {

    @Test
    public void testFindLCS() throws Exception {
        String s1 = "kitten";
        String s2 = "sitting";
        System.out.println("Longest common subsequence length is " +  LCS.findLCS(s1,s2));
        System.out.println("Longest common subsequence  is " + LCS.backtrackLCS(s1,s2,s1.length(),s2.length()));

        s1="apurva";
        s2="poorva";
        System.out.println("Longest common subsequence length is " +  LCS.findLCS(s1,s2));
        System.out.println("Longest common subsequence  is " + LCS.backtrackLCS(s1,s2,s1.length(),s2.length()));

        s1="carthorse";
        s2="orchestra";
        System.out.println("Longest common subsequence length is " +  LCS.findLCS(s1,s2));
        System.out.println("Longest common subsequence  is " + LCS.backtrackLCS(s1,s2,s1.length(),s2.length()));

        s1="xmjyauz";
        s2="mzjawxu";
        System.out.println("Longest common subsequence length is " +  LCS.findLCS(s1,s2));
        System.out.println("Longest common subsequence  is " + LCS.backtrackLCS(s1,s2,s1.length(),s2.length()));
    }
}