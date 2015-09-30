package com.ajoshi.epi.hashTables;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class AnagramsTest {

    @Test
    public void testPartitionIntoAnagrams() throws Exception {
        String[] strings = {"debitcard", "elvis", "silent", "badcredit", "lives", "freedom", "listen", "levis"};
        ArrayList<String[]> result = Anagrams.partitionIntoAnagrams(strings);
        for(String[] s:result) {
            System.out.println(Arrays.toString(s));
        }
    }
}