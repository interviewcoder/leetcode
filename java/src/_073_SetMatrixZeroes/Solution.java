/**
 * Time : O(N^2); Space: O(1)
 * @tag : Array
 * @by  : Steven Cooks
 * @date: Jun 6, 2015
 *************************************************************************
 * Description:
 * 
 * Given a m x n matrix, if an element is 0, set its entire row and column 
 * to 0. Do it in place. 
 * 
 * Follow up: 
 * Could you devise a constant space solution?
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/set-matrix-zeroes/ }
 * P.S. : use input space to achieve O(1) space
 */
package _073_SetMatrixZeroes;

/** see test {@link _073_SetMatrixZeroes.SolutionTest } */
public class Solution {

    public void setZeroes(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int wasteRow = -1;
        int wasteCol = -1;
        // find '0' in matrix and label them in "waste" line and column
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    if (wasteRow == -1) {
                        // first time to find 0
                        wasteRow = i;
                        wasteCol = j;
                    } else {
                        // label in waste row and column
                        matrix[wasteRow][j] = 0;
                        matrix[i][wasteCol] = 0;
                    }
                }
            }
        }
        if (wasteRow == -1) {
            return;
        }
        // set zeroes based on label
        for (int col = 0; col < n; col++) {
            if (matrix[wasteRow][col] == 0) {
                // set zeroes on columns except waste columns
                // we need that information for later use
                if (col != wasteCol) {
                    for (int row = 0; row < m; row++) {
                        matrix[row][col] = 0;
                    }
                }
            }
        }
        for (int row = 0; row < m; row++) {
            if (matrix[row][wasteCol] == 0) {
                // set zeroes in the row
                for (int col = 0; col < n; col++) {
                    matrix[row][col] = 0;
                }
            } else {
                // clean this column
                matrix[row][wasteCol] = 0;
            }
        }

    }

}
