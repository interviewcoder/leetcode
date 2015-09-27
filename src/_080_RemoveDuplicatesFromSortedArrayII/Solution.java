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
        int j = -1;  // last index of `good` part
        for (int i = 0; i < nums.length; i++) {
            if (i < 2 || (nums[i] != nums[j - 1])) {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }

    // version2, use `continue` keyword
    public int removeDuplicates2(int[] nums) {
        int j = -1;
        for (int i = 0; i < nums.length; i++) {
            if (i >= 2 && nums[i] == nums[j] && nums[i] == nums[j - 1]) {
                continue;
            }
            nums[++j] = nums[i];
        }
        return j + 1;
    }

}
