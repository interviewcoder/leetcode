/**
 * Time : O(N) ~ O(N^2); Space : O(1)
 * @tag : Divide and Conquer; Heap
 * @by  : Steven Cooks
 * @date: Jul 11, 2015
 *******************************************************************************
 * Description: 
 * 
 * Find the kth largest element in an unsorted array. Note that it is the 
 * kth largest element in the sorted order, not the kth distinct element. 
 * 
 * For example, Given [3,2,1,5,6,4] and k = 2, return 5. 
 * Note: You may assume k is always valid, 1 ≤ k ≤ array's length.
 * 
 *******************************************************************************
 * {@link https://leetcode.com/problems/kth-largest-element-in-an-array/  }
 */
package _215_KthLargestElementInAnArray;

import java.util.Random;

/** see test {@link _215_KthLargestElementInAnArray.SolutionTest } */
public class Solution {
    
    // partition until we find k
    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        while (left <= right) {
            int index = randomPartition(nums, left, right);
            if (index == len - k) {
                return nums[index];
            } else if (index < len - k) {
                left = index + 1;
            } else {
                right = index - 1;
            }
        }
        return -1;
    }

    private int randomPartition(int[] nums, int left, int right) {
        // choose a random index as pivot's position
        int index = left + new Random().nextInt(right - left + 1);
        swap(nums, index, right);
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (nums[j] < nums[right]) {
                swap(nums, ++i, j);
            }
        }
        swap(nums, ++i, right);
        return i;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
