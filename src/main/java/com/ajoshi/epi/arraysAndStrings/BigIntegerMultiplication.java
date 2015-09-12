package com.ajoshi.epi.arraysAndStrings;

/**
 * Created by ajoshi on 8/11/15.
 * Write a function that takes two strings representing integers, and returns an integer representing their product.
 *
 */
public class BigIntegerMultiplication {

    public static int product(String s1, String s2) {
        int result = 0;
        int isNegative = 1;
        s1 = s1.trim();
        s2 = s2.trim();

        if(s1.charAt(0) == '-') {
            isNegative = isNegative * -1;
            s1 = s1.substring(1);
        }

        if(s2.charAt(0) == '-') {
            isNegative = isNegative * -1;
            s2 = s2.substring(1);
        }

        for(int i = s1.length()-1; i >= 0; i--) {
            int carry = 0;
            int sum = 0;
            for(int j = s2.length()-1; j >= 0; j--) {
                int product = (s2.charAt(j) - '0') * (s1.charAt(i) - '0') + carry;
                sum += (product % 10) * Math.pow(10, (s2.length()-1-j));
                carry = product / 10;
            }
            result += (sum + carry * (Math.pow(10, s2.length()))) * Math.pow(10,(s1.length()-1- i)) ;
        }
        return result * isNegative;
    }

    public static String improvedProduct(String s1, String s2) {
        int isNegative = 1;
        s1 = s1.trim();
        s2 = s2.trim();
        if(s1.charAt(0) == '-') {
            isNegative = isNegative * -1;
            s1 = s1.substring(1);
        }
        if(s2.charAt(0) == '-') {
            isNegative = isNegative * -1;
            s2 = s2.substring(1);
        }
        StringBuilder sb = new StringBuilder();
        s1 = new StringBuilder(s1).reverse().toString();
        s2 = new StringBuilder(s2).reverse().toString();
        int[] results = new int[s1.length() + s2.length()];

        for(int i = 0; i < s1.length(); i++) {
            int carry = 0;
            for(int j = 0; (j < s2.length()); j++) {
                int index = s1.length() + s2.length() - 1 - i - j;
                int value = ((s1.charAt(i) - '0') * (s2.charAt(j) - '0') + carry + results[index]);
                results[index] = (value % 10);
                carry = value / 10;
            }
            if(carry != 0) {
                int index = s1.length()  - 1 - i;
                results[index] += carry;
            }
        }

        int i = 0;
        while(i < results.length && results[i] == 0)
            i++;
        if(i == results.length) {
            return "0";
        }

        if(isNegative == -1)
            sb.append('-');
        for(int j = i; j < results.length; j++) {
            sb.append(results[j]);
        }
        return sb.toString();
    }

}
