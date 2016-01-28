package com.ajoshi.epi.hashTables;

import java.util.HashMap;

/**
 * Created by ajoshi on 10/14/15.
 */
public class NearestRepeatedEntries {
    public static int findClosestPairs(String[] paragraph) {
        int mindiff = Integer.MAX_VALUE;
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for(int i = 0; i < paragraph.length; i++) {
            if(map.containsKey(paragraph[i])) {
                if(mindiff > (i - map.get(paragraph[i])))
                    mindiff = i - map.get(paragraph[i]);
            }
            map.put(paragraph[i], i);
        }

        return mindiff;
    }
}
