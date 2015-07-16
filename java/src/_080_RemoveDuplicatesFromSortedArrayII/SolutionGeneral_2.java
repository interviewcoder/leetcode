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

/** see test {@link _080_RemoveDuplicatesFromSortedArrayII.SolutionGeneral_2Test } */
public class SolutionGeneral_2 {

    public int removeDuplicates(int[] nums) {
        int k = 2;
        return removeDuplicatesAtMostKDuplicates(nums, k);
    }

    public int removeDuplicatesAtMostKDuplicates(int[] nums, int k) {
        int len = nums.length;
        if (len <= k) {
            return len;
        }
        int lastValidIndex = k - 1;
        for (int i = k; i < len; i++) {
            // as long as nums[i] is different nums[lastValid - k + 1]
            // we can still insert nums[i] into valid part
            if (nums[i] != nums[lastValidIndex - k + 1]) {
                nums[++lastValidIndex] = nums[i];
            }
        }
        return lastValidIndex + 1;
    }
}
