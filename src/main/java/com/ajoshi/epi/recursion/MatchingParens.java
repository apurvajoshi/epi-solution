package com.ajoshi.epi.recursion;

/**
 * Created by ajoshi on 10/27/15.
 */
public class MatchingParens {

    public static void printMatchingParens(int i) {
        char[] result = new char[2*i];
        printMatchingParensHelper(i, i, result, 0);
    }

    /**
     *
     * Time Complexity - O(2^(2*i))
     *
     * @param left
     * @param right
     * @param result
     * @param index
     */
    private static void printMatchingParensHelper(int left, int right, char[] result, int index) {
        if(left > right)
            return;

        if(left == 0 && right == 0) {
            System.out.println(result);
            return;
        }

        if(left > 0) {
            result[index] = '(';
            printMatchingParensHelper(left-1, right, result, index+1);
        }

        if(left < right) {
            result[index] = ')';
            printMatchingParensHelper(left, right-1, result, index+1);
        }
    }
}
