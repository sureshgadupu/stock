package com.test.latitude;

import static org.junit.Assert.assertEquals;

import org.junit.Test;




public class StockTest {
	
	
	@Test
	public void test_getMaxProfitWithRandomPrices() {
		int[] stockPrices = {1,2,3,4,5,6,7,8,9,10};
		assertEquals(9, Stock.getMaxProfit(stockPrices));
	}
	
	@Test
	public void test_getMaxProfitWithRandomPrices2() {
		int[] stockPrices = {2,3,10,4,5,1, 6,7,8,9};
		assertEquals(8, Stock.getMaxProfit(stockPrices));
	}
   
}
