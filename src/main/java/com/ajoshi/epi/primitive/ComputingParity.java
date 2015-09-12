package com.ajoshi.epi.primitive;

/**
 * Created by ajoshi on 7/30/15.
 *
 * Problem 5.1: How would you go about computing the parity of a very large number of 64-bit nonnegative integers?
 *
 */
public class ComputingParity {

    public static int calculateParity1(long i) {
        int parity = 0;
        while(i != 0) {
            parity ^= (i & 1);
            i = i >>> 1;
        }
        return parity;
    }

    public static int calculateParity2(long i) {
        int parity = 0;
        while(i != 0) {
            parity ^= 1;
            i &= (i-1);
        }
        return parity;
    }


    public static void main(String args[]) {
        if(args.length < 1) {
            System.out.println("Provide the number for which parity needs to be calculated");
            System.exit(0);
        }

        try {
            long number = Long.parseLong(args[0]);
            if(number < 0) {
                System.out.println("Cannot calculate parity for negative number");
                System.exit(0);
            }

            System.out.println("Calculating parity for " + args[0]);
            System.out.println("Parity is " + calculateParity2(number));
        } catch (NumberFormatException e) {
            System.out.println("Argument " + args[0] + " is not a number");
        }
    }
}
