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

/** see test {@link _048_RotateImage.SolutionTwoStepsTest } */
public class SolutionTwoSteps {
    /**
     * First reverse top-bottom, then reverse symmetry 
     * 1 2 3     7 8 9     7 4 1    
     * 4 5 6 ==> 4 5 6 ==> 8 5 2 
     * 7 8 9     1 2 3     9 6 3
     */
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int middle = n / 2;
        // reverse top-bottom, swap the ith row with (n-i)th row
        for (int i = 0; i < middle; i++) {
            for (int j = 0; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - i][j];
                matrix[n - 1 - i][j] = temp;
            }
        }

        // swap symmetry
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }

        }

    }

}
