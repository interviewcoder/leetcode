/**
 * Time : O(); Space: O()
 * @tag : Dynamic Programming
 * @by  : Steven Cooks
 * @date: Jun 5, 2015
 *************************************************************************
 * Description
 * 
 * You are climbing a stair case. It takes n steps to reach to the top. 
 * Each time you can either climb 1 or 2 steps. In how many distinct ways 
 * can you climb to the top?
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/climbing-stairs/ }
 */
package _070_ClimbingStairs;

/** see test {@link _070_ClimbingStairs.SolutionTest } */
public class Solution {

    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int n1 = 1;
        int n2 = 2;
        int result = n2;
        for (int i = 2; i < n; i++) {
            result = n1 + n2;
            n1 = n2;
            n2 = result;
        }
        return result;
    }

}
