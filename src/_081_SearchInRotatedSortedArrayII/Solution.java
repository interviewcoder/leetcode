/**
 * Time : O(logN); Space: O(1)
 * @tag : Array; Binary Search
 * @by  : Steven Cooks
 * @date: Jun 7, 2015
 *************************************************************************
 * Description: 
 * 
 * Follow up for "Search in Rotated Sorted Array" 
 * 
 * Duplicates are allowed in array.
 * Write a function to determine if a given target is in the array.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/search-in-rotated-sorted-array-ii/ }
 */
package _081_SearchInRotatedSortedArrayII;

/** see test {@link _081_SearchInRotatedSortedArrayII.SolutionTest } */
public class Solution {

    public boolean search(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) {
            return false;
        }
        int left = 0;
        int right = len - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] > nums[right]) {
                // left part is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (nums[mid] < nums[right]) {
                // right part is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else if (nums[left] == nums[mid]) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

}
