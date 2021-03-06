package collection2;

/*
 * Say you have an array for which the ith element is the price of a given 
 * stock on day i.

Design an algorithm to find the maximum profit. You may complete as many 
transactions as you like (ie, buy one and sell one share of the stock
 multiple times). However, you may not engage in multiple transactions at
  the same time (ie, you must sell the stock before you buy again).
  
 */
public class BestStock {

	public static int maxProfit(int[] prices) {
		if(prices==null||prices.length ==0){
			return 0;
		}
		int min = prices[0];
		int max = 0;
		for(int i = 0;i<prices.length;i++){
			min = Math.min(min, prices[i]);
			max = Math.max(max,prices[i]-min);
		}
		return max;
    }
	public static void main(String[] args) {
		int[] arr = {7,2,4,1};
		System.out.println(maxProfit(arr));
	}

}
