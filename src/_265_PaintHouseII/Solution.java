/**
 * Time : O(nk) ; Space: O()
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

/** see test {@link _265_PaintHouseII.SolutionTest } */
public class Solution {

    public int minCostII(int[][] costs) {
        int n = costs.length;
        if (n == 0) {
            return 0;
        }
        int k = costs[0].length;
        int min1 = Integer.MAX_VALUE; // the smallest cost after paint i-th house
        int min2 = Integer.MAX_VALUE; // second smallest cost
        int color = -1; // color for min1 choice in last round
        int[][] f = new int[n][k];
        for (int i = n - 1; i >= 0; i--) {
            int temp1 = Integer.MAX_VALUE;
            int temp2 = Integer.MAX_VALUE;
            int tempC = -1;
            for (int c = k - 1; c >= 0; c--) {
                int mincost = 0;
                if (i == n - 1) {
                    mincost = costs[i][c];
                } else {
                    if (f[i][c] != min1 && color != c) {
                        mincost = min1 + costs[i][c];
                    } else {
                        mincost = min2 + costs[i][c];
                    }
                }
                if (temp1 <= mincost) {
                    temp2 = Math.min(temp2, mincost);
                } else {
                    temp2 = temp1;
                    temp1 = mincost;
                    tempC = c;
                }
                f[i][c] = mincost;
            }
            min1 = temp1;
            min2 = temp2;
            color = tempC;
        }
        return min1;
    }

}
