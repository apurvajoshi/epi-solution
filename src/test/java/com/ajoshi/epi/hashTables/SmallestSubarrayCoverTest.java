package com.ajoshi.epi.hashTables;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class SmallestSubarrayCoverTest {

    @Test
    public void testFindMinSubarrayCover() throws Exception {
        String[] sentence = {"apple", "banana","apple","apple","dog","cat","apple","dog","banana","apple","cat","dog"};
        HashSet<String> set = new HashSet<String>();
        set.add("banana");
        set.add("dog");

        SmallestSubarrayCover.Subarray result = SmallestSubarrayCover.findMinSubarrayCover(sentence, set);
        assertEquals(result.start, 7);
        assertEquals(result.end, 8);

        set = new HashSet<String>();
        set.add("banana");
        set.add("cat");

        result = SmallestSubarrayCover.findMinSubarrayCover(sentence, set);
        assertEquals(result.start, 8);
        assertEquals(result.end, 10);
    }

    @Test
    public void testFindMinSubarrayWithoutKeyWords() throws Exception {
        String[] sentence = {"apple", "banana","apple","apple","dog","cat","apple","dog","banana","apple","cat","dog"};
        HashSet<String> set = new HashSet<String>();
        SmallestSubarrayCover.Subarray result = SmallestSubarrayCover.findMinSubarrayCover(sentence, set);
        assertEquals(result.start, -1);
        assertEquals(result.end, -1);
    }

    @Test
    public void testFindMinSubarrayWithOneKeyWord() throws Exception {
        String[] sentence = {"apple", "banana","apple","apple","dog","cat","apple","dog","banana","apple","cat","dog"};
        HashSet<String> set = new HashSet<String>();
        set.add("dog");
        SmallestSubarrayCover.Subarray result = SmallestSubarrayCover.findMinSubarrayCover(sentence, set);
        assertEquals(result.start, 4);
        assertEquals(result.end, 4);
    }

    @Test
    public void testFindMinSubarrayWithUnrelatedKeyWords() throws Exception {
        String[] sentence = {"apple", "banana","apple","apple","dog","cat","apple","dog","banana","apple","cat","dog"};
        HashSet<String> set = new HashSet<String>();
        set.add("ball");
        set.add("cycle");
        SmallestSubarrayCover.Subarray result = SmallestSubarrayCover.findMinSubarrayCover(sentence, set);
        assertEquals(result.start, -1);
        assertEquals(result.end, -1);
    }
}