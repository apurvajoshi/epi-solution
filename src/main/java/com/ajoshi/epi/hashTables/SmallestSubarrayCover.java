package com.ajoshi.epi.hashTables;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by ajoshi on 10/20/15.
 */
public class SmallestSubarrayCover {

    public static class Subarray {
        int start;
        int end;

        public Subarray(int s, int e) {
            this.start = s;
            this.end = e;
        }
    }

    /**
     *
     * Time Complexity - O(n)
     *
     * @param sentence - A sentence containing the keywords
     * @param keywords - The keywords we are searching for
     * @return - Start index and end index of the smallest subarray
     */
    public static Subarray findMinSubarrayCover(String[] sentence, HashSet<String> keywords) {
        // Stores keyword and the last index for the keyword found in the sentence
        LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        int i = 0;
        int min = Integer.MAX_VALUE;
        Subarray result = new Subarray(-1,-1);

        if(keywords.size() == 0)
            return result;

        for(String word : sentence) {
            if(keywords.contains(word)) {
                // Just map.put(word, i) won't work because it does
                // not move the entry to front of the queue if an entry
                // with key word is already present in the map.
                map.remove(word);
                map.put(word, i);
                if(map.size() == keywords.size()) {
                    // Calculate the minimum sub array
                    Map.Entry<String, Integer> firstEntry = map.entrySet().iterator().next();
                    if( (i - firstEntry.getValue()) < min) {
                        min = i - firstEntry.getValue();
                        result.start = firstEntry.getValue();
                        result.end = i;
                    }
                }
            }
            i++;
        }
        return result;
    }
}
