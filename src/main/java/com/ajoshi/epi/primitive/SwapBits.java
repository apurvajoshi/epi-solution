package com.ajoshi.epi.primitive;

/**
 * Created by ajoshi on 8/1/15.
 *
 * A 64-bit integer can be viewed as an array of 64 bits,
 * with the bit at index 0 corresponding to the least significant bit,
 * and the bit at index 63 corresponding to the most significant bit Implement
 * code that takes as input a 64-bit integer x and swaps the bits at indices i and j.
 */


public class SwapBits {

    public static long swapBits(long x, int i, int j) {
        int ithBit = (int)((x >> i) & 1);
        int jthBit = (int)((x >> j) & 1);
        if(ithBit == 1)
            x = x | (1 << j);
        else
            x = x & ~(1 << j);

        if(jthBit == 1)
            x = x | (1 << i);
        else
            x = x & ~(1 << i);
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
            System.out.println("Provide the number for which bits needs to be swapped");
            System.exit(0);
        }

        try {
            long number = Long.parseLong(args[0]);
            System.out.println("Swapping Bits for " + Long.toBinaryString(number));
            System.out.println("After swapping " + Long.toBinaryString(swapBits2(number, 2, 5)));
        } catch (NumberFormatException e) {
            System.out.println("Argument " + args[0] + " is not a number");
        }
    }
}
