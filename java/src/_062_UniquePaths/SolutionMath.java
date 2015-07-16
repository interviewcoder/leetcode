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

/** see test {@link _062_UniquePaths.SolutionMathTest } */
public class SolutionMath {
    /**
     * Combination(m-1, n + m - 2), to reach goal, move (n + m -2) steps in
     * total and (m - 1) steps downwards and (n-1) towards right including
     */
    public int uniquePaths(int m, int n) {
        double result = 1;
        for (int i = 1; i < n; i++) {
            result *= ((double) (m + i - 1) / (double) i);
        }
        return (int) Math.round(result);
    }
}
