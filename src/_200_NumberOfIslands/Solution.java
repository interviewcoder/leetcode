/**
 * Time : O(N); Space : O(1)
 * @tag : Depth-first Search; Breadth-first Search
 * @by  : Steven Cooks
 * @date: Jun 30, 2015
 ***************************************************************************
 * Description: 
 * 
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of 
 * islands. An island is surrounded by water and is formed by connecting 
 * adjacent lands horizontally or vertically. You may assume all four edges 
 * of the grid are all surrounded by water. 
 * 
 * Example 1: 
 *      11110 
 *      11010 
 *      11000 
 *      00000 
 * Answer: 1 
 * 
 * Example 2: 
 *      11000 
 *      11000 
 *      00100 
 *      00011 
 * Answer: 3
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/number-of-islands/ }
 * 1. how to calculate index of 2d array (i * cols + j)
 */
package _200_NumberOfIslands;

/** see test {@link _200_NumberOfIslands.SolutionTest } */
public class Solution {

    // DFS version
    public int numIslands(char[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int rows = grid.length;
        int cols = grid[0].length;
        int result = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // label each reachable land from current position
                if (grid[i][j] == '1') {
                    labelReachableLand(i, j, rows, cols, grid);
                    result++;
                }
            }
        }
        // recover grid
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '+') {
                    grid[i][j] = '1';
                }
            }
        }
        return result;
    }

    // DFS to label reachable land
    private void labelReachableLand(int i, int j, int rows, int cols,
            char[][] grid) {
        // base case
        if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] != '1') {
            return;
        }
        // recursive case
        grid[i][j] = 'I';   // label as visited
        labelReachableLand(i + 1, j, rows, cols, grid);
        labelReachableLand(i - 1, j, rows, cols, grid);
        labelReachableLand(i, j - 1, rows, cols, grid);
        labelReachableLand(i, j + 1, rows, cols, grid);
    }
}
