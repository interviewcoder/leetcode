/**
 * Time : O(lgN); Space: O(1)
 * @tag : Array; Two Pointers
 * @by  : Steven Cooks
 * @date: May 11, 2015
 *************************************************************************
 * Description: 
 * 
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand. 
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2). 
 * You are given a target value to search. If found in the array return 
 * its index, otherwise return -1. 
 * You may assume no duplicate exists in the array.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/search-in-rotated-sorted-array/ }
 */
package _033_SearchInRotatedSortedArray;

/** see test {@link _033_SearchInRotatedSortedArray.SolutionTest } */
public class Solution {

    public int search(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) {
            return -1;
        }
        int left = 0;
        int right = len - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] == target) {
                // found target
                return mid;
            } else if (nums[mid] < nums[right]) {
                // nums[mid : right] is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                // find part target in nums[left : mid] is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }

}
