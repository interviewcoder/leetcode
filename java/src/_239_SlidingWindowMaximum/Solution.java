/**
 * Time : O(N) ; Space: O(N)
 * @tag : Heap
 * @by  : Steven Cooks
 * @date: Aug 18, 2015
 ***************************************************************************
 * Description:
 * 
 * Given an array nums, there is a sliding window of size k which is moving 
 * from the very left of the array to the very right. You can only see the 
 * k numbers in the window. Each time the sliding window moves right by 
 * one position. 
 * For example, Given nums = [1,3,-1,-3,5,3,6,7], and k = 3. 
 *   Window position                Max
 *   ---------------               -----
 *   [1  3  -1] -3  5  3  6  7       3
 *    1 [3  -1  -3] 5  3  6  7       3
 *    1  3 [-1  -3  5] 3  6  7       5
 *    1  3  -1 [-3  5  3] 6  7       5
 *    1  3  -1  -3 [5  3  6] 7       6
 *    1  3  -1  -3  5 [3  6  7]      7
 * Therefore, return the max sliding window as [3,3,5,5,6,7]. 
 * 
 * Note: 
 * You may assume k is always valid, ie: 1 ≤ k ≤ input array's size for non-empty array. 
 * 
 * Follow up: Could you solve it in linear time?
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/sliding-window-maximum/ }
 */
package _239_SlidingWindowMaximum;

import java.util.Deque;
import java.util.LinkedList;

/** see test {@link _239_SlidingWindowMaximum.SolutionTest } */
public class Solution {

    /**  Keep monotonic deque: containing index, and nums[index] is monotonic in deque*/
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) {
            return new int[]{};
        }
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> indices = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            // swipe elements that are out of window
            if (!indices.isEmpty() && (i - k + 1 > indices.peek())) {
                indices.removeFirst();
            }
            int num = nums[i];
            // meet a global max, clear deque
            if (!indices.isEmpty() && num > nums[indices.peek()]) {
                indices.clear();
                indices.addFirst(i);
            } else {
                // meet local max, remove deque elements to keep monotonic
                while (!indices.isEmpty() && num > nums[indices.getLast()]) {
                    indices.removeLast();
                }
                indices.addLast(i);
            }
            if (i >= k - 1) {
                res[i - k + 1] = nums[indices.peek()];
            }
        }
        return res;
    }

}
