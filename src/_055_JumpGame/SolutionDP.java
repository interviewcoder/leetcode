/**
 * Time : O(N^2); Space: O(N)
 * @tag : Array; Greedy
 * @by  : Steven Cooks
 * @date: Jun 3, 2015
 ***************************************************************************
 * Description: 
 * 
 * Given an array of non-negative integers, you are initially positioned at 
 * the first index of the array. 
 * Each element in the array represents your maximum jump length at that position. 
 * 
 * Determine if you are able to reach the last index. 
 * For example: 
 *  A = [2,3,1,1,4], return true. 
 *  A = [3,2,1,0,4], return false.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/jump-game/ }
 */
package _055_JumpGame;

/** see test {@link _055_JumpGame.SolutionDPTest } */
public class SolutionDP {

    public boolean canJump(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            boolean canJump = false;
            for (int j = i - 1; j >= 0; j--) {
                if (dp[j] >= i) {
                    canJump = true;
                    dp[i] = i + nums[i - 1];
                }
            }
            if (!canJump) {
                return false;
            }
        }
        return true;
    }

}
