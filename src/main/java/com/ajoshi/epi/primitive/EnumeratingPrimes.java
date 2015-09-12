package com.ajoshi.epi.primitive;

import java.util.ArrayList;

/**
 * Created by ajoshi on 8/5/15.
 */
public class EnumeratingPrimes {

    public static ArrayList<Integer> enumeratePrimes(int n) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        boolean isPrime = true;
        for(int i = n; i > 1; i--) {
            isPrime = true;
            for(int j = i-1; j > 1; j--) {
                if(i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                result.add(i);
        }
        System.out.println("result = " + result.toString());
        return result;
    }
}
