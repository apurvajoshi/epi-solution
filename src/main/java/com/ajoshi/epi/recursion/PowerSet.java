package com.ajoshi.epi.recursion;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ajoshi on 10/1/15.
 */
public class PowerSet {

    public static ArrayList<ArrayList<Integer>> generatePowerSetRecursive(int [] a, int index) {

        if(index == a.length) {
            ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
            results.add(new ArrayList<Integer>());
            return results;
        }

        ArrayList<ArrayList<Integer>> results = generatePowerSetRecursive(a, index+1);
        ArrayList<ArrayList<Integer>> moreResults = new ArrayList<ArrayList<Integer>>();

        for(ArrayList<Integer> result : results) {
            ArrayList<Integer> moreResult = new ArrayList<Integer>(result);
            moreResult.add(a[index]);
            moreResults.add(moreResult);
        }

        results.addAll(moreResults);
        return results;
    }
}
