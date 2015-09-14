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

    /**
     * Keep monotonic deque: containing index, and nums[index] is monotonic in
     * deque peek element is the index of the max number in current sliding
     * window and the numbers that indices in this deque represents are in
     * non-ascending order
     * */
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) {
            return new int[]{};
        }
        int[] res = new int[n - k + 1];
        // peek element is the index of the max number in current sliding window
        // and the numbers that indices in this deque represents are in non-ascending order
        Deque<Integer> descendIndices = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int window = i - k + 1;
            // poll elements out of current window
            while (!descendIndices.isEmpty() && descendIndices.peekFirst() < i - k + 1) {
                descendIndices.removeFirst();
            }
            // build descending indices
            while (!descendIndices.isEmpty() && nums[descendIndices.peekLast()] < num) {
                descendIndices.removeLast();
            }
            descendIndices.addLast(i);
            if (window >= 0) {
                res[window] = nums[descendIndices.peekFirst()];
            }
        }
        return res;
    }

}
