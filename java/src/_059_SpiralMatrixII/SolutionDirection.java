/**
 * Time : O(); Space: O()
 * @Tag : Array
 * @Date: Jul 4, 2015
 *************************************************************************
 * Description: 
 * 
 * Given an integer n, generate a square matrix filled with elements 
 * from 1 to n2 in spiral order. 
 * 
 * For example, 
 * 
 * Given n = 3, You should return the following matrix: 
 * [ 
 *  [ 1, 2, 3 ], 
 *  [ 8, 9, 4 ], 
 *  [ 7, 6, 5 ]
 * ]
 *************************************************************************
 * {@link https://leetcode.com/problems/spiral-matrix-ii/ }
 */
package _059_SpiralMatrixII;

/** see test {@link _059_SpiralMatrixII.SolutionDirectionTest} */
public class SolutionDirection {

    public int[][] generateMatrix(int n) {
        if (n <= 0) {
            return new int[0][0];
        }
        int[][] matrix = new int[n][n];
        int i = 0;
        int j = 0;
        int k = 1;
        int end = n * n;
        int dir = 0;
        while (k <= end) {
            matrix[i][j] = k++;
            if (dir == 0) {
                j++;  // move right in the same row
                if (j == n || matrix[i][j] != 0) {
                    // change direction change 'x' from right of '1' to below  of '1'
                    //  1  x  =>  1 
                    //            x
                    dir = 1;
                    j--;
                    i++;
                }
            } else if (dir == 1) {
                i++;   // move downwards
                if (i == n || matrix[i][j] != 0) {
                    dir = 2;
                    i--;
                    j--;
                }
            } else if (dir == 2) {
                j--;
                if (j < 0 || matrix[i][j] != 0) {
                    dir = 3;
                    j++;
                    i--;
                }
            } else {
                i--;
                if (i < 0 || matrix[i][j] != 0) {
                    dir = 0;
                    i++;
                    j++;
                }
            }
        }
        return matrix;
    }

}
