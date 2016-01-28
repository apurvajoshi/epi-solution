package com.ajoshi.epi.stackAndQueue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    public Stack<Integer> stack;

    @Before
    public void initStack() throws Exception {
        stack = new Stack<Integer>();
        stack.push(2);
        stack.push(1);
        stack.push(4);
        stack.push(0);
        stack.push(7);
        stack.push(3);
        stack.push(11);
    }

    @Test
    public void testPush() throws Exception {
       stack.push(6);
       stack.print();
        assertEquals(stack.pop().intValue(), 6);
    }

    @Test
    public void testPop() throws Exception {
        assertEquals(stack.pop().intValue(), 11);
        assertEquals(stack.pop().intValue(), 3);
        assertEquals(stack.pop().intValue(), 7);
        assertEquals(stack.pop().intValue(), 0);
        assertEquals(stack.pop().intValue(), 4);
        assertEquals(stack.pop().intValue(), 1);
        assertEquals(stack.pop().intValue(), 2);
        assertEquals(stack.pop(), null);

    }

    @Test
    public void testPeek() throws Exception {
        assertEquals(stack.peek().intValue(), 11);
        stack.pop();
        assertEquals(stack.peek().intValue(), 3);
        stack.push(40);
        assertEquals(stack.peek().intValue(), 40);
    }

    @Test
    public void testIsEmpty() throws Exception {
        assertEquals(stack.isEmpty(), false);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        assertEquals(stack.isEmpty(), true);

    }

    @Test
    public void testMax() throws Exception {
        assertEquals(stack.max().intValue(), 11);
        stack.pop();
        assertEquals(stack.max().intValue(), 7);
        stack.pop();
        assertEquals(stack.max().intValue(), 7);
        stack.pop();
        assertEquals(stack.max().intValue(), 4);
        stack.pop();
        assertEquals(stack.max().intValue(), 4);
        stack.pop();
        assertEquals(stack.max().intValue(), 2);
        stack.pop();
        assertEquals(stack.max().intValue(), 2);
        stack.pop();
        assertEquals(stack.max(), null);


        stack.push(4);
        assertEquals(stack.max().intValue(), 4);
        stack.push(3);
        assertEquals(stack.max().intValue(), 4);
        stack.push(2);
        assertEquals(stack.max().intValue(), 4);
        stack.push(1);
        assertEquals(stack.max().intValue(), 4);
        stack.push(7);
        assertEquals(stack.max().intValue(), 7);
        stack.push(6);
        assertEquals(stack.max().intValue(), 7);
        stack.push(5);
        assertEquals(stack.max().intValue(), 7);
        stack.push(10);
        assertEquals(stack.max().intValue(), 10);
        stack.print();

    }

}