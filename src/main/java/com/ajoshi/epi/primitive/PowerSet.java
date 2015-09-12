package com.ajoshi.epi.primitive;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by ajoshi on 8/3/15.
 *
 * Implement a method that takes as input a set S of distinct elements,
 * and prints the power set of S. Print the subsets one per line,
 * with elements separated by commas.
 *
 */
public class PowerSet {

    public static ArrayList<ArrayList<Integer>> recursivePowerSet(int[] set) {
        return recursivePowerSetHelper(set, 0, new ArrayList<ArrayList<Integer>>());
    }

    public static ArrayList<ArrayList<Integer>> recursivePowerSetHelper(int[] set, int index,
                                                                  ArrayList<ArrayList<Integer>> results) {
        if(results.isEmpty()) {
            System.out.println("Results is empty");
            results.add(new ArrayList<Integer>());
        }

        if (index == set.length) {
            return results;
        }

        ArrayList<ArrayList<Integer>> moreResults = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < results.size(); i++) {
            ArrayList<Integer> result = new ArrayList<Integer>(results.get(i));
            result.add(set[index]);
            moreResults.add(result);
        }

        System.out.println("More results = " + moreResults.toString());
        results.addAll(moreResults);
        System.out.println("Results = " + results.toString());
        return recursivePowerSetHelper(set, index + 1, results);
    }

    public static ArrayList<ArrayList<Integer>> calculatePowerSet(int[] set) {
        ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
        int length = 1 << (set.length);
        System.out.println("Length = " + length);
        for(int i=0; i < length; i++) {
            int k = i;
            ArrayList<Integer> result = new ArrayList<Integer>();
            int j = 0;
            while(k != 0) {
                if((k & 1) == 1) {
                    result.add(set[j]);
                }
                j++;
                k >>>= 1;
            }
            System.out.println("Result " + result.toString());
            results.add(result);
        }

        return results;
    }

    public static void main(String args[]) {
        int[] a = {1,2,3,4,5};
        calculatePowerSet(a);

    }
}
