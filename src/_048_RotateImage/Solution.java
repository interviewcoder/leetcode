/**
 * Time : O(N^2); Space: O(N^2)
 * @tag : Array 
 * @by  : Steven Cooks
 * @date: Jun 2, 2015
 ***************************************************************************
 * Description: 
 * 
 * You are given an n x n 2D matrix representing an image. 
 * Rotate the image by 90 degrees (clockwise). 
 * 
 * Follow up: Could you do this in-place?
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/rotate-image/ }
 */
package _048_RotateImage;

/** see test {@link _048_RotateImage.SolutionTest } */
public class Solution {

    /*
     *  1  2  3  4               13  9  5 1               13  9 5 1    
     *  5  6  7  8  outer loop   14  6  7 2  inner loop   14 10 6 2 
     *  9 10 11 12 ============> 15 10 11 3 ============> 15 11 7 3 
     * 13 14 15 16               16 12  8 4               16 12 8 4
     */
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        if (n == 0) {
            return;
        }
        int half = n / 2;
        // for each loop
        for (int i = 0; i < half; i++) {
            int startIndex = i;
            int endIndex = startIndex + (n - 2 * i) - 1;
            // in one row, we leave the last number unchanged
            // so it is j < endIndex, not j <= endIndex
            for (int offset = 0; startIndex + offset < endIndex; offset++) {
                // number in the first row
                int temp1 = matrix[startIndex][startIndex + offset];
                // number in the last column
                int temp2 = matrix[startIndex + offset][endIndex];
                // number in the last row
                int temp3 = matrix[endIndex][endIndex - offset];
                // number in the first column
                int temp4 = matrix[endIndex - offset][startIndex];

                matrix[startIndex][startIndex + offset] = temp4;
                matrix[startIndex + offset][endIndex] = temp1;
                matrix[endIndex][endIndex - offset] = temp2;
                matrix[endIndex - offset][startIndex] = temp3;

            }
        }

    }

    public void printMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

}
