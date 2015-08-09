/**
 * Time : O() ; Space: O()
 * @tag : 
 * @by  : Steven Cooks
 * @date: Aug 7, 2015
 ***************************************************************************
 * Description:
 * 
 * Give you an integer matrix (with row size n, column size m)，find the 
 * longest increasing continuous subsequence in this matrix. (The definition 
 * of the longest increasing continuous subsequence here can start at any 
 * row or column and go up/down/right/left any direction). 
 * 
 * Example Given a matrix: 
 * [ 
 *  [1 ,2 ,3 ,4 ,5],
 *  [16,17,24,23,6],
 *  [15,18,25,22,7],
 *  [14,19,20,21,8], 
 *  [13,12,11,10,9] ]
 *  
 * return 25
 * 
 ***************************************************************************
 * {@link http://www.lintcode.com/en/problem/longest-increasing-continuous-subsequence-ii/ }
 */
package s05_LongestIncreasingContinuousSubsequenceII;

/** see test {@link s05_LongestIncreasingContinuousSubsequenceII.SolutionTest } */
public class Solution {
    
    private int[][] memo;
    
    public int longestIncreasingContinuousSubsequenceII(int[][] A) {
        if (A.length == 0 || A[0].length == 0) {
            return 0;
        }
        int rows = A.length;
        int cols = A[0].length;
        memo = new int[rows + 1][cols + 1];
        int result = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int count = findIncreasingPath(i, j, A);
                result = Math.max(result, count);
            }
        }
        return result;
    }

    private int findIncreasingPath(int i, int j, int[][] matrix) {
        // base case
        if (memo[i][j] != 0) {
            return memo[i][j];
        }
        int count = 0;

        memo[i][j] = count;
        return count;
    }

}
