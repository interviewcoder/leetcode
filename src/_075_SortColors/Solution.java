/**
 * Time : O(N); Space: O(1)
 * @tag : Array; Two Pointers; Sort
 * @by  : Steven Cooks
 * @date: Jun 6, 2015
 *************************************************************************
 * Description:
 * 
 * Given an array with n objects colored red, white or blue, sort them so 
 * that objects of the same color are adjacent, with the colors in the order 
 * red, white and blue. 
 * 
 * Here, we will use the integers 0, 1, and 2 to represent the color red, 
 * white, and blue respectively. 
 * 
 * Note: 
 * You are not suppose to use the library's sort function for this problem. 
 * 
 * Follow up: 
 * Could you come up with an one-pass algorithm using only constant space?
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/sort-colors/ }
 */
package _075_SortColors;

/** see test {@link _075_SortColors.SolutionTest } */
public class Solution {

    public void sortColors(int[] nums) {
        if (nums.length == 0) {
            return;
        }
        int last0 = -1;
        int last1 = -1;
        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            if (number == 2) {
                // do nothing
            } else if (number == 1) {
                swap(nums, i, last1 + 1);
                last1++;
            } else if (number == 0) {
                swap(nums, i, last1 + 1);
                swap(nums, last1 + 1, last0 + 1);
                last0++;
                last1++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        if (i >= 0 && i < nums.length && j >= 0 && j < nums.length && i != j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

}
