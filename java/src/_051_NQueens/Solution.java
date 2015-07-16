/**
 * Time : O(); Space: O()
 * @tag : Backtracking
 * @by  : Steven Cooks
 * @date: Jun 3, 2015
 ***************************************************************************
 * Description: 
 * 
 * A queen can attack other queen in the same row, 
 * same column and diagonal line.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/n-queens/ }
 */
package _051_NQueens;

import java.util.ArrayList;
import java.util.List;

/** see test {@link _051_NQueens.SolutionTest } */
public class Solution {

    public List<String[]> solveNQueens(int n) {
        List<String[]> result = new ArrayList<String[]>();
        if (n <= 0) {
            return result;
        }
        int iQueen = 0;
        // queenPos[i] = j means placing the ith Queen at board[i][j]
        int[] queenPos = new int[n];
        solveNQueens(iQueen, n, queenPos, result);
        return result;
    }

    private void solveNQueens(int iQueen, int nQueen, int[] queenPos,
            List<String[]> result) {
        if (iQueen == nQueen) {
            // construct board
            String[] board = new String[nQueen];
            for (int i = 0; i < board.length; i++) {
                StringBuilder row = new StringBuilder();
                for (int j = 0; j < nQueen; j++) {
                    if (queenPos[i] == j) {
                        row.append("Q");
                    } else {
                        row.append(".");
                    }
                }
                board[i] = row.toString();
            }
            result.add(board);
            return;
        }

        int row = iQueen;
        for (int col = 0; col < nQueen; col++) {
            // try to put the ith Queen at board[row][col]
            queenPos[row] = col;
            if (isBoardOk(row, queenPos)) {
                solveNQueens(iQueen + 1, nQueen, queenPos, result);
            }
        }
    }

    private boolean isBoardOk(int row, int[] queenPos) {
        for (int i = 0; i < row; i++) {
            if (queenPos[i] == queenPos[row] // queens in the same column
                    || Math.abs(queenPos[row] - queenPos[i]) == row - i) // diagonal
                                                                         // line
            {
                return false;
            }
        }
        return true;
    }

}
