/**
 * Time : O(NlgK); Space : O(K)
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

import java.util.PriorityQueue;

/** see test {@link _215_KthLargestElementInAnArray.SolutionNlgKTest } */
public class SolutionNlgK {

    // maintain a max-heap with size k, containing the largest k numbers
    public int findKthLargest(int[] nums, int k) {
        // min heap which implements a red-black tree
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num : nums) {
            queue.offer(num);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        return queue.peek();
    }

}
