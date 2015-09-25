/**
 * Time : O((mn)^2); Space: O(m*n)
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
public class SolutionSlow {

    private static final int[] X = { -1, 1, 0, 0 };
    private static final int[] Y = { 0, 0, -1, 1 };

    public void wallsAndGates(int[][] rooms) {
        if (rooms.length == 0 || rooms[0].length == 0) {
            return;
        }
        int rows = rooms.length;
        int cols = rooms[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rooms[i][j] == 0) {
                    bfs(i, j, rows, cols, rooms);
                }
            }
        }
    }

    private void bfs(int i, int j, int rows, int cols, int[][] rooms) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[][] visited = new boolean[rows][cols];
        queue.add(i * cols + j);
        visited[i][j] = true;

        int dist = 1;
        while (!queue.isEmpty()) {
            int sz = queue.size();
            for (int p = 0; p < sz; p++) {
                int index = queue.poll();
                int x = index / cols;
                int y = index % cols;
                for (int k = 0; k < X.length; k++) {
                    int xx = x + X[k];
                    int yy = y + Y[k];
                    if (xx >= 0 && xx < rows && yy >= 0 && yy < cols && !visited[xx][yy]) {
                        visited[xx][yy] = true;
                        if (rooms[xx][yy] > 0) {
                            queue.add(xx * cols + yy);
                            rooms[xx][yy] = Math.min(rooms[xx][yy], dist);
                        }
                    }
                }
            }
            dist++;
        }
    }

}
