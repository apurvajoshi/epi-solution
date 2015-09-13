package com.ajoshi.epi.heap;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by ajoshi on 9/11/15.
 */
public class RunningMedian {

    public static double[] calculateRunningMedian(int[] inputStream) {

        double[] result = new double[inputStream.length];
        Heap<Integer> minHeap = new Heap<Integer>();
        Heap<Integer> maxHeap = new Heap<Integer>(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });


        if(inputStream.length == 0)
            return result;
        else {
            maxHeap.insert(inputStream[0]);
            result[0] = inputStream[0];
        }

        for(int i = 1; i < inputStream.length; i++) {
            if(inputStream[i] > maxHeap.peek())
                minHeap.insert(inputStream[i]);
            else
                maxHeap.insert(inputStream[i]);

            // Move elements from maxHeap to minHeap
            if(maxHeap.getSize() - minHeap.getSize() > 1) {
                minHeap.insert(maxHeap.remove());
            }

            // Move elements from minHeap to maxHeap
            if(minHeap.getSize() - maxHeap.getSize() > 1) {
                maxHeap.insert(minHeap.remove());
            }

            if(minHeap.getSize() == maxHeap.getSize()) {
                result[i] = (double)(minHeap.peek() + maxHeap.peek())/2;
            } else if (maxHeap.getSize() - minHeap.getSize() == 1) {
                result[i] = maxHeap.peek();
            } else if (minHeap.getSize() - maxHeap.getSize() == 1) {
                result[i] = minHeap.peek();
            }
        }

        System.out.println("Running median is = " + Arrays.toString(result));
        return result;
    }
}
