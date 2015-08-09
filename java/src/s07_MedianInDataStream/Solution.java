/**
 * Time : O(NlgN) ; Space: O()
 * @tag : Heap;
 * @by  : Steven Cooks
 * @date: Aug 9, 2015
 ***************************************************************************
 * Description:
 * 
 * Given that integers are read from a data stream. Find median of elements 
 * read so for in efficient way. For simplicity assume there are no duplicates.
 * 
 ***************************************************************************
 * {@link http://www.geeksforgeeks.org/median-of-stream-of-integers-running-integers/ }
 */
package s07_MedianInDataStream;

import java.util.Collections;
import java.util.PriorityQueue;

/** see test {@link s07_MedianInDataStream.SolutionTest } */
public class Solution {

    /**
     * Split array equally into left part (max heap) and right part (min heap).
     * Invariant: peek of left part is sortedNums(mid) and peek of right right
     * is sortedNums(mid + 1). Because we don't care order inside left part and
     * right part, in this way we can save time for sorting.
     * 
     * Time: O(lgN) for each insertion, and O(1) get median number
     */
    public double findMedian(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } 

        // all elements in max heap should be smaller than those in min heap
        PriorityQueue<Integer> left = new PriorityQueue<>(
                Collections.reverseOrder());
        PriorityQueue<Integer> right = new PriorityQueue<>();

        for (int num : nums) {
            int diff = right.size() - left.size();
            if (diff == 1) {
                // left part should have one more number 
                if (!right.isEmpty() && num > right.peek()) {
                    // add current into right part and insert right's peek to left part
                    right.offer(num);
                    left.offer(right.poll());
                } else {
                    left.offer(num);
                }
            } else {
                // right part should have one more number
                if (!left.isEmpty() && num < left.peek()) {
                    left.offer(num);
                    right.offer(left.poll());
                } else {
                    right.offer(num);
                }
            }
        }
        double median = right.peek();
        if (!left.isEmpty() && left.size() == right.size()) {
            median = (median + left.peek()) / 2.0;
        }
        return median;
    }

}
