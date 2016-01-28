package com.ajoshi.epi.arraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class BuyAndSellStockTest {

    @Test
    public void testMaxProfit() throws Exception {
        int[] values = {310,315,275,295,260,270,290,230,255,250};
        assertEquals(BuyAndSellStock.maxProfit(values),30);

        int[] values2 = {7,3,4,1,9,10,2,6,8,9,3,4,5,8,7,1};
        assertEquals(BuyAndSellStock.maxProfit(values2), 9);
    }
}