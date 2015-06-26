/**
 * Time : O(); Space : O()
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

public class Solution {

    /* Be careful of off-by-one errors */
    public int minSubArrayLen(int s, int[] nums) {
        int len = nums.length;
        int sum = 0;
        int endIndex = 0;
        int result = Integer.MAX_VALUE;
        for (int startIndex = 0; startIndex < len; startIndex++) {
            if (startIndex > 0) {
                sum -= nums[startIndex - 1];
            } else {
                sum = nums[0];
            }
            if (sum >= s) {
                // go backwards to shrink sub array
                while (endIndex >= startIndex && sum >= s) {
                    sum -= nums[endIndex--];
                }
                result = Math.min(endIndex - startIndex + 2, result);
            } else {
                // go forwards to expand sub array
                while (endIndex < len - 1 && sum < s) {
                    sum += nums[++endIndex];
                }
                if (sum >= s) {
                    result = Math.min(endIndex - startIndex + 1, result);
                } else if (endIndex == len - 1) {
                    //prune: no sum of sub array will be larger
                    break;
                }
            }
        }
        // return 0 if no sub array is found
        return result == Integer.MAX_VALUE ? 0 : result;
    }

}
