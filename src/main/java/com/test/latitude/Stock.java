package com.test.latitude;


public class Stock 
{
    
	
	public static int getMaxProfit(int[] stockPrices) {
		int minSharePrice = stockPrices[0];
		int maxProfit = 0;
		for(int i = 0; i < stockPrices.length -1 ; i++) {
			minSharePrice = Math.min(minSharePrice, stockPrices[i]);
			maxProfit = Math.max(maxProfit, stockPrices[i+1] - minSharePrice);
			System.out.println("minSharePrice "+ minSharePrice);
			System.out.println("maxProfit "+ maxProfit);
			System.out.println("stockPrices[i+1] "+ stockPrices[i+1]);
		}
		return maxProfit;
	}
}
