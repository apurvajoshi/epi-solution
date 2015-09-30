package com.ajoshi.epi.hashTables;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromePermutationTest {

    @Test
    public void testHasPalindromePermutation() throws Exception {
        assertEquals(PalindromePermutation.hasPalindromePermutation("edified"), true);
        assertEquals(PalindromePermutation.hasPalindromePermutation("aa"), true);
        assertEquals(PalindromePermutation.hasPalindromePermutation("aabbbaa"), true);
        assertEquals(PalindromePermutation.hasPalindromePermutation("a"), true);
        assertEquals(PalindromePermutation.hasPalindromePermutation("aba"), true);
        assertEquals(PalindromePermutation.hasPalindromePermutation("ababca"), false);
        assertEquals(PalindromePermutation.hasPalindromePermutation("ababa"), true);
    }
}