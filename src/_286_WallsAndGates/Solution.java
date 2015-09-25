/**
 * Time : O(m*n) ; Space: O(m*n)
 * @tag : Breadth-first Search
 * @by  : Steven Cooks
 * @date: Sep 25, 2015
 ***************************************************************************
 * Description:
 * 
 * You are given a m x n 2D grid initialized with these three possible values. 
 * 
 * 1. -1 - A wall or an obstacle. 
 * 2. 0 - A gate. 
 * 3. INF - Infinity means an empty room. We use the value 231 - 1 = 2147483647 
 * to represent INF as you may assume that the distance to a gate is less than 2147483647.
 * 
 * Fill each empty room with the distance to its nearest gate. If it is 
 * impossible to reach a gate, it should be filled with INF. 
 * 
 * For example, given the 2D grid: 
 * INF  -1  0  INF 
 * INF INF INF  -1 
 * INF  -1 INF  -1 
 * 0  -1 INF INF 
 * 
 * After running your function, the 2D grid should be: 
 * 3  -1   0   1 
 * 2   2   1  -1 
 * 1  -1   2  -1 
 * 0  -1   3   4
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/walls-and-gates/ }
 */
package _286_WallsAndGates;

import java.util.LinkedList;
import java.util.Queue;

/** see test {@link _286_WallsAndGates.SolutionTest } */
public class Solution {

    private static final int[] X = { -1, 1, 0, 0 };
    private static final int[] Y = { 0, 0, -1, 1 };
    private static final int INF = Integer.MAX_VALUE;

    /** First find all `0`s, and then fill empty cells with distance */
    public void wallsAndGates(int[][] rooms) {
        if (rooms.length == 0 || rooms[0].length == 0) {
            return;
        }
        int rows = rooms.length;
        int cols = rooms[0].length;
        Queue<Integer> queue = new LinkedList<>();
        // find all `0`s
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rooms[i][j] == 0) {
                    queue.add(i * cols + j);
                }
            }
        }
        // fill each empty cell
        while (!queue.isEmpty()) {
            int index = queue.poll();
            int x = index / cols;
            int y = index % cols;
            for (int i = 0; i < X.length; i++) {
                int xx = x + X[i];
                int yy = y + Y[i];
                if (xx >= 0 && xx < rows && yy >= 0 && yy < cols && rooms[xx][yy] == INF) {
                    rooms[xx][yy] = rooms[x][y] + 1;
                    queue.add(xx * cols + yy);
                }
            }
        }
    }

}
