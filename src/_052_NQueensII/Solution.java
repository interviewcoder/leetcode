/**
 * Time : O(); Space: O()
 * @tag : Backtracking
 * @by  : Steven Cooks
 * @date: Jun 3, 2015
 ***************************************************************************
 * Description: 
 * 
 * Follow up for N-Queens problem. 
 * Now, instead outputting board configurations, return the total number of 
 * distinct solutions.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/n-queens-ii/ }
 */
package _052_NQueensII;

/** see test {@link _052_NQueensII.SolutionTest } */
public class Solution {

    public int totalNQueens(int n) {
        if (n <= 0) {
            return 0;
        }

        int iQueen = 0;
        int[] queenPos = new int[n];
        int result = 0;
        return totalNQueens(iQueen, n, queenPos, result);
    }

    private int totalNQueens(int iQueen, int nQueens, int[] queenPos, int result) {
        if (iQueen == nQueens) {
            // one valid solution found
            result++;
            return result;
        }
        int row = iQueen;
        for (int col = 0; col < nQueens; col++) {
            // try to put ith Queen at board[row][col]
            queenPos[row] = col;
            if (isBoardOK(row, queenPos)) {
                result = totalNQueens(iQueen + 1, nQueens, queenPos, result);
            }
        }
        return result;
    }

    private boolean isBoardOK(int row, int[] queenPos) {
        for (int i = 0; i < row; i++) {
            if (queenPos[row] == queenPos[i] || // same column?
                    Math.abs(queenPos[row] - queenPos[i]) == row - i) // diagonal
                                                                      // line>?
            {
                return false;
            }
        }
        return true;
    }

}
