/**
 * Time : O(lg(mn)); Space: O(1)
 * @tag : Array; Binary Search
 * @by  : Steven Cooks
 * @date: Jun 6, 2015
 *************************************************************************
 * Description:
 * 
 * Write an efficient algorithm that searches for a value in an m x n matrix. 
 * This matrix has the following properties: 
 * 
 * Integers in each row are sorted from left to right. 
 * The first integer of each row is greater than the last integer of the 
 * previous row.
 * 
 * For example, 
 * Consider the following matrix: 
 * [ 
 *  [1,   3,  5,  7], 
 *  [10, 11, 16, 20], 
 *  [23, 30, 34, 50] 
 * ]
 * Given target = 3, return true.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/search-a-2d-matrix/ }
 */
package _074_SearchA2DMatrix;

/** see test {@link _074_SearchA2DMatrix.SolutionTest } */
public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int startRow = 0;
        int endRow = rows - 1;
        while (startRow < endRow) {
            int halfRow = (startRow + endRow) / 2;
            int half = matrix[halfRow][cols - 1];
            if (half == target) {
                return true;
            } else if (half < target) {
                // go to lower rows to find target
                startRow = halfRow + 1;
            } else {
                // !target can be in end row
                endRow = halfRow;
            }
        }
        // search in 1D array
        return searchLine(matrix[startRow], target);
    }

    private boolean searchLine(int[] line, int target) {
        if (line.length == 0) {
            return false;
        }
        int left = 0;
        int right = line.length - 1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (line[mid] == target) {
                return true;
            } else if (line[mid] < target) {
                // go to right part
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

}
