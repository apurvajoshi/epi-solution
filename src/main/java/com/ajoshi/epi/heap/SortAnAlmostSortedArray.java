package com.ajoshi.epi.heap;

/**
 * Created by ajoshi on 9/11/15.
 */
public class SortAnAlmostSortedArray {

    public static int[] sortArray(int [] a, int k) {
        Heap<Integer> h = new Heap<Integer>();
        int[] result = new int[a.length];
        int j = 0;

        for(int i = 0; i < a.length; i++) {
            if (h.getSize() >= k) {
                result[j] = h.remove();
                j++;
            }
            h.insert(a[i]);
        }

        while(h.getSize()!=0) {
            result[j] = h.remove();
            j++;
        }
        return result;
    }

}
