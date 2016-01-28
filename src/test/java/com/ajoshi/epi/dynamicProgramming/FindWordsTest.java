package com.ajoshi.epi.dynamicProgramming;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.Assert.*;

public class FindWordsTest {

    private static HashSet<String> dictionary = new HashSet<String>();

    @BeforeClass
    public static void setUp() {
        dictionary.add("bed");
        dictionary.add("bath");
        dictionary.add("and");
        dictionary.add("beyond");
        dictionary.add("a");
        dictionary.add("hand");
        dictionary.add("on");
        dictionary.add("bat");
        dictionary.add("be");
        dictionary.add("at");
        dictionary.add("an");
    }

    @Test
    public void testFindWordsInString() throws Exception {
        String s = "bedbathandbeyond";

        ArrayList<ArrayList<String>> results = FindWords.findWordsInString(s,dictionary);
        for(ArrayList<String> result : results) {
            System.out.println(result);
        }

        System.out.println(FindWords.COUNT);
    }

    @Test
    public void testFindWordsWhenStringIsEmpty() throws Exception {
        String s = "";

        ArrayList<ArrayList<String>> results = FindWords.findWordsInString(s,dictionary);
        for(ArrayList<String> result : results) {
            System.out.println(result);
        }
    }

    @Test
    public void testFindWordsWhenStringIsNull() throws Exception {
        String s = null;

        ArrayList<ArrayList<String>> results = FindWords.findWordsInString(s,dictionary);
        for(ArrayList<String> result : results) {
            System.out.println(result);
        }
    }

    @Test
    public void testFindWordsWhenStringContainsDuplicateWords() throws Exception {
        String s = "abedabedabedabed";

        ArrayList<ArrayList<String>> results = FindWords.findWordsInString(s,dictionary);
        for(ArrayList<String> result : results) {
            System.out.println(result);
        }
    }

    @Test
    public void testFindWordsInStringUsingDP() throws Exception {
        String s = "bedbathandbeyond";

        ArrayList<ArrayList<String>> results = FindWords.findWordsInStringDP(s,dictionary);
        for(ArrayList<String> result : results) {
            System.out.println(result);
        }

        System.out.println(FindWords.DP_COUNT);
    }
}