/**
 * Time : O(m*n); Space: O(n)
 * @tag : Array; Dynamic Programming
 * @by  : Steven Cooks
 * @date: Jun 4, 2015
 *************************************************************************
 * Description: 
 * 
 * Follow up for "Unique Paths": 
 * Now consider if some obstacles are added to the grids. How many unique 
 * paths would there be? 
 * An obstacle and empty space is marked as 1 and 0 respectively in the grid. 
 * 
 * For example, 
 * There is one obstacle in the middle of a 3x3 grid as illustrated below. 
 * [ 
 *  [0,0,0], 
 *  [0,1,0], 
 *  [0,0,0] 
 * ] 
 * The total number of unique paths is 2.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/unique-paths-ii/ }
 * P.S. : corner case in the leftmost column
 */
package _063_UniquePathsII;

/** see test {@link _063_UniquePathsII.SolutionTest } */
public class Solution {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        if (m == 0 || obstacleGrid[0].length == 0) {
            return 0;
        }
        int n = obstacleGrid[0].length;
        int[] dp = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    // 1 means obstacle, so way to reach here
                    dp[j] = 0;
                } else if (j == 0) {
                    // the cell in leftmost column
                    // if 0 way to reach cell[i-1][0],
                    // then 0 way to reach cell[i][0]
                    dp[j] = (i > 0 && dp[j] == 0) ? 0 : 1;
                } else {
                    dp[j] = dp[j - 1] + dp[j];
                }
            }
        }
        return dp[n - 1];
    }

}
