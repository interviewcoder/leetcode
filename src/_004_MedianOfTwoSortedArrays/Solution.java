/**
 * Time : O(log(m + n)) ; Space: O(1)
 * @tag : Divide and Conquer; Array; Binary Search
 * @by  : Steven Cooks
 * @date: Aug 9, 2015
 ***************************************************************************
 * Description:
 * 
 * There are two sorted arrays nums1 and nums2 of size m and n respectively. 
 * Find the median of the two sorted arrays. The overall run time complexity 
 * should be O(log (m+n)). 
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/median-of-two-sorted-arrays/ }
 */
package _004_MedianOfTwoSortedArrays;

/** see test {@link _004_MedianOfTwoSortedArrays.SolutionTest } */
public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        if (len % 2 == 0) {
            return (findKth(nums1, 0, nums2, 0, len / 2) + 
                    findKth(nums1, 0, nums2, 0, len / 2 + 1)) / 2.0;
        } else {
            return findKth(nums1, 0, nums2, 0, len / 2 + 1);
        }

    }

    private double findKth(int[] nums1, int s1, int[] nums2, int s2, int k) {
        if (s1 >= nums1.length) {
            return nums2[s2 + k - 1];
        } else if (s2 >= nums2.length) {
            return nums1[s1 + k - 1];
        } else if (k == 1) {
            return Math.min(nums1[s1], nums2[s2]);
        }
        int k1 = s1 + k / 2 - 1 < nums1.length ? nums1[s1 + k / 2 - 1] : Integer.MAX_VALUE;
        int k2 = s2 + k / 2 - 1 < nums2.length ? nums2[s2 + k / 2 - 1] : Integer.MAX_VALUE;
        if (k1 < k2) {
            return findKth(nums1, s1 + k / 2, nums2, s2, k - k / 2);
        } else {
            return findKth(nums1, s1, nums2, s2 + k / 2, k - k / 2);
        }
    }

}
