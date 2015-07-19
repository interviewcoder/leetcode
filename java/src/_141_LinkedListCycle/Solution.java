/**
 * Time : O(N); Space: O(1)
 * @tag : Linked List; Two Pointers
 * @date: Jun 18, 2015
 * @by  : Steven Cooks
 * {@link https://leetcode.com/problems/linked-list-cycle/ }
 */
package _141_LinkedListCycle;

import com.leetcode.ListNode;

/** see test {@link _141_LinkedListCycle.SolutionTest } */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            if (fast == slow || fast.next == slow) {
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}
