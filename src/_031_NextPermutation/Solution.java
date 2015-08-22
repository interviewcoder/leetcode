/**
 * Time : O(N); Space: O(1)
 * @tag : Array
 * @by  : Steven Cooks
 * @date: July 5, 2015
 *************************************************************************
 * Description: 
 *  
 * Implement the next permutation, which rearranges numbers into the 
 * numerically next greater permutation of numbers. 
 * 
 * If such arrangement is not possible, it must be rearranged as the 
 * lowest possible order ie, sorted in an ascending order. 
 * 
 * The replacement must be in-place, do not allocate extra memory. 
 * 
 * Examples: 
 *  1,2,3 → 1,3,2 
 *  3,2,1 → 1,2,3 
 *  1,1,5 → 1,5,1 
 *  20, 50, 113 → 20, 113, 50 
 *  
 * Inputs are in the left-hand column and its corresponding 
 * outputs are in the right-hand column.
 *
 *************************************************************************
 * {@link https://leetcode.com/problems/next-permutation/ }
 */
package _031_NextPermutation;

/** see test {@link _031_NextPermutation.SolutionTest } */
public class Solution {
    public void nextPermutation(int[] nums) {
        int start = nums.length - 1;
        while (start > 0 && nums[start - 1] >= nums[start]) {
            start--;
        }
        if (start > 0) {
            int end = nums.length - 1;
            while (nums[end] <= nums[start - 1]) {
                end--;
            }
            swap(nums, start - 1, end);
        }

        for (int i = start; i < (start + nums.length) / 2; i++) {
            swap(nums, i, nums.length - 1 + start - i);
        }
    }

    void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}