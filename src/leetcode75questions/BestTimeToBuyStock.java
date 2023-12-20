package leetcode75questions;

//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
//Example 1:
//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

public class BestTimeToBuyStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(BestTimeToBuyStock.maxProfit(prices));

    }

    public static int maxProfit(int[] prices) {
        int least = Integer.MAX_VALUE; //least so far
        int overallProfit = 0; //overall profit
        int profitIfSoldToday = 0; //profit if sold today
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < least) { // if we found new buy value which is more smaller then previous one
                least = prices[i]; // update our least so far
            }
            profitIfSoldToday = prices[i] - least; // calculating profit if sold today by, Buy - sell
            if (overallProfit < profitIfSoldToday) { // if pist is more then our previous overall profit
                overallProfit = profitIfSoldToday; // update overall profit
            }
        }
        return overallProfit;

    }
}
