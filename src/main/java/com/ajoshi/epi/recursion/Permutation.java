package com.ajoshi.epi.recursion;

import java.util.ArrayList;

/**
 * Created by ajoshi on 9/28/15.
 */
public class Permutation {
    public static ArrayList<ArrayList<Integer>> getPermutation(int[] a, int index) {
        ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();

        if(index == a.length) {
            ArrayList<Integer> result = new ArrayList<Integer>();
            results.add(result);
            return results;
        }

        int element = a[index];
        ArrayList<ArrayList<Integer>> subresults = getPermutation(a, index+1);

        for(ArrayList<Integer> subresult : subresults) {
            for(int i = 0; i <= subresult.size(); i++) {
                ArrayList<Integer> result = (ArrayList<Integer>) subresult.clone();
                result.add(i,element);
                results.add(result);
            }
        }
        return results;
     }

}
