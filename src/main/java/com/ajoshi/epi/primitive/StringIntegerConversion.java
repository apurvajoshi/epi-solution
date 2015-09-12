package com.ajoshi.epi.primitive;

/**
 * Created by ajoshi on 8/3/15.
 *
 * Implement stringlinteger inter-conversion functions.
 * Use the followingfunction signatures: String intToString(int ]C) and int stringToInt(String s).
 *
 */
public class StringIntegerConversion {

    public static String intToString(int x) {

        boolean isNegative = false;
        if(x < 0) {
            isNegative = true;
            x *= -1;
        }

        StringBuilder s = new StringBuilder();
        int i = x;
        do {
            char c = (char)('0' + (i%10));
            //System.out.println("C = " + c);
            s.append(c);
            i/=10;
        } while(i > 0);
        //System.out.println("S = " + s.toString());
        s = s.reverse();
        System.out.println("S = " + s.toString());
        if(isNegative)
            s.insert(0,'-');

        return s.toString();
    }

    public static int stringToInt(String s) {
        int n = 0;
        boolean isNegative = false;
        s = s.trim();
        if(s.charAt(0) == '-') {
            isNegative = true;
            s = s.substring(1);
        }

        for(int i = 0; i < s.length() ; i++) {
            int j = s.charAt(i) - '0';
            if(j < 0 || j > 9) {
                System.out.println("Incorrect input");
                return -1;
            }
            n = n * 10 + j;
        }
        return isNegative ? (-1 * n) : n;
    }
 }
