package com.ajoshi.epi.searching;

/**
 * Created by ajoshi on 9/22/15.
 */
public class SquareRoot {
    public static double PRECISION = 0.001;
    public static double findSquareRoot(double n) {
        double l = 0;
        double u = 0;
        int sign = 1;

        if(n>=1) {
            l = 1;
            u = n;
        }
        else if (n>=0 && n < 1) {
            l = n;
            u = 1;
        }
        else if (n<= -1) {
            sign = -1;
            u = n * sign;
            n = n * sign;
            l = 1;
        } else {
            sign = -1;
            u = 1;
            n = n * sign;
            l = n;
        }

        while(l <= u) {
            double m = (l+u)/2;
            if(Math.abs((m * m)- n) < PRECISION)
                return sign * m;
            else if (m*m > n)
                u = m;
            else
                l = m;

        }
        return 0.0;

    }
}
