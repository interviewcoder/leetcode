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
public class SolutionTemplate {
    
    // find the first index i where nums[i] >= n - i
    // invariant: 
    // the first index i where nums[i] >= n - i is within [left : right] if exists 
    public int hIndex(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int left = 0;
        int right = n - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= n - mid) {
                right = mid;
            } else {
                left = mid;
            }
        }

        if (nums[left] >= n - left) {
            return n - left;
        } else if (nums[right] >= n - right) {
            return n - right;
        } else {
            return 0;
        }
    }

}
