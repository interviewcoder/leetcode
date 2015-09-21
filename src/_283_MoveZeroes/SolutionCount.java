/**
 * Time : O(N) ; Space: O(1)
 * @tag : Array; Two Pointers
 * @by  : Steven Cooks
 * @date: Sep 20, 2015
 ***************************************************************************
 * Description:
 * 
 * Given an array nums, write a function to move all 0's to the end of it 
 * while maintaining the relative order of the non-zero elements. 
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, 
 * nums should be [1, 3, 12, 0, 0]. 
 * 
 * Note: 
 * You must do this in-place without making a copy of the array. 
 * Minimize the total number of operations.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/move-zeroes/ }
 * {@link http://www.geeksforgeeks.org/move-zeroes-end-array/ }
 */
package _283_MoveZeroes;

/** see test {@link _283_MoveZeroes.SolutionCountTest } */
public class SolutionCount {

    public void moveZeroes(int[] nums) {
        int count = 0;  // count of nonzero numbers 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }
        while (count < nums.length) {
            nums[count++] = 0;
        }
    }

    public void moveZeroes_minWrites(int[] nums) {
        int count = 0;  // count of nonzero numbers 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (count != i) {
                    nums[count] = nums[i];
                }
                count++;
            }
        }
        while (count < nums.length) {
            if (nums[count] != 0) {
                nums[count] = 0;
            }
            count++;
        }
    }

}
