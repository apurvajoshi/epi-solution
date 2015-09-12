package com.ajoshi.epi.primitive;

/**
 * Created by ajoshi on 8/4/15.
 */
public class BaseConversion {

    public static String baseConversion(int b1, String s, int b2) {
        boolean isNegative = s.startsWith("-");
        System.out.println("Number in " + b1 + " base = " + s);
        int n = 0;
        for(int i = isNegative ? 1 : 0; i < s.length(); i++) {
            int j = s.charAt(i) - '0' < 10 ?  s.charAt(i) - '0': s.charAt(i) - 'A' + 10;
            n = n * b1 + j;
        }
        System.out.println("Number in 10 base = " + n);
        StringBuilder sb = new StringBuilder();
        do {
            int j = n%b2;
            sb.append(j <10 ? j : j - 10 + 'A');
            n = n / b2;
        } while(n > 0);

        if(isNegative)
            sb.append('-');
        sb = sb.reverse();
        System.out.println("Number in " + b2 + " base = " + sb.toString());
        return sb.toString();
    }
}
