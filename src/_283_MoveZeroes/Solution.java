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
 */
package _283_MoveZeroes;

/** see test {@link _283_MoveZeroes.SolutionTest } */
public class Solution {

    // x, x, x, 0, 0, 0, y  =>  x, x, x, y, 0, 0, 0
    //          j        i                  j
    // swap nums[i] with nums[j] 
    public void moveZeroes(int[] nums) {
        int j = -1; // index of first 0 in array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (j == -1) {
                    j = i;
                }
            } else {
                if (j != -1) {
                    // swap with first 0 in array
                    nums[j++] = nums[i];
                    nums[i] = 0;
                }
            }
        }
    }

}
