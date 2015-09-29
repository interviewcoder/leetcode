/**
 * Time : O(nk*k) ; Space: O()
 * @tag : Dynamic Programming
 * @by  : Steven Cooks
 * @date: Sep 28, 2015
 ***************************************************************************
 * Description:
 * 
 * There are a row of n houses, each house can be painted with one of the k colors. 
 * The cost of painting each house with a certain color is different. 
 * You have to paint all the houses such that no two adjacent houses have the same color. 
 * 
 * The cost of painting each house with a certain color is represented by a n x k cost matrix. 
 * 
 * For example, costs[0][0] is the cost of painting house 0 with color 0; 
 * costs[1][2] is the cost of painting house 1 with color 2, and so on... 
 * Find the minimum cost to paint all houses. 
 * 
 * Note: All costs are positive integers. 
 * 
 * Follow up: Could you solve it in O(nk) runtime?
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/paint-house-ii/ }
 */
package _265_PaintHouseII;

/** see test {@link _265_PaintHouseII.SolutionSlowTest } */
public class SolutionSlow {

    // This version is slow because it takes extra O(k) time to find
    // max cost in the inner-most loop
    public int minCostII(int[][] costs) {
        int n = costs.length;
        if (n == 0) {
            return 0;
        }
        int k = costs[0].length;
        int[][] f = new int[n][k];
        for (int i = n - 1; i >= 0; i--) {
            for (int c = k - 1; c >= 0; c--) {
                int mincost = 0;
                if (i == n - 1) {
                    mincost = costs[i][c];
                } else {
                    mincost = Integer.MAX_VALUE;
                    for (int color = 0; color < k; color++) {
                        if (color != c) {
                            mincost = Math.min(mincost, f[i + 1][color]);
                        }
                    }
                    mincost += costs[i][c];
                }
                f[i][c] = mincost;
            }
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < k; i++) {
            res = Math.min(res, f[0][i]);
        }
        return res;
    }

}
