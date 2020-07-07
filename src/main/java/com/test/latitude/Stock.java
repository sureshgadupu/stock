package com.test.latitude;


public class Stock 
{
    
	
	public static int getMaxProfit(int[] stockPrices) {
		
		int maxProfit = 0; // consider initial maxprofit as 0 and we will return 0 when thre is no profit to be made 
		int minSharePrice = stockPrices[0]; // lets consider first element of array as minimum share price
		
		for(int i = 1; i< stockPrices.length ; i++) {	
			
			maxProfit = Math.max(maxProfit, stockPrices[i] - minSharePrice); // keep track  of max difference	
			
			minSharePrice = Math.min(stockPrices[i], minSharePrice); // keep track  of min share price
						
			
			
		}
		
		return maxProfit;
	}
}
