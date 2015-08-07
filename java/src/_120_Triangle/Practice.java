/**
 * Time : O(); Space: O()
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
public class Practice {

    public int minimumTotal(List<List<Integer>> a) {
        if (a.size() == 0 || a.get(0).size() == 0) {
            return 0;
        }
        int rows = a.size();
        int cols = a.get(rows - 1).size();
        int[] dp = new int[cols + 1];
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = 0; j < a.get(i).size(); j++) {
                dp[j] = a.get(i).get(j) + Math.min(dp[j], dp[j + 1]);
            }
        }
        return dp[0];
    }

}
