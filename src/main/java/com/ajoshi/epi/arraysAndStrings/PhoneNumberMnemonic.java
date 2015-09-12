package com.ajoshi.epi.arraysAndStrings;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by ajoshi on 8/10/15.
 */
public class PhoneNumberMnemonic {

    public static ArrayList<String> generateSequence(String phoneNo, HashMap<Integer, String> map) {
        ArrayList<String> results = new ArrayList<String>();

        if(phoneNo == null || phoneNo.isEmpty()) {
            results.add("");
            return results;
        }
        String seq = map.get((int)phoneNo.charAt(0)-'0');
        ArrayList<String> subResults = generateSequence(phoneNo.substring(1), map);
        for(int i = 0; i < subResults.size(); i++) {
            for(int j = 0; j < seq.length(); j++) {
                results.add(seq.charAt(j) + subResults.get(i));
            }
        }
        return results;
    }
}
