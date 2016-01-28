package com.ajoshi.epi.recursion;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * Created by ajoshi on 11/13/15.
 */
public class GenerateCombination {

    public static ArrayList<ArrayList<String>> getCombinations(LinkedHashMap<String, ArrayList<String>> map) {
        return getCombinationsHelper(new ArrayList<>(map.values()), 0);
    }

    private static ArrayList<ArrayList<String>> getCombinationsHelper(ArrayList<ArrayList<String>> baseDimension, int index) {

        ArrayList<ArrayList<String>> results = new ArrayList<>();

        if(index == baseDimension.size()) {
            results.add(new ArrayList<String>());
            return results;
        }

        for(int i = 0; i < baseDimension.get(index).size(); i++) {
            ArrayList<ArrayList<String>> subResults = getCombinationsHelper(baseDimension, index+1);
            for(ArrayList subResult : subResults) {
                subResult.add(0, baseDimension.get(index).get(i));
                results.add(subResult);
            }
        }

        return results;

    }
}
