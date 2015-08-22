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
 */
package _062_UniquePaths;

/** see test {@link _062_UniquePaths.SolutionTest } */
public class Solution {

    public int uniquePaths(int m, int n) {
        if (m <= 0 || n <= 0) {
            return 0;
        }
        // syntax sugar: 0 is default value
        int[][] paths = new int[m + 1][n + 1];

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (i == 1 && j == 1) {
                    // starting point
                    paths[i][j] = 1;
                } else {
                    paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
                }
            }
        }

        return paths[m][n];
    }

}
