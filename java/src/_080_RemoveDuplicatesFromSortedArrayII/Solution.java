/**
 * Time : O(N); Space: O(1)
 * @tag : Array; Two Pointers
 * @by  : Steven Cooks
 * @date: May 8, 2015
 *************************************************************************
 * Description: 
 * 
 * Follow up for "Remove Duplicates": 
 * What if duplicates are allowed at most twice? 
 * 
 * For example, Given sorted array nums = [1,1,1,2,2,3], 
 * Your function should return length = 5, with the first five elements of 
 * nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond 
 * the new length.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/ }
 */
package _080_RemoveDuplicatesFromSortedArrayII;

/** see test {@link _080_RemoveDuplicatesFromSortedArrayII.SolutionTest } */
public class Solution {

    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len <= 2) {
            return len;
        }
        int lastValid = 1;
        for (int i = 2; i < len; i++) {
            if (nums[i] != nums[lastValid] || (nums[i] != nums[lastValid - 1])) {
                lastValid++;
                nums[lastValid] = nums[i];
            }
        }
        return lastValid + 1;
    }

}
