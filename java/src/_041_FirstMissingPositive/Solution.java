/**
 * Time : O(N) ; Space: O(1)
 * @tag : Array
 * @by  : Steven Cooks
 * @date: Jul 6, 2015
 *************************************************************************
 * Description: 
 * 
 * Given an unsorted integer array, find the first missing positive integer. 
 * 
 * For example, Given [1,2,0] return 3, 
 * and [3,4,-1,1] return 2. 
 * 
 * Your algorithm should run in O(n) time and uses constant space.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/first-missing-positive/ }
 * @note: make sure index within boundary in while loop Line 14
 */
package _041_FirstMissingPositive;

/** see test {@link _041_FirstMissingPositive.SolutionTest } */
public class Solution {
    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            // TODO: make sure index within boundary
            while (nums[i] >= 1 && nums[i] - 1 < nums.length && i < nums.length
                    && nums[nums[i] - 1] != nums[i]) {
                int n = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = n;
            }
        }
        // find first missing number
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }
}
