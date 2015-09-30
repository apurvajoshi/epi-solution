package com.ajoshi.epi.hashTables;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ajoshi on 9/28/15.
 */
public class PalindromePermutation {
    public static boolean hasPalindromePermutation(String s) {
        HashMap<Character, Integer> map =  new HashMap<Character, Integer>();
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                int value = map.get(s.charAt(i));
                map.put(s.charAt(i), ++value);
            }
            else {
                map.put(s.charAt(i),1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character key = entry.getKey();
            int value = entry.getValue();
            if(value % 2 != 0) {
                if(count == 0)
                    count++;
                else
                    return false;
            }
        }
        return true;
    }
}
