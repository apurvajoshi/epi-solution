package com.ajoshi.epi.searching;

/**
 * Created by ajoshi on 9/17/15.
 */
public class LocalMinimaSearch {

    /**
     *
     * Given that a[0]>a[1] and a[n-2] < a[n-1],
     * find local minima i such that a[i] < a[i-1]
     * and a[i] < a[i+1]
     *
     * Time Complexity - O(log n)
     *
     * @param a - An unsorted array eg [6,5,4,3,1,4,5]
     * @return
     */
    public static int findLocalMinima(int[] a) {
        int l = 0;
        int u = a[a.length-1];

        while(l <= u) {
            int m = (l + u)/2;
            //Handle the case when m = l or m = u
            if(m == l || m == u)
                return -1;
            if(a[m] < a[m-1] && a[m] < a[m+1]) {
                return a[m];
            } else if (a[m] > a[m+1]) {
                l = m+1;
            } else {
                u = m-1;
            }
        }
        return -1;
    }
}
