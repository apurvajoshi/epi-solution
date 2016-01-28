package com.ajoshi.epi.hashTables;

import org.junit.Test;

import static org.junit.Assert.*;

public class NearestRepeatedEntriesTest {

    @Test
    public void testFindClosestPairs() throws Exception {
        String[] words = {"All","work","and","no","play","makes","for","no","work","no","fun","and","no","results"};
        assertEquals(NearestRepeatedEntries.findClosestPairs(words), 2);
    }
}