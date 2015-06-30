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
 * 1. how to calculate index of 2d array (i * cols + j)
 */
package _200_NumberOfIslands;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;

/** see test {@link _200_NumberOfIslands.SolutionBFSPointTest } */
public class SolutionBFSPoint {
    
    // use Java native Point class to construct 2d coordinates
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
        Point point = new Point(i, j);
        Queue<Point> queue = new LinkedList<>();
        queue.add(point);
        
        while (!queue.isEmpty()) {
            point = queue.poll();
            int r = point.x;
            int c = point.y;
            if (r >= 0 && r < rows && c >= 0 && c < cols && grid[r][c] == '1') {
                grid[r][c] = 'I';
                queue.add(new Point(r - 1, c));
                queue.add(new Point(r + 1, c));
                queue.add(new Point(r, c - 1));
                queue.add(new Point(r, c + 1));
            }
        }

    }

}
