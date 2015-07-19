/**
 * Time : O(N); Space: O(1)
 * @tag : Array; Dynamic Programming
 * @by  : Steven Cooks
 * @date: 05.07.2015
 *************************************************************************
 * Description: 
 * 
 * Find the contiguous subarray within an array (containing at least one 
 * number) which has the largest product. 
 * 
 * For example, given the array [2,3,-2,4], 
 * the contiguous subarray [2,3] has the largest product = 6.
 *
 *************************************************************************
 * {@link https://leetcode.com/problems/maximum-product-subarray/ }
 */
package _152_MaximumProductSubarray;

/** see test {@link _152_MaximumProductSubarray.SolutionTest } */
public class Solution {

    public int maxProduct(int[] nums) {
        int len = nums.length;
        if (len < 1) {
            return 0;
        }
        int result = nums[0];
        int localMax = nums[0];
        int localMin = nums[0];
        for (int i = 1; i < len; i++) {
            int number = nums[i];
            int lmax = localMax;
            int lmin = localMin;
            // local max
            localMax = Math.max(number, Math.max(lmax * number, lmin * number));
            // local min
            localMin = Math.min(number, Math.min(lmax * number, lmin * number));
            result = Math.max(localMax, result);
        }
        return result;
    }
}
