/**
 * Time : O(N^2); Space: O(N^2)
 * @tag : Hash Table
 * @by  : Steven Cooks
 * @date: May 11, 2015
 *************************************************************************
 * Description: 
 * 
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules. 
 * The Sudoku board could be partially filled, where empty cells are 
 * filled with the character '.'. 
 * Note: 
 * A valid Sudoku board (partially filled) is not necessarily solvable. 
 * Only the filled cells need to be validated.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/valid-sudoku/ }
 */
package _036_ValidSudoku;

/** see test {@link _036_ValidSudoku.SolutionTest } */
public class Solution {

    public boolean isValidSudoku(char[][] board) {
        // 0 means not exist, 1 means occupied
        int[][] rows = new int[9][9];
        int[][] cols = new int[9][9];
        int[][] cells = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];
                // '.' is placeholder for no digit filled there
                if (ch != '.') {
                    int digitIndex = ch - '1';
                    if (rows[i][digitIndex] != 0 || cols[j][digitIndex] != 0
                            || cells[i / 3 * 3 + j / 3][digitIndex] != 0) {
                        // if this digit has been used
                        return false;
                    }

                    // fill board
                    rows[i][digitIndex] = 1;
                    cols[j][digitIndex] = 1;
                    cells[i / 3 * 3 + j / 3][digitIndex] = 1;
                }
            }
        }

        return true;
    }

}
