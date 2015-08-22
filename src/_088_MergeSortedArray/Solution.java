/**
 * Time : O(m + n); Space: O(1)
 * @tag : Array; Two Pointers
 * @date: Jun 12, 2015
 * @by  : Steven Cooks
 *************************************************************************
 * Description: 
 * 
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 
 * as one sorted array. 
 * 
 * Note: 
 * You may assume that nums1 has enough space (size that is greater or equal 
 * to m + n) to hold additional elements from nums2. The number of elements 
 * initialized in nums1 and nums2 are m and n respectively.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/merge-sorted-array/ }
 */
package _088_MergeSortedArray;

/** see test {@link _088_MergeSortedArray.SolutionTest } */
public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mergeIndex = m + n - 1;
        int index1 = m - 1;
        int index2 = n - 1;
        while (index2 >= 0) {
            // when all elements in nums2 are merged, job's done
            if (index1 < 0 || nums2[index2] > nums1[index1]) {
                // choose from B if no element is left in nums1
                // or nums2 has larger element
                nums1[mergeIndex--] = nums2[index2--];
            } else {
                nums1[mergeIndex--] = nums1[index1--];
            }
        }
    }

}
