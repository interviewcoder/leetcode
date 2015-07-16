/**
 * Time : O(); Space: O()
 * @tag : Divide and Conquer; Array; Dynamic Programming
 * @by  : Steven Cooks
 * @date: Jun 3, 2015
 ***************************************************************************
 * Description: 
 * 
 * Find the contiguous subarray within an array (containing at least one 
 * number) which has the largest sum. 
 * 
 * For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
 * the contiguous subarray [4,−1,2,1] has the largest sum = 6. 
 * 
 * More practice: 
 * If you have figured out the O(n) solution, try coding another solution 
 * using the divide and conquer approach, which is more subtle.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/maximum-subarray/ }
 */
package _053_MaximumSubarray;

/** see test {@link _053_MaximumSubarray.SolutionTest } */
public class Solution {

    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int result = nums[0];
        int contiguous = result;
        for (int i = 1; i < nums.length; i++) {
            int number = nums[i];
            if (contiguous < 0) {
                contiguous = number;
            } else {
                contiguous += number;
            }
            result = Math.max(result, contiguous);
        }
        return result;
    }

}
