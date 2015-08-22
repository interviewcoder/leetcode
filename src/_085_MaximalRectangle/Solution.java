/**
 * Time : O(n^4); Space: O(n^3)
 * @tag : Array; Hash Table; Stack; Dynamic Programming
 * @by  : Steven Cooks
 * @date: Jun 9, 2015
 *************************************************************************
 * Description: 
 * 
 * Given a 2D binary matrix filled with 0's and 1's, find the largest 
 * rectangle containing all ones and return its area.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/maximal-rectangle/ }
 * P.S. : can be improved to O(N^3) using stack, see SolutionStack.java
 * 		'board' dp problem, how to iterate
 */
package _085_MaximalRectangle;

/** see test {@link _085_MaximalRectangle.SolutionTest } */
public class Solution {

    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[][] dp = new boolean[rows][cols];

        int result = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // rectangle starts from (i,j)
                dp[i][j] = matrix[i][j] == '1';
                for (int r = i; r < rows; r++) {
                    // whether zero has shown
                    boolean zero = false;
                    for (int c = j; c < cols; c++) {
                        // rectangle ends at (r, c)
                        dp[r][c] = matrix[r][c] == '1';
                        if (r == i && c == j) {
                            // only one cell
                            if (!dp[r][c]) {
                                // no need to check rest columns and rest rows
                                zero = true;
                                break;
                            }
                            result = Math.max(result, 1);
                        } else if (r == i) {
                            // 1st row
                            dp[r][c] &= dp[r][c - 1];
                        } else if (c == j) {
                            // 1st column
                            dp[r][c] &= dp[r - 1][c];
                        } else {
                            // all 1s in rectangle from (i, j) to (r,c) ?
                            dp[r][c] = dp[r - 1][c] && dp[r][c - 1] && dp[r][c];
                        }

                        if (!dp[r][c]) {
                            // no need to check rest columns
                            break;
                        }
                        int area = (r - i + 1) * (c - j + 1);
                        result = Math.max(result, area);
                    }
                    if (zero) {
                        break;
                    }
                }
            }
        }
        return result;
    }

}
