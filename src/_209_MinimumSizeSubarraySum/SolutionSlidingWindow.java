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

public class SolutionSlidingWindow {

    /* keep a sliding window using two pointers */
    public int minSubArrayLen(int s, int[] nums) {
        int startIndex = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int endIndex = 0; endIndex < nums.length; endIndex++) {
            sum += nums[endIndex];
            while (sum >= s) {
                // move left side forwards to shrink window
                result = Math.min(result, endIndex - startIndex + 1);
                sum -= nums[startIndex++];
            }
            // sum < s, so move right side forwards to expand window
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }

}
