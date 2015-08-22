/**
 * Time : O(m*n) ; Space: O(m*n)
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
 * see also [POJ][1088]
 */
package s05_LongestIncreasingContinuousSubsequenceII;

/** see test {@link s05_LongestIncreasingContinuousSubsequenceII.SolutionTest } */
public class Solution {

    // memo[i][j] is the count of numbers in the longest increasing continuous 
    // subsequence that starting from position A[i][j]
    private int[][] memo;

    /**
     * memo DP, search for path using BFS and memorize path along the way. 
     */
    public int longestIncreasingContinuousSubsequenceII(int[][] A) {
        if (A.length == 0 || A[0].length == 0) {
            return 0;
        }
        int rows = A.length;
        int cols = A[0].length;
        memo = new int[rows + 1][cols + 1];
        boolean[][] visited = new boolean[rows + 1][cols + 1];
        int result = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // since we want rigidly increasing path, we set start number
                // as A[i][j] - 1 so that (i, j) can be the starting point
                int count = findIncreasingPath(A[i][j] - 1, i, j, rows, cols,  A, visited);
                result = Math.max(result, count);
            }
        }
        return result;
    }

    // find longest increasing path that begins from matrix[i][j], 
    // and the starting point should have larger number than `start`
    private int findIncreasingPath(int start, int i, int j, int rows, int cols, int[][] matrix,
            boolean[][] visited) {
        // base case: check within matrix's bounds, check path is increasing, and check memo
        if (i < 0 || i >= rows || j < 0 || j >= cols || visited[i][j] || matrix[i][j] <= start) {
            return 0;
        } else if (memo[i][j] != 0) {
            return memo[i][j];
        }
        // recursive case: find longest path from neighbors
        int count = 0;
        visited[i][j] = true;
        int num = matrix[i][j];
        count = Math.max(count, findIncreasingPath(num, i - 1, j, rows, cols, matrix, visited));
        count = Math.max(count, findIncreasingPath(num, i + 1, j, rows, cols, matrix, visited));
        count = Math.max(count, findIncreasingPath(num, i, j - 1, rows, cols, matrix, visited));
        count = Math.max(count, findIncreasingPath(num, i, j + 1, rows, cols, matrix, visited));
        int result = 1 + count;
        memo[i][j] = result;
        visited[i][j] = false;
        return result;
    }

}
