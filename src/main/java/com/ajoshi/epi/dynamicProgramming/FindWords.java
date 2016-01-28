package com.ajoshi.epi.dynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by ajoshi on 10/24/15.
 */
public class FindWords {

    public static long COUNT = 0;
    public static long DP_COUNT = 0;

    /**
     *
     * Time Complexity - O(n!)
     *
     * Find valid words in String s, such that concatenating the
     * words make s
     *
     * @param s - String s, which is concatenation of words
     * @param dictionary - Set of valid words
     * @return - List of possible words that form S
     */
    public static ArrayList<ArrayList<String>> findWordsInString(String s, HashSet<String> dictionary) {

        ArrayList<ArrayList<String>> results = new ArrayList<ArrayList<String>>();

        if(s == null || s.equals("")) {
            results.add(new ArrayList<String>());
            return results;
        }

        for(int i = 1; i <= s.length(); i++) {
            COUNT++;
            String prefix = s.substring(0,i);
            String suffix = s.substring(i);

            if(dictionary.contains(prefix)) {
                ArrayList<ArrayList<String>> subResults = findWordsInString(suffix,dictionary);
                for(ArrayList<String> result : subResults) {
                    result.add(0,prefix);
                    results.add(result);
                }
            }
        }
        return results;
    }


    /**
     *
     * Time Complexity - O(n)
     *
     * Find valid words in String s, such that concatenating the
     * words make s
     *
     * @param s - String s, which is concatenation of words
     * @param dictionary - Set of valid words
     * @return - List of possible words that form S
     */
    public static ArrayList<ArrayList<String>> findWordsInStringDP(String s, HashSet<String> dictionary) {
        HashMap<String, ArrayList<ArrayList<String>>> map = new HashMap<String, ArrayList<ArrayList<String>>>();
        return findWordsInStringDPHelper(s, dictionary, map);
    }

    private static ArrayList<ArrayList<String>> findWordsInStringDPHelper(String s, HashSet<String> dictionary,
                                                                          HashMap<String, ArrayList<ArrayList<String>>> map) {

        ArrayList<ArrayList<String>> results = new ArrayList<ArrayList<String>>();

        if(s == null || s.equals("")) {
            results.add(new ArrayList<String>());
            return results;
        }

        for(int i = 1; i <= s.length(); i++) {
            DP_COUNT++;
            String prefix = s.substring(0,i);
            String suffix = s.substring(i);

            if(dictionary.contains(prefix)) {
                ArrayList<ArrayList<String>> subResults = null;
                if(map.containsKey(suffix))
                    subResults = map.get(suffix);
                else {
                    subResults = findWordsInString(suffix,dictionary);
                    map.put(suffix, subResults);
                }
                for(ArrayList<String> result : subResults) {
                    result.add(0,prefix);
                    results.add(result);
                }
            }
        }
        return results;
    }

}
