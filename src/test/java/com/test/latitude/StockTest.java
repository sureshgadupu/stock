package com.test.latitude;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.test.latitude.Stock;




public class StockTest {
	
	
	@Test
	public void test_getMaxProfitsWithRandomPrices() {
		int[] stockprices = {10, 7, 5, 8, 11, 9}; 
		assertEquals(6, Stock.getMaxProfit(stockprices));
	}
	
	@Test
	public void test_getMaxProfitsWithRandomPrices3() {
		int[] stockprices = {10,5,20,56,98,34,56,9,34,12,99,44};
		assertEquals(94, Stock.getMaxProfit(stockprices));
	}
	
	@Test
	public void test_getMaxProfitsWithRandomPrices2() {
		int[] stockprices = {2,4,5,10,6,11}; 
		assertEquals(9, Stock.getMaxProfit(stockprices));
	}
	@Test
	public void test_getMaxProfitsWithRandomPrices4() {
		int[] stockprices = {123,92,47,100,245,345}; 
		assertEquals(298, Stock.getMaxProfit(stockprices));
	}
	
	@Test
	public void test_getMaxProfitsWithHighLowPriceInMiddle() {
		int[] stockprices = {10,2,6,9,14,9,5}; 
		assertEquals(12, Stock.getMaxProfit(stockprices));
	}
	
	
	@Test
	public void test_getMaxProfitsWithConstantPrice() {
		int[] stockprices = {5,5,5,5,5,5};
		assertEquals(0, Stock.getMaxProfit(stockprices));
	}
	
	@Test
	public void test_getMaxProfitsWithConstDecreaseInPrices() {
		int[] stockprices = {10,9,8,7,6,5,4};
		assertEquals(0, Stock.getMaxProfit(stockprices));
	}
	
	@Test
	public void test_getMaxProfitsWithConstIncreaseInPrices() {
		int[] stockprices = {5,7,9,11,23,30};
		assertEquals(25, Stock.getMaxProfit(stockprices));
	}
	
	
   
}
