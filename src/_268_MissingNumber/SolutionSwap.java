/**
 * Time : O(N) ; Space: O(1)
 * @tag : Array; Math; Bit Manipulation
 * @by  : Steven Cooks
 * @date: Sep 14, 2015
 ***************************************************************************
 * Description:
 *
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, 
 * find the one that is missing from the array. 
 * 
 * For example, Given nums = [0, 1, 3] return 2.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/missing-number/ }
 */
package _268_MissingNumber;

/** see test {@link _268_MissingNumber.SolutionSwapTest } */
public class SolutionSwap {
    
    // swap-until technique
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            // make sure index is within bound
            while (nums[i] < n && nums[nums[i]] != nums[i] ) {
                int temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return n;
    }

}
