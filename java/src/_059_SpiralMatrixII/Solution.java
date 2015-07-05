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
 * P.S. : middle row: (n - 1) / 2
 */
package _059_SpiralMatrixII;

/** 
 * see also another solution {@link _059_SpiralMatrixII.SolutionDirection }
 * see test {@link _059_SpiralMatrixII.SolutionTest } */
public class Solution {

    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        if (n <= 0) {
            return result;
        }
        int number = 1;
        for (int i = 0; i < (n + 1) / 2; i++) {
            int rowStart = i;
            int rowEnd = n - i - 1;
            int colStart = i;
            int colEnd = n - i - 1;
            // top row
            for (int col = colStart; col <= colEnd; col++) {
                result[rowStart][col] = number++;
            }

            // right column
            for (int row = rowStart + 1; row <= rowEnd; row++) {
                result[row][colEnd] = number++;
            }

            // bottom row
            if (rowEnd > rowStart) {
                for (int col = colEnd - 1; col >= colStart; col--) {
                    result[rowEnd][col] = number++;
                }
            }

            // left column
            if (colStart < colEnd) {
                for (int row = rowEnd - 1; row >= rowStart + 1; row--) {
                    result[row][colStart] = number++;
                }
            }
        }
        return result;
    }

}
