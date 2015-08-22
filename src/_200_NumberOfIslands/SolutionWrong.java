/**
 * Time : O(); Space : O()
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
 */
package _200_NumberOfIslands;

import java.util.LinkedList;
import java.util.Queue;

/**
 * see Line 82 for wrong idea and see test
 * {@link _200_NumberOfIslands.SolutionWrongTest }
 */
public class SolutionWrong {
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
                    // BFS to find all reaching land
                    labelReachableLand(i, j, rows, cols, grid);
                    result++;
                }
            }
        }
        // recover grid
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 'I') {
                    grid[i][j] = '1';
                }
            }
        }
        return result;
    }

    private void labelReachableLand(int i, int j, int rows, int cols,
            char[][] grid) {
        // ! index = i * cols + j, not index = i * rows + j
        int index = i * cols + j;
        Queue<Integer> landQueue = new LinkedList<>();
        landQueue.add(index);
        while (!landQueue.isEmpty()) {
            index = landQueue.poll();
            int row = index / cols;
            int col = index % cols;
            if (row >= 0 && row < rows && col >= 0 && col < cols
                    && grid[row][col] == '1') {
                grid[row][col] = 'I';
                // ! wrong here
                // for row = 3, col = 0,
                // the left point should be [3, -1]
                // but (row * cols) + (col - 1) will
                // give [2, 2]
                landQueue.add((row - 1) * cols + col);
                landQueue.add((row + 1) * cols + col);
                landQueue.add(row * cols + (col - 1));
                landQueue.add(row * cols + (col + 1));
            }
        }
    }

}
