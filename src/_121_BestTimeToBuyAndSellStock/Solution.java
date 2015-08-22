/**
 * Time : O(N); Space: O(1)
 * @tag : Array; Dynamic Programming
 * @by  : Steven Cooks
 * @date: Jun 14, 2015
 *****************************************************************************
 * Description: 
 * 
 * Say you have an array for which the ith element is the price           
 * of a given stock on day i.                                             
 *                                                                        
 * If you were only permitted to complete at most one transaction         
 * (ie, buy one and sell one share of the stock), design an algorithm     
 * to find the maximum profit.                                            
 * 
 *****************************************************************************
 * {@link https://leetcode.com/problems/best-time-to-buy-and-sell-stock/ }
 */
package _121_BestTimeToBuyAndSellStock;

/** see test {@link _121_BestTimeToBuyAndSellStock.SolutionTest } */
public class Solution {

    public int maxProfit(int[] prices) {
        int result = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            // sell stock at current price
            // find the minimum price before this way
            minPrice = Math.min(minPrice, price);

            // profit = minPrice < price ? (price - minPrice) : 0;
//            profit = Math.max(price - minPrice, 0);

            result = Math.max(result, price - minPrice);
        }
        return result;
    }

}
