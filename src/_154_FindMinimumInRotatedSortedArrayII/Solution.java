/**
 * Time : O(N) ; Space: O()
 * @tag : Array; Binary Search
 * @by  : Steven Cooks
 * @date: Aug 25, 2015
 ***************************************************************************
 * Description:
 * 
 * Follow up for "Find Minimum in Rotated Sorted Array": 
 * What if duplicates are allowed? 
 * 
 * Would this affect the run-time complexity? How and why? 
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand. 
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2). 
 * 
 * Find the minimum element. The array may contain duplicates.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/ }
 */
package _154_FindMinimumInRotatedSortedArrayII;

/** see test {@link _154_FindMinimumInRotatedSortedArrayII.SolutionTest } */
public class Solution {

    public int findMin(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else if (nums[mid] < nums[right]) {
                // nums[mid] < nums[right], so mid might be the result
                right = mid;
            } else {
                // nums[mid] == nums[right]
                right--;
            }
        }
        return nums[left];
    }

}
