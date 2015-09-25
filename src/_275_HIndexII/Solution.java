/**
 * Time : O(lgN) ; Space: O(1)
 * @tag : Binary Search
 * @by  : Steven Cooks
 * @date: Sep 25, 2015
 ***************************************************************************
 * Description:
 * 
 * Follow up for H-Index: What if the citations array is sorted in ascending 
 * order? Could you optimize your algorithm? 
 * 
 * Hint: Expected runtime complexity is in O(log n) and the input is sorted.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/h-index-ii/ }
 */
package _275_HIndexII;

/** see test {@link _275_HIndexII.SolutionTest } */
public class Solution {
    
    public int hIndex(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int target = n - mid;
            if (nums[mid] == target) {
                return nums[mid];
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return n - right - 1;
    }

}
