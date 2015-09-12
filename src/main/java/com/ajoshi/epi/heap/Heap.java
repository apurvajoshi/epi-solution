package com.ajoshi.epi.heap;

import java.util.ArrayList;
import java.util.Comparator;


/**
 * Created by ajoshi on 8/28/15.
 */
public class Heap<T extends Comparable> {

    private static class DefaultComparator implements  Comparator {

        public int compare(Object o1, Object o2) {
            return ((Comparable)o1).compareTo(o2);
        }
    }

    private ArrayList<T> elements = new ArrayList<T>();
    private Comparator<T> comp = new DefaultComparator();


    public Heap() {

    }

    public Heap(Comparator<T> comp) {
        this.comp = comp;
    }

    public T peek() {
        if(elements.size()<1) {
            System.out.println("Heap is empty");
            return null;
        }
        return elements.get(0);
    }

    public int getSize() {
        return this.elements.size();
    }

    public ArrayList<T> getAllElements() {
        return this.elements;
    }

    public void print() {
        System.out.println("Printing heap");
        int prev = 0;
        int index = 0;
        for(int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");
            if(i == 0 || i == prev + Math.pow(2,index)) {
                prev = i;
                index++;
                System.out.println();
            }
        }
        System.out.println();
    }

    public int insert(T element) {
        if(element == null)
            return -1;

        elements.add(element);
        bubbleUp(elements.size()-1);
        return 0;
    }

    public T remove() {
        if(elements.size() < 1)
            return null;

        if(elements.size() == 1)
            return elements.remove(0);

        T result = elements.get(0);
        T temp = elements.remove(elements.size()-1);
        elements.set(0, temp);
        bubbleDown(0);
        return result;
    }

    private void bubbleDown(int index) {
        int youngChildIndex = getYoungerChildIndex(index);
        int elderChildIndex = getElderChildIndex(index);
        int minChildIndex = index;

        while(elderChildIndex != -1) {
            T youngChild = elements.get(youngChildIndex);
            T elderChild = elements.get(elderChildIndex);
            if (comp.compare(youngChild,elderChild)> 0)
                minChildIndex = elderChildIndex;
            else
                minChildIndex = youngChildIndex;

            if(comp.compare(elements.get(index),elements.get(minChildIndex)) > 0)
                swap(index, minChildIndex);
            else {
                return;
            }

            index = minChildIndex;
            youngChildIndex = getYoungerChildIndex(index);
            elderChildIndex = getElderChildIndex(index);
        }
        if(youngChildIndex != -1 &&
                comp.compare(elements.get(minChildIndex),elements.get(youngChildIndex)) > 0 )
            swap(minChildIndex, youngChildIndex);
    }

    private void bubbleUp(int index) {
        int parentIndex = getParentIndex(index);
        while( parentIndex != -1 &&
                comp.compare(elements.get(parentIndex),elements.get(index)) > 0){
            swap(parentIndex, index);
            index = parentIndex;
            parentIndex = getParentIndex(index);
        }
    }


    private void swap(int index1, int index2) {
        T temp1 = elements.set(index1, elements.get(index2));
        elements.set(index2, temp1);
    }

    private int getYoungerChildIndex(int index) {
        if(2*index + 1 < elements.size())
            return index*2 + 1;
        else
            return -1;
    }

    private int getElderChildIndex(int index) {
        if(2*index + 2 < elements.size())
            return index*2 + 2;
        else
            return -1;
    }

    private int getParentIndex(int index) {
        if((index-1) >= 0)
            return (index-1)/2;
        else
            return -1;
    }
}
