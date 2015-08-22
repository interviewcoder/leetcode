/**
 * Time : O(N); Space: O(1)
 * @tag : Array; Two Pointers
 * @by  : Steven Cooks
 * @date: May 8, 2015
 *************************************************************************
 * Description: 
 * 
 * Given a sorted array, remove the duplicates in place such that each 
 * element appear only once and return the new length. 
 * Do not allocate extra space for another array, you must do this in 
 * place with constant memory. 
 * 
 * For example, Given input array nums = [1,1,2], 
 * Your function should return length = 2, with the first two elements of 
 * nums being 1 and 2 respectively. It doesn't matter what you leave 
 * beyond the new length.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/remove-duplicates-from-sorted-array/ }
 */
package _026_RemoveDuplicatesFromSortedArray;

/** see test {@link _026_RemoveDuplicatesFromSortedArray.SolutionTest } */
public class Solution {

    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int last = 0;
        for (int i = 1; i < len; i++) {
            if (nums[i] != nums[last]) {
                // another 'new' number
                last++;
                if (last != i) {
                    nums[last] = nums[i];
                }
            }
        }
        return last + 1;
    }

}
