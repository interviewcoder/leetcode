/**
 * Time : O(m + n) ; Space: O(1)
 * @tag : Divide and Conquer; Binary Search
 * @by  : Steven Cooks
 * @date: Aug 17, 2015
 ***************************************************************************
 * Description:
 *
 * Write an efficient algorithm that searches for a value in an m x n matrix. 
 * This matrix has the following properties: 
 * Integers in each row are sorted in ascending from left to right. 
 * Integers in each column are sorted in ascending from top to bottom. 
 * For example, Consider the following matrix: 
 * [ [1,   4,  7, 11, 15], 
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30] ]
 * Given target = 5, return true. 
 * Given target = 20, return false.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/search-a-2d-matrix-ii/ }
 */
package _240_SearchA2DMatrixII;

/** see test {@link _240_SearchA2DMatrixII.SolutionTest } */
public class Solution {

    // start from top right corner
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int i = 0;
        int j = cols - 1;
        while (i < rows && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

}
