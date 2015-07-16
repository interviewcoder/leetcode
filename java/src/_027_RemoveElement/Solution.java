/**
 * Time : O(N); Space: O(1)
 * @tag : Array; Two Pointers
 * @by  : Steven Cooks
 * @date: May 8, 2015
 *************************************************************************
 * Description: 
 * 
 * Given an array and a value, remove all instances of that value in place 
 * and return the new length. 
 * 
 * The order of elements can be changed. 
 * It doesn't matter what you leave beyond the new length.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/remove-element/ }
 */
package _027_RemoveElement;

/** see test {@link _027_RemoveElement.SolutionTest } */
public class Solution {

    // send-to-the-right-place
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            while (nums[i] == val && i < len) {
                nums[i] = nums[--len];
            }
        }
        return len;
    }
}
