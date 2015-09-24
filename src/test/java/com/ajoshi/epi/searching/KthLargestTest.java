package com.ajoshi.epi.searching;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class KthLargestTest {

    @Test
    public void testFindKthLargest() throws Exception {
        int[] a = {3,2,5,6,1,7,4,9};
        System.out.println(Arrays.toString(a));
        int k = 3;
        System.out.println(k + "th largest is " + KthLargest.findKthLargest(a, 0, a.length-1, k));
        k = 2;
        System.out.println(k + "th largest is " + KthLargest.findKthLargest(a, 0, a.length-1, k));
        k = 1;
        System.out.println(k + "th largest is " + KthLargest.findKthLargest(a, 0, a.length-1, k));
        k = 4;
        System.out.println(k + "th largest is " + KthLargest.findKthLargest(a, 0, a.length-1, k));
        k = 5;
        System.out.println(k + "th largest is " + KthLargest.findKthLargest(a, 0, a.length-1, k));
        k = 6;
        System.out.println(k + "th largest is " + KthLargest.findKthLargest(a, 0, a.length-1, k));
        k = 7;
        System.out.println(k + "th largest is " + KthLargest.findKthLargest(a, 0, a.length-1, k));
        k = 8;
        System.out.println(k + "th largest is " + KthLargest.findKthLargest(a, 0, a.length-1, k));
        k = 9;
        System.out.println(k + "th largest is " + KthLargest.findKthLargest(a, 0, a.length-1, k));
        k = 100;
        System.out.println(k + "th largest is " + KthLargest.findKthLargest(a, 0, a.length-1, k));

        int[] b = {10,20,14,1,4,11,15,32,0,5,8,9,31};
        System.out.println(Arrays.toString(b));
        k = 4;
        System.out.println(k + "th largest is " + KthLargest.findKthLargest(b, 0, b.length-1, k));
        k = 3;
        System.out.println(k + "th largest is " + KthLargest.findKthLargest(b, 0, b.length-1, k));
        k = 2;
        System.out.println(k + "th largest is " + KthLargest.findKthLargest(b, 0, b.length-1, k));
        k = 5;
        System.out.println(k + "th largest is " + KthLargest.findKthLargest(b, 0, b.length-1, k));
        k = 1;
        System.out.println(k + "th largest is " + KthLargest.findKthLargest(b, 0, b.length-1, k));
        k = 6;
        System.out.println(k + "th largest is " + KthLargest.findKthLargest(b, 0, b.length-1, k));
        k = 7;
        System.out.println(k + "th largest is " + KthLargest.findKthLargest(b, 0, b.length-1, k));

    }
}