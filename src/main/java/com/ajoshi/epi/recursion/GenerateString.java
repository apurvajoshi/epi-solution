package com.ajoshi.epi.recursion;

import java.util.ArrayList;
import java.util.Map;

/**
 *
 * Created by ajoshi on 10/23/15.
 */
public class GenerateString {

    /**
     *
     * Time Complexity - O(n!)
     *
     * @param str
     * @param map
     * @return
     */
    public static ArrayList<String> findStringCombination(String str, Map<String, String> map) {
        ArrayList<String> results = new ArrayList<String>();

        if(str == null || str.equals("")) {
            results.add("");
            return results;
        }

        for(int i = 1; i <= str.length(); i++) {
            String p1 = str.substring(0,i);
            String p2 = str.substring(i);

            if(map.containsKey(p1)) {
                String prefix = map.get(p1);
                ArrayList<String> suffixes = findStringCombination(p2, map);
                for(String suffix : suffixes)
                    results.add(prefix+suffix);
            }

        }
        return results;
    }
}
