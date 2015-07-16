/**
 * Time : O(N); Space: O(1)
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

/** see test {@link _055_JumpGame.SolutionTest } */
public class Solution {

    public boolean canJump(int[] nums) {
        int i = 0;
        int n = nums.length;
        int reach = 0;
        for (; i < n && i <= reach; i++) {
            reach = Math.max(nums[i] + i, reach);
        }
        return i == n;
    }

}
