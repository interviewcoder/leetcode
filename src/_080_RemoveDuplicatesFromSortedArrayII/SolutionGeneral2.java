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

/** see test {@link _080_RemoveDuplicatesFromSortedArrayII.SolutionGeneral2Test } */
public class SolutionGeneral2 {
    
    // allowed number of duplicates
    private static final int K = 2;

    public int removeDuplicates(int[] nums) {
        return removeDuplicatesAtMostKDuplicates(nums, K);
    }

    /** 
     * As long as nums[i] is different nums[lastValid - K + 1]
     * we can still insert nums[i] into valid part
     */
    public int removeDuplicatesAtMostKDuplicates(int[] nums, int K) {
        int j = - 1;  // index of last valid elements
        for (int i = 0; i < nums.length; i++) {
            if (j - K + 1 < 0 || nums[i] != nums[j - K + 1]) {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }
}
