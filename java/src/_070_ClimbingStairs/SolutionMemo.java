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

import java.util.HashMap;
import java.util.Map;

/** see test {@link _070_ClimbingStairs.SolutionMemoTest } */
public class SolutionMemo {
    private Map<Integer, Integer> memo = new HashMap<Integer, Integer>();

    public int climbStairs(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int result = climbStairs(n - 1) + climbStairs(n - 2);
        memo.put(n, result);
        return result;
    }

}
