/**
 * Time : O(); Space: O()
 * @tag : Array; Dynamic Programming
 * @by  : Steven Cooks
 * @date: Jun 16, 2015
 ***********************************************************************
 *  Say you have an array for which the ith element is the price of    *
 *  a given stock on day i.                                            *
 *  Design an algorithm to find the maximum profit.                    *
 *  You may complete at most two transactions.                         *
 *  
 *  Note:                                                              *
 *  You may not engage in multiple transactions at the same time       *
 *  (ie, you must sell the stock before you buy again).                *
 ***********************************************************************
 * {@link https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/ }
 */
package _123_BestTimeToBuyAndSellStockIII;

/** see test {@link _123_BestTimeToBuyAndSellStockIII.SolutionTest } */
public class Solution {

    /** {@reference https://leetcode.com/discuss/18330/is-it-best-solution-with-o-n-o-1 } */
    public int maxProfit(int[] prices) {
        int hold1 = Integer.MIN_VALUE;
        int hold2 = Integer.MIN_VALUE;
        int release1 = 0;
        int release2 = 0;
        for (int price : prices) {
            release2 = Math.max(release2, hold2 + price);
            hold2 = Math.max(hold2, release1 - price);
            release1 = Math.max(release1, hold1 + price);
            hold1 = Math.max(hold1, -price);
        }
        return release2;
    }

}
