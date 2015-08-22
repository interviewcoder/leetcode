/**
 * Time : O(); Space: O()
 * @tag : Array; Backtracking
 * @by  : Steven Cooks
 * @date: Jun 7, 2015
 *************************************************************************
 * Description: 
 * 
 * Given a 2D board and a word, find if the word exists in the grid. 
 * The word can be constructed from letters of sequentially adjacent cell, 
 * where "adjacent" cells are those horizontally or vertically neighboring. 
 * The same letter cell may not be used more than once. 
 * 
 * For example, Given board = 
 * [ 
 *  ["ABCE"], 
 *  ["SFCS"], 
 *  ["ADEE"] 
 * ] 
 * word = "ABCCED", -> returns true, 
 * word = "SEE", -> returns true, 
 * word = "ABCB", -> returns false.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/word-search/ }
 */
package _079_WordSearch;

/** see test {@link _079_WordSearch.SolutionTest } */
public class Solution {

    public boolean exist(char[][] board, String word) {
        if (board.length == 0 || board[0].length == 0) {
            return false;
        }
        if (word.length() == 0) {
            return false;
        }
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int wordIndex = 0;
        // because the choices for matching 1st character of word
        // is different from choices for matching rest characters of word, i.e.
        // each position on board can be the 1st position,
        // only adjacent positions can be the position for matching the next
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // try each possible starting point to
                // match 1st character in word
                if (exist(wordIndex, i, j, rows, cols, board, word, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean exist(int wordIndex, int row, int col, int rows, int cols,
            char[][] board, String word, boolean[][] visited) {
        // base case
        if (wordIndex == word.length()) {
            // word found in board
            return true;
        }

        // recursive case
        if ((row >= 0 && row < rows) && (col >= 0 && col < cols)
                && visited[row][col] == false
                && (board[row][col] == word.charAt(wordIndex))) {
            // go on searching in adjacent positions
            visited[row][col] = true;
            boolean found = exist(wordIndex + 1, row - 1, col, rows, cols,
                    board, word, visited)
                    || exist(wordIndex + 1, row + 1, col, rows, cols, board,
                            word, visited)
                    || exist(wordIndex + 1, row, col - 1, rows, cols, board,
                            word, visited)
                    || exist(wordIndex + 1, row, col + 1, rows, cols, board,
                            word, visited);
            if (found) {
                return true;
            } else {
                visited[row][col] = false;
            }
        }
        return false;
    }

}