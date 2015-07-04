/**
 * Time : O(); Space: O()
 * @Tag : Array
 * @Date: Jun 3, 2015
 *************************************************************************
 * Description: 
 * 
 * Given a matrix of m x n elements (m rows, n columns), return all 
 * elements of the matrix in spiral order. 
 * 
 * For example, 
 * Given the following matrix: 
 * [ 
 *  [ 1, 2, 3 ], 
 *  [ 4, 5, 6 ], 
 *  [ 7, 8, 9 ] 
 * ] 
 * 
 * You should return [1,2,3,6,9,8,7,4,5].
 *
 *************************************************************************
 * {@link https://leetcode.com/problems/spiral-matrix/ }
 * P.S. : how to terminate for half rows of matrix (including the middle row)
 * ! index of middle row  =  (rows - 1) / 2
 */
package _054_SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        int rows = matrix.length;
        if (rows == 0) {
            return result;
        }
        int cols = matrix[0].length;
        // loop including the middle row in matrix
        for (int i = 0; i <= (rows - 1) / 2; i++) {
            int rowStart = i;
            int colStart = i;
            int colEnd = cols - i - 1;
            int rowEnd = rows - i - 1;
            // top row
            for (int j = colStart; j <= colEnd; j++) {
                result.add(matrix[rowStart][j]);
            }
            // right column
            if (colEnd >= 0 && colEnd < cols && colEnd >= colStart) {
                for (int j = rowStart + 1; j <= rowEnd; j++) {
                    result.add(matrix[j][colEnd]);
                }
            }
            // bottom row, skip if same as top row
            if (rowEnd > rowStart) {
                for (int j = colEnd - 1; j >= colStart; j--) {
                    result.add(matrix[rowEnd][j]);
                }
            }
            // left column, skip if same as right column
            if (colStart < colEnd) {
                for (int j = rowEnd - 1; j >= rowStart + 1; j--) {
                    result.add(matrix[j][colStart]);
                }
            }
        }
        return result;
    }
}
