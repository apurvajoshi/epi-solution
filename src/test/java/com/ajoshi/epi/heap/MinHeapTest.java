package com.ajoshi.epi.heap;
import org.junit.Ignore;
import org.junit.Test;

public class MinHeapTest {

    @Ignore
    public void testInsert() throws Exception {
        System.out.println("\n\ntestInsert");
        Heap<Integer> minHeap = new Heap<Integer>();
        minHeap.insert(40);
        minHeap.print();
        minHeap.insert(17);
        minHeap.print();
        minHeap.insert(16);
        minHeap.print();
        minHeap.insert(15);
        minHeap.print();
        minHeap.insert(12);
        minHeap.print();
        minHeap.insert(10);
        minHeap.print();
        minHeap.insert(11);
        minHeap.print();
        minHeap.insert(8);
        minHeap.print();
        minHeap.insert(9);
        minHeap.print();
        minHeap.insert(7);
        minHeap.print();

    }

    @Test
     public void testRemove() throws Exception {
        System.out.println("\n\ntestRemove");
        Heap<Integer> minHeap = new Heap<Integer>();
        minHeap.insert(7);
        //minHeap.print();
        minHeap.insert(9);
        //minHeap.print();
        minHeap.insert(8);
        //minHeap.print();
        minHeap.insert(11);
        //minHeap.print();
        minHeap.insert(10);
        //minHeap.print();
        minHeap.insert(12);
        //minHeap.print();
        minHeap.insert(15);
        //minHeap.print();
        minHeap.insert(16);
        //minHeap.print();
        minHeap.insert(17);
        //minHeap.print();
        minHeap.insert(40);
        //minHeap.print();
        minHeap.insert(3);
        minHeap.print();

        System.out.println("Removing element " + minHeap.remove());
        minHeap.print();
        System.out.println("Removing element " + minHeap.remove());
        minHeap.print();
        System.out.println("Removing element " + minHeap.remove());
        minHeap.print();
        System.out.println("Removing element " + minHeap.remove());
        minHeap.print();
        System.out.println("Removing element " + minHeap.remove());
        minHeap.print();
        System.out.println("Removing element " + minHeap.remove());
        minHeap.print();
        System.out.println("Removing element " + minHeap.remove());
        minHeap.print();
        System.out.println("Removing element " + minHeap.remove());
        minHeap.print();
        System.out.println("Removing element " + minHeap.remove());
        minHeap.print();
        System.out.println("Removing element " + minHeap.remove());
        minHeap.print();
        System.out.println("Removing element " + minHeap.remove());
        minHeap.print();
        System.out.println("Removing element " + minHeap.remove());
        minHeap.print();
        System.out.println("Removing element " + minHeap.remove());
        minHeap.print();
    }


    @Ignore
    public void testMinHeap() throws Exception {
        Heap<Integer> minheap = new Heap<Integer>();
        minheap.insert(9);
        minheap.print();
        System.out.println("Peek = " + minheap.peek());
        minheap.insert(8);
        minheap.print();
        System.out.println("Peek = " + minheap.peek());
        minheap.insert(2);
        minheap.print();
        System.out.println("Peek = " + minheap.peek());
        minheap.insert(7);
        minheap.print();
        System.out.println("Peek = " + minheap.peek());

        System.out.println("Remove = " + minheap.remove());
        minheap.print();
        System.out.println("Remove = " + minheap.remove());
        minheap.print();
        System.out.println("Remove = " + minheap.remove());
        minheap.print();
        System.out.println("Remove = " + minheap.remove());
        minheap.print();
        System.out.println("Remove = " + minheap.remove());
        minheap.print();
        System.out.println("Remove = " + minheap.remove());
        minheap.print();
        System.out.println("Remove = " + minheap.remove());

    }


    @Ignore
    public void testRemovingElement() {
        Heap<Integer> minHeap = new Heap<Integer>();
        minHeap.insert(9);
        minHeap.insert(8);
        minHeap.insert(7);
        minHeap.print();
        System.out.println("Removing element " + minHeap.remove());
        minHeap.print();

    }
}