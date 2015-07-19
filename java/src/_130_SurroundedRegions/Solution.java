/**
 * Time : O(); Space: O()
 * @tag : Breadth-first Search
 * @by  : Steven Cooks
 * @date: Jun 16, 2015
 *************************************************************************
 *  Given a 2D board containing 'X' and 'O', capture all regions         *
 *  surrounded by 'X'.                                                   *
 *  A region is captured by flipping all 'O's into 'X's in               *
 *  that surrounded region.                                              *
 *************************************************************************
 * {@link https://leetcode.com/problems/surrounded-regions/ }
 */
package _130_SurroundedRegions;

import java.util.LinkedList;
import java.util.Queue;

/** see test {@link _130_SurroundedRegions.SolutionTest } */
public class Solution {

    /**
     * Label those '0's that are qualified for 'X',  and then flip qualified 
     * '0's to 'X's.
     * BFS from each '0' in boundary, and label all reachable '0' as 'B'.
     * These 'B's will not be changed to 'X' because they are not within 
     * regions 'completely' surrounded by 'X'.
     * Then visit each cell in board and flip '0' to 'X', flip 'B' back to '0'.
     */
    public void solve(char[][] board) {
        if (board.length == 0 || board[0].length == 0) {
            return;
        }
        int rows = board.length;
        int cols = board[0].length;
        // label reachable '0's from '0' in boundary
        for (int col = 0; col < cols; col++) {
            // 1st row
            bfs(board, 0, col, rows, cols);
            // last row
            bfs(board, rows - 1, col, rows, cols);
        }
        for (int row = 0; row < rows; row++) {
            // 1st column
            bfs(board, row, 0, rows, cols);
            // last column
            bfs(board, row, cols - 1, rows, cols);
        }

        // flip remaining '0's to 'X' and 'B' back to '0'
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == '0') {
                    board[i][j] = 'X';
                } else if (board[i][j] == 'B') {
                    board[i][j] = '0';
                }
            }
        }
    }

    private void bfs(char[][] board, int row, int col, int rows, int cols) {
        if (board[row][col] != '0') {
            return;
        }
        // find all reachable '0's from board[row][col]
        Queue<Integer> reach = new LinkedList<>();
        reach.add(row * cols + col);
        while (!reach.isEmpty()) {
            int index = reach.poll();
            int r = index / cols;
            int c = index % cols;
            if (r >= 0 && r < rows 
                    && c >= 0 && c < cols
                    && board[r][c] == '0') {
                board[r][c] = 'B';
                reach.add(r * cols + c); 
                reach.add((r + 1) * cols + c);
                reach.add((r - 1) * cols + c);
                reach.add(r * cols + (c - 1));
                reach.add(r * cols + (c + 1));
            }
        }
    }
}
