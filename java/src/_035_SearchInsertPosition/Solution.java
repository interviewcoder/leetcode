/**
 * Time : O(lgN); Space: O(1)
 * @tag : Array; Binary Search
 * @by  : Steven Cooks
 * @date: May 11, 2015
 *************************************************************************
 * Description: 
 * 
 * Given a sorted array and a target value, return the index if the target 
 * is found. If not, return the index where it would be if it were 
 * inserted in order. 
 * 
 * You may assume no duplicates in the array. 
 * Here are few examples. 
 *  [1,3,5,6], 5 → 2 
 *  [1,3,5,6], 2 → 1 
 *  [1,3,5,6], 7 → 4 
 *  [1,3,5,6], 0 → 0
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/search-insert-position/ }
 */
package _035_SearchInsertPosition;

/** see test {@link _035_SearchInsertPosition.SolutionTest } */
public class Solution {

    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int left = 0;
        int right = len - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                // insert at mid
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        // now left == right
        return nums[left] < target ? left + 1 : left;

    }

}
