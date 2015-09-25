/**
 * Time : O(m * n) ; Space: O(m * n)
 * @tag : Dynamic Programming
 * @by  : Steven Cooks
 * @date: Sep 24, 2015
 ***************************************************************************
 * Description:
 * 
 * Given a 2D binary matrix filled with 0's and 1's, find the largest square 
 * containing all 1's and return its area. 
 * 
 * For example, given the following matrix: 
 *  1 0 1 0 0 
 *  1 0 1 1 1 
 *  1 1 1 1 1 
 *  1 0 0 1 0 
 *  
 * Return 4.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/maximal-square/ }
 */
package _221_MaximalSquare;

/** see test {@link _221_MaximalSquare.SolutionTest } */
public class Solution {

    public int maximalSquare(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int res = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        // f[i][j] = min(number of continuous 1s along x-direction from (i,k),
        // number of continuous 1s along y-direction)
        int[][] f = new int[rows + 1][cols + 1];
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 0; j--) {
                if (matrix[i][j] == '1') {
                    f[i][j] = 1 + Math.min(f[i + 1][j + 1], Math.min(f[i][j + 1], f[i + 1][j]));
                    res = Math.max(res, f[i][j]);
                }
            }
        }
        return res * res;
    }

    public int maximalSquare2(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int res = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] x = new int[rows + 1][cols + 1]; // how many continuous 1s along
                                                 // row i from column j
        int[][] y = new int[rows + 1][cols + 1]; // how many continuous 1s from
                                                 // (i,j) along direction to
                                                 // bottom
        int[][] f = new int[rows + 1][cols + 1];
        for (int i = rows; i >= 0; i--) {
            for (int j = cols; j >= 0; j--) {
                int area = 0;
                if (i == rows && j == cols) {
                    area = 0;
                } else if (i == rows) {
                    area = 0;
                } else if (j == cols) {
                    area = 0;
                } else {
                    if (matrix[i][j] == '1') {
                        int len = (int) Math.min(Math.sqrt(f[i + 1][j + 1]),
                                Math.min(x[i][j + 1], y[i + 1][j]));
                        area = (len + 1) * (len + 1);
                        x[i][j] = 1 + x[i][j + 1];
                        y[i][j] = 1 + y[i + 1][j];
                    }
                }
                res = Math.max(res, area);
                f[i][j] = area;
            }
        }
        return res;
    }

}
