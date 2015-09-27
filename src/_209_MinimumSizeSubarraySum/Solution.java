/**
 * Time : O(N); Space : O(1)
 * @tag : Array; Two Pointers; Binary Search
 * @by  : Steven Cooks
 * @date: Jun 25, 2015
 *************************************************************************
 * Description: 
 * 
 * Given an array of n positive integers and a positive integer s, find 
 * the minimal length of a subarray of which the sum ≥ s. If there isn't 
 * one, return 0 instead. 
 * 
 * For example, given the array [2,3,1,2,4,3] and s = 7, 
 * the subarray [4,3] has the minimal length under the problem constraint. 
 * 
 * If you have figured out the O(n) solution, try coding another solution 
 * of which the time complexity is O(n log n).
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/minimum-size-subarray-sum/ }
 */
package _209_MinimumSizeSubarraySum;

/** see test {@link _209_MinimumSizeSubarraySum.SolutionTest } */
public class Solution {

    /* keep a sliding window using two pointers */
    public int minSubArrayLen(int s, int[] nums) {
        int res = Integer.MAX_VALUE;
        int cursum = 0;
        int start = 0;
        for (int end = 0; end < nums.length; end++) {
            int num = nums[end];
            cursum += num;
            while (start <= end && cursum >= s) {
                res = Math.min(res, end - start + 1);
                cursum -= nums[start++];
            }
        }
        return res < Integer.MAX_VALUE ? res : 0;
    }

}
