package com.java;

public class BuySellStock 
{
public static int maxProfit(int[] prices)
{
	int maxProfit = 0;
	int minPrice = Integer.MAX_VALUE;  //CP
	for (int i =0; i<prices.length; i++)
	{
		minPrice = Math.min(minPrice, prices[i]); // 678 , 6 - > 6
		maxProfit = Math.max(maxProfit, prices[i]-minPrice); //--> profit
		
	}
	//min min, curr
	//max max, curr - min
	
	return maxProfit;
}
public static void main(String[] args)
{
	int prices[] = {6,2,5,3};
	System.out.println("Profit " +maxProfit(prices));
}
}
