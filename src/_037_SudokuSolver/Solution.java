/**
 * Time : O(); Space: O()
 * @tag : Backtracking; Hash Table
 * @by  : Steven Cooks
 * @date: May 11, 2015
 *************************************************************************
 * Description: 
 * 
 * Write a program to solve a Sudoku puzzle by filling the empty cells. 
 * Empty cells are indicated by the character '.'. 
 * You may assume that there will be only one unique solution.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/sudoku-solver/ }
 */
package _037_SudokuSolver;

/** see test {@link _037_SudokuSolver.SolutionTest } */
public class Solution {

    private int[][] rows = new int[9][9];
    private int[][] cols = new int[9][9];
    private int[][] cells = new int[9][9];

    public void solveSudoku(char[][] board) {
        // process current board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];
                if (ch != '.') {
                    int digitIndex = ch - '1';
                    rows[i][digitIndex] = 1;
                    cols[j][digitIndex] = 1;
                    cells[i / 3 * 3 + j / 3][digitIndex] = 1;
                }
            }
        }
        // solve sudoku
        solveSudoku(board, 0);
    }

    public boolean solveSudoku(char[][] board, int pos) {
        if (pos >= 81) {
            // board slots are filled
            return true;
        }
        int row = pos / 9;
        int col = pos % 9;
        if (board[row][col] != '.') {
            // try next position
            return solveSudoku(board, pos + 1);
        } else {
            // try to fill a number here
            for (char digit = '1'; digit <= '9'; digit++) {
                if (isBoardOk(board, row, col, digit)) {
                    int digitIndex = digit - '1';

                    // fill this number and update
                    board[row][col] = digit;
                    rows[row][digitIndex] = 1;
                    cols[col][digitIndex] = 1;
                    cells[row / 3 * 3 + col / 3][digitIndex] = 1;

                    // try next position
                    if (solveSudoku(board, pos + 1)) {
                        return true;
                    }

                    // restore
                    board[row][col] = '.';
                    rows[row][digitIndex] = 0;
                    cols[col][digitIndex] = 0;
                    cells[row / 3 * 3 + col / 3][digitIndex] = 0;

                }
            }
        }
        return false;
    }

    private boolean isBoardOk(char[][] board, int row, int col, char digit) {
        int digitIndex = digit - '1';
        return rows[row][digitIndex] == 0 && cols[col][digitIndex] == 0
                && cells[row / 3 * 3 + col / 3][digitIndex] == 0;
    }

}
