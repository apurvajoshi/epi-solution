package com.ajoshi.epi.hashTables;

import java.util.*;

/**
 * Created by ajoshi on 9/25/15.
 */
public class Anagrams {

    public static ArrayList<String[]> partitionIntoAnagrams(String[] strings) {
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        ArrayList<String []> result = new ArrayList<String[]>();
        for(String str : strings) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if(map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                ArrayList<String> value = new ArrayList<String>();
                value.add(str);
                map.put(key, value);
            }
        }

        for(ArrayList<String> value : map.values()) {
            String[] stringList = new String[value.size()];
            value.toArray(stringList);
            result.add(stringList);
        }
        return result;
    }
}
