/**
 * Time : O() ; Space: O()
 * @tag : Dynamic Programming
 * @by  : Steven Cooks
 * @date: Sep 30, 2015
 ***************************************************************************
 * Description:
 * 
 * Say you have an array for which the ith element is the price of a given stock on day i. 
 * 
 * Design an algorithm to find the maximum profit. You may complete at most k transactions. 
 * 
 * Note: You may not engage in multiple transactions at the same time 
 * (ie, you must sell the stock before you buy again).
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/ }
 * @reference {@link https://leetcode.com/discuss/15153/a-clean-dp-solution-which-generalizes-to-k-transactions }
 */
package _188_BestTimeToBuyAndSellStockIV;

/** see test {@link _188_BestTimeToBuyAndSellStockIV.SolutionTest } */
public class Solution {
    
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int[][] f = new int[k + 1][n];
        for (int i = 0; i < k; i++) {
            int tmpMax = f[k - 1][0] - prices[0];
            for (int j = 1; j < n; j++) {
                f[i][j] = Math.max(f[i][j - 1], prices[j] + tmpMax);
                tmpMax = Math.max(tmpMax, f[i - 1][j] - prices[j]);
            }
        }
        return k;
    }

}
