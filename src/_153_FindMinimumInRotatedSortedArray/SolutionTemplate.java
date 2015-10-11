/**
 * Time : O(lgN) ; Space: O(1)
 * @tag : Array; Binary Search
 * @by  : Steven Cooks
 * @date: Aug 4, 2015
 ***************************************************************************
 * Description:
 *
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand. 
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2). 
 * 
 * Find the minimum element. You may assume no duplicate exists in the array.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/ }
 */
package _153_FindMinimumInRotatedSortedArray;

/** see test {@link _153_FindMinimumInRotatedSortedArray.SolutionTemplateTest } */
public class SolutionTemplate {

    // solution that using binary search template
    public int findMin(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return Math.min(nums[left], nums[right]);
    }

}
