/**
 * Time : O(); Space : O()
 * @tag : Dynamic Programming
 * @by  : Steven Cooks
 * @date: Jun 27, 2015
 *******************************************************************************
 * Description: 
 * 
 * After robbing those houses on that street, the thief has found himself 
 * a new place for his thievery so that he will not get too much attention. 
 * This time, all houses at this place are arranged in a circle. That means 
 * the first house is the neighbor of the last one.  Each house has a certain 
 * amount of money stashed, the only constraint stopping you from robbing 
 * each of them is that adjacent houses have security system connected and 
 * it will automatically contact the police if two adjacent houses were 
 * broken into on the same night.
 * 
 * Given a list of non-negative integers representing the amount of money
 * of each house, determine the maximum amount of money you can rob 
 * tonight without alerting the police.
 * 
 *******************************************************************************
 * {@link https://leetcode.com/problems/house-robber-ii/  }
 */
package _213_HouseRobberII;

/** how to break circle down to original house robber problem */
public class SolutionBasic {

    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        } else if (len == 2) {
            return Math.max(nums[0], nums[1]);
        } else {
            return Math.max(rob(nums, 0, len - 2), rob(nums, 1, len - 1));
        }
    }

    // when you might be able to steal both start and end
    private int rob(int[] nums, int start, int end) {
        if (start > end) {
            return 0;
        } else if (start == end) {
            return nums[start];
        } else {
            int[] dp = new int[end - start + 2];
            dp[dp.length - 1] = 0;
            for (int i = end - start; i >= 0; i--) {
                if (i == end - start) {
                    dp[i] = nums[end];
                } else {
                    dp[i] = Math.max(dp[i + 1], nums[start + i] + dp[i + 2]);
                }
            }
            return dp[0];
        }
    }
}
