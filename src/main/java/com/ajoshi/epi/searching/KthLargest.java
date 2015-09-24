package com.ajoshi.epi.searching;

/**
 * Created by ajoshi on 9/23/15.
 */
public class KthLargest {

    /**
     *
     * Time Complexity - O(n)
     *
     * @param a - array
     * @param l - low index
     * @param h - high index
     * @param k - kth largest
     * @return - kth largest element
     */
    public static int findKthLargest(int[] a, int l, int h, int k) {
        if(k < 1 || k > a.length)
            return 0;

        int p = partition(a, l, h);
        if(p == (a.length - k))
            return a[p];
        else if (p > (a.length - k))
            return findKthLargest(a, l, p-1,k);
        else
            return findKthLargest(a, p+1, h, k);

    }

    private static int partition(int[] a, int l, int h) {
        int firstHigh = l+1;
        for(int i = l+1; i <= h; i++) {
            if(a[i] < a[l]) {
                swap(a,i,firstHigh);
                firstHigh++;
            }
        }
        swap(a,l,firstHigh-1);
        return firstHigh-1;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
