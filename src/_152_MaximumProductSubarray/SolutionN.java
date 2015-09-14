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

/** see test {@link _152_MaximumProductSubarray.SolutionNTest } */
public class SolutionN {

    public int maxProduct(int[] nums) {
        int n = nums.length;
        if (n <= 0) {
            return 0;
        }
        // initialize 
        int[] maxs = new int[n];
        int[] mins = new int[n];
        int res = nums[0];
        maxs[0] = nums[0];
        mins[0] = nums[0];
        // dp
        for (int i = 1; i < n; i++) {
            int num = nums[i];
            int max = maxs[i - 1] * num;
            int min = mins[i - 1] * num;
            maxs[i] = Math.max(num, Math.max(max, min));
            mins[i] = Math.min(num, Math.min(max, min));
            res = Math.max(res, maxs[i]);
        }
        return res;
    }
}
