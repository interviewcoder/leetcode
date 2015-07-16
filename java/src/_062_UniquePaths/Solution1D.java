/**
 * Time : O(m*n); Space: O(m*n)
 * @tag : Array; Dynamic Programming
 * @by  : Steven Cooks
 * @date: Jun 4, 2015
 *************************************************************************
 * Description: 
 * 
 * A robot is located at the top-left corner of a m x n grid (marked 
 * 'Start' in the diagram below). 
 * 
 * The robot can only move either down or right at any point in time. The 
 * robot is trying to reach the bottom-right corner of the grid (marked 
 * 'Finish' in the diagram below). 
 * 
 * How many possible unique paths are there?
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/unique-paths/ }
 * P.S. : use 1D array to store dp results
 */
package _062_UniquePaths;

/** see test {@link _062_UniquePaths.Solution1DTest } */
public class Solution1D {

    public int uniquePaths(int m, int n) {
        if (m <= 0 || n <= 0) {
            return 0;
        }
        int[] dp = new int[n];
        dp[0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    // the leftmost column, only one way to reach
                    dp[j] = 1;
                } else {
                    // cell[i][j] can be reached from
                    // cell[i-1][j] and cell[i][j-1]
                    dp[j] = dp[j] + dp[j - 1];
                }
            }
        }

        return dp[n - 1];
    }

}
