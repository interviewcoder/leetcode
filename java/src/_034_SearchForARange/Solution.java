/**
 * Time : O(lgN); Space: O(N)
 * @tag : Array; Binary Search
 * @date: May 11, 2015
 * @by  : Steven Cooks
 *************************************************************************
 * Description: 
 * 
 * Given a sorted array of integers, find the starting and ending position 
 * of a given target value. 
 * Your algorithm's runtime complexity must be in the order of O(log n). 
 * If the target is not found in the array, return [-1, -1]. 
 * 
 * For example, 
 * Given [5, 7, 7, 8, 8, 10] and target value 8, 
 * return [3, 4].
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/search-for-a-range/ }
 */
package _034_SearchForARange;

/** 
 * @reference {@link https://leetcode.com/discuss/18242/clean-iterative-solution-binary-searches-with-explanation }
 * see test {@link _034_SearchForARange.SolutionTest } */
public class Solution {

    public int[] searchRange(int[] nums, int target) {
        int[] result = { -1, -1 };
        int len = nums.length;
        if (len == 0) {
            return result;
        }
        int start = -1;
        // use binary search to find the left bound of range
        int left = 0;
        int right = len - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int midVal = nums[mid];
            if (midVal == target && (mid == 0 || nums[mid - 1] < target)) {
                // left bound should have the same value as target and 
                // the value to its left (if exists) is smaller than left bound's value
                start = mid;
                result[0] = start;
                break;
            } else if (midVal < target) {
                left = mid + 1;
            } else {
                // (midVal > target || nums[mid - 1] == target)
                right = mid - 1;
            }
        }
        if (start == -1) {
            return result;
        }

        // use binary search to find the right bound of range
        left = start;
        right = len - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int midVal = nums[mid];
            if (midVal == target && (mid == len - 1 || nums[mid + 1] > target)) {
                // mid + 1 is the right bound
                result[1] = mid;
                return result;
            } else if (midVal > target) {
                right = mid - 1;
            } else {
                // there are still elements on the right side that has
                // target value
                left = mid + 1;
            }
        }
        return result;
    }

}
