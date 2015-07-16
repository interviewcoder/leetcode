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

/** see test {@link _034_SearchForARange.SolutionTest } */
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;

        // {-1,-1} means not found
        int[] result = { -1, -1 };

        if (len == 0) {
            return result;
        }

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                // target found!
                // search towards left and right to find all duplicates
                int head = mid;
                while (head >= left && nums[head] == target) {
                    head--;
                }
                int tail = mid;
                while (tail <= right && nums[tail] == target) {
                    tail++;
                }
                result[0] = head + 1;
                result[1] = tail - 1;
                break;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
