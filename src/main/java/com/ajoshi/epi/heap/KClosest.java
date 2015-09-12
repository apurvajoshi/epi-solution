package com.ajoshi.epi.heap;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by ajoshi on 9/2/15.
 */
public class KClosest {

    public static ArrayList<Integer> findKClosestValues(int[] a, int k) {

        Heap<Integer> maxHeap = new Heap<Integer>(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        for(int i = 0; i < a.length; i++) {
            if(maxHeap.getSize() < k) {
                maxHeap.insert(a[i]);
            }
            else {
                if(a[i] < maxHeap.peek()) {
                    maxHeap.insert(a[i]);
                    maxHeap.remove();
                }
            }
        }
        return maxHeap.getAllElements();
    }

}
