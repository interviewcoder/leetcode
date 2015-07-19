/**
 * Time : O(N) ; Space: O(1)
 * @tag : Bit Manipulation
 * @by  : Steven Cooks
 * @date: 04.27.2015
 *************************************************************************
 * Description:
 * 
 * Given an array of integers, every element appears twice except for one. 
 * Find that single one. 
 * Note: 
 * Your algorithm should have a linear runtime complexity. Could you 
 * implement it without using extra memory?
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/single-number/ }
 */
package _136_SingleNumber;

/** see test {@link _136_SingleNumber.SolutionTest } */
public class Solution {

    public int singleNumber(int[] nums) {
        if (nums.length <= 0) {
            return 0;
        }
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // xor operation: using the trick
            // same number ^ same number = 0
            result ^= nums[i];
        }
        return result;
    }

}
