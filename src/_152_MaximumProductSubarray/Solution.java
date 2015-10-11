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
        int n = nums.length;
        if (n <= 0) {
            return 0;
        }
        // initialize
        int res = nums[0];
        int max = nums[0];  // max product that ending at current index
        int min = nums[0];  // min product that ending at current index

        for (int i = 1; i < n; i++) {
            int num = nums[i];
            int lmax = max * num;
            int lmin = min * num;
            max = Math.max(num, Math.max(lmax, lmin));
            min = Math.min(num, Math.min(lmax, lmin));
            res = Math.max(res, max);
        }
        return res;
    }
}
