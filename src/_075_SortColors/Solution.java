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
        int red = -1;
        int white = -1;
        int blue = -1;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == 2) {
                // enlarge blue part 
                blue++;
            } else if (num == 1) {
                // enlarge white part
                ++blue;
                nums[blue] = nums[++white];
                nums[white] = 1;
            } else {
                // enlarge red part
                blue++;
                nums[blue] = nums[++white];
                nums[white] = nums[++red];
                nums[red] = 0;
            }
        }
    }

}
