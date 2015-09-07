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

/** see test {@link _152_MaximumProductSubarray.Solution2Test } */
public class Solution2 {

    public int maxProduct(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int res = nums[0];
        int max = res;
        int min = res;
        for (int i = 1; i < n; i++) {
            int num = nums[i];
            if (num < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(num, num * max);
            min = Math.min(num, num * min);
            res = Math.max(res, max);
        }
        return res;
    }

}
