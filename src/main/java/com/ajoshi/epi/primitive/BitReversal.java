package com.ajoshi.epi.primitive;

/**
 * Created by ajoshi on 8/3/15.
 *
 *  Write a function that takes a 64-bit integer x and returns a 64-bit integer consisting of the bits of x in reverse order.
 *
 *
 */
public class BitReversal {

    public static long reverseBits(long x) {
        for(int i = 0; i < 32; i++) {
            x = swapBits2(x, i, 63-i);
        }
        return x;
    }

    public static long swapBits2(long x, int i, int j) {
        if(((x >> i) & 1) != ((x >> j) & 1)) {
            x ^= (1L << i) | (1L << j);
        }
        return x;
    }

    public static void main(String args[]) {
        if(args.length < 1) {
            System.out.println("Provide the number for which bits needs to be reversed");
            System.exit(0);
        }

        try {
            long number = Long.parseLong(args[0]);
            System.out.println("Reversing Bits for " + Long.toBinaryString(number));
            Long x =  reverseBits(number);
            System.out.println("After reversing " + Long.toBinaryString(x));
            System.out.println("New number is " + x);
        } catch (NumberFormatException e) {
            System.out.println("Argument " + args[0] + " is not a number");
        }
    }
}
