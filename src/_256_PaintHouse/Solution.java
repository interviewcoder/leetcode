/**
 * Time : O() ; Space: O()
 * @tag : Dynamic Programming
 * @by  : Steven Cooks
 * @date: Sep 28, 2015
 ***************************************************************************
 * Description:
 * 
 * There are a row of n houses, each house can be painted with one of the 
 * three colors: red, blue or green. The cost of painting each house with 
 * a certain color is different. You have to paint all the houses such that 
 * no two adjacent houses have the same color. 
 * 
 * The cost of painting each house with a certain color is represented by a 
 * n x 3 cost matrix. For example, costs[0][0] is the cost of painting 
 * house 0 with color red; costs[1][2] is the cost of painting house 1 with 
 * color green, and so on... Find the minimum cost to paint all houses.
 * 
 * Note: All costs are positive integers.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/paint-house/ }
 */
package _256_PaintHouse;

/** see test {@link _256_PaintHouse.SolutionTest } */
public class Solution {

    public int minCost(int[][] costs) {
        int n = costs.length;
        if (n == 0) {
            return 0;
        }
        // f[i][c] = min cost for paint[i : end] if we paint house i with color c
        int f[][] = new int[n + 1][costs[0].length];
        for (int i = n - 1; i >= 0; i--) {
            for (int c = 2; c >= 0; c--) {
                int mincost = Integer.MAX_VALUE;
                for (int color = 0; color <= 2; color++) {
                    if (color != c) {
                        mincost = Math.min(mincost, f[i + 1][color]);
                    }
                }
                f[i][c] = mincost + costs[i][c];
            }
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < f[0].length; i++) {
            res = Math.min(res, f[0][i]);
        }
        return res;
    }

}
