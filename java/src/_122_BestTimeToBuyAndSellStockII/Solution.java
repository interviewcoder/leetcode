/**
 * Time : O(); Space: O()
 * @tag : Array; Greedy
 * @by  : Steven Cooks
 * @date: Jun 14, 2015
 *************************************************************************
 **  Say you have an array for which the ith element is the price of     *
 **  a given stock on day i.                                             *
 **                                                                      *
 **  Design an algorithm to find the maximum profit. You may complete as * 
 *  many transactions as you like (ie, buy one and sell one share of the *
 *  stock multiple times). However, you may not engage in multiple       *
 *  transactions at the same time (ie, you must sell the stock before    *
 *   you buy again).                                                     *
 *************************************************************************
 * {@link https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/ }
 */
package _122_BestTimeToBuyAndSellStockII;

/** see test {@link _122_BestTimeToBuyAndSellStockII.SolutionTest } */
public class Solution {

    public int maxProfit(int[] prices) {
        int result = 0;
        int lastPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            result += price > lastPrice ? (price - lastPrice) : 0;
            lastPrice = price;
        }
        return result;
    }

}
