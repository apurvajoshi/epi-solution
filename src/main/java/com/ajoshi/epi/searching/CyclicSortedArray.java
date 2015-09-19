package com.ajoshi.epi.searching;

/**
 * Created by ajoshi on 9/19/15.
 */
public class CyclicSortedArray {

    public static int findElement(int [] a, int k) {
        int l = 0;
        int u = a.length-1;

        while(l <= u) {
            int m = (l + u)/2;

            if(a[m] == k)
                return m;
            else if(a[l] <= a[m]) {
                if(a[l] <= k && a[m] > k)
                    u = m-1;
                else
                    l = m+1;
            } else {
                if(a[m] < k && a[u] >= k)
                    l = m+1;
                else
                    u = m -1;
            }
        }

        return -1;
    }
}
