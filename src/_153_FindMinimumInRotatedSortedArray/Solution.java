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

/** see test {@link _153_FindMinimumInRotatedSortedArray.SolutionTest } */
public class Solution {

    public int findMin(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                // nums[mid] <= nums[right], so mid might be the result
                right = mid;
            }
        }
        return nums[left];
    }

}
