/**
 * Time : O(N^2); Space: O(N)
 * @tag : Array; Dynamic Programming
 * @by  : Steven Cooks
 * @date: Jun 4, 2015
 *************************************************************************
 * Description: 
 * 
 * Given a m x n grid filled with non-negative numbers, find a path from top 
 * left to bottom right which minimizes the sum of all numbers along its path. 
 * 
 * Note: You can only move either down or right at any point in time.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/minimum-path-sum/ }
 * P.S. : min weighted path; avoid index out of bound
 */
package _064_MinimumPathSum;

/** see test {@link _064_MinimumPathSum.SolutionTest } */
public class Solution {
    /*
     * For each cell in grid, it can be reached either from the upper cell or
     * the cell to its left. Choose the one that has minimum sum from them.
     */
    public int minPathSum(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int[] dp = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    // 1st column in grid, can only be reached from upper cell
                    dp[j] = dp[j] + grid[i][j];
                } else if (i == 0) {
                    // 1st row in grid, can only be reached from cell to its
                    // left
                    dp[j] = dp[j - 1] + grid[i][j];
                } else {
                    dp[j] = grid[i][j] + Math.min(dp[j - 1], dp[j]);
                }
            }
        }
        return dp[n - 1];
    }

}
