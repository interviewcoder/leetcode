/**
 * Time : O(N*M); Space: O(N)
 * @tag : Array; Dynamic Programming
 * @by  : Steven Cooks
 * @date: Jun 14, 2015
 *************************************************************************
 * Description:
 * 
 * Given a triangle, find the minimum path sum from top to bottom. Each 
 * step you may move to adjacent numbers on the row below. 
 * 
 * For example, given the following triangle 
 * [    [2], 
 *     [3,4], 
 *    [6,5,7], 
 *   [4,1,8,3] ] 
 * The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11). 
 * Note: 
 * Bonus point if you are able to do this using only O(n) extra space, 
 * where n is the total number of rows in the triangle.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/triangle/ }
 */
package _120_Triangle;

import java.util.List;

/** see test {@link _120_Triangle.SolutionTest } */
public class Solution2 {

    public int minimumTotal(List<List<Integer>> t) {
        int rows = t.size();
        if (rows == 0) {
            return 0;
        }
        int[] dp = new int[rows + 1];
        int result = 0;
        
        for (int i = 1; i <= rows; i++) {
            int cols = t.get(i - 1).size();
            int res = Integer.MAX_VALUE;
            for (int j = cols; j >= 1; j--) {
                if (j == cols) {
                    dp[j] = t.get(i - 1).get(j - 1) + dp[j - 1];
                } else if (j == 1) {
                    dp[j] = t.get(i - 1).get(j - 1) + dp[j];
                } else {
                    dp[j] = t.get(i - 1).get(j - 1) + Math.min(dp[j - 1], dp[j]);
                }
                res = Math.min(res, dp[j]);
            }
            result = res;
        }
        return result;
    }

}
