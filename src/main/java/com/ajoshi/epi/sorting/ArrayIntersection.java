package com.ajoshi.epi.sorting;

import java.util.ArrayList;

/**
 * Created by ajoshi on 10/2/15.
 */
public class ArrayIntersection {

    // Private constructor to suppress
    // instantiability
    private ArrayIntersection() {
        throw new AssertionError();
    }

    public static ArrayList<Integer> findIntersection(int[] a, int[] b) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int i=0,j=0;
        while( i < a.length && j < b.length) {
            if(a[i] == b[j]) {
                if(i == 0 || a[i] != a[i-1]) {
                    result.add(a[i]);
                }
                i++;
                j++;
            }
            else if(a[i] < b[j])
                i++;
            else
                j++;
        }

        return result;
    }
}
