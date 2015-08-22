/**
 * Time : O(N); Space: O(1)
 * @tag : Linked List
 * @by  : Steven Cooks
 * @date: Jun 8, 2015
 *************************************************************************
 * Description: 
 * 
 * Given a sorted linked list, delete all duplicates such that each 
 * element appear only once. 
 * 
 * For example, 
 *  Given 1->1->2, return 1->2. 
 *  Given 1->1->2->3->3, return 1->2->3.
 *  
 *************************************************************************
 * {@link https://leetcode.com/problems/remove-duplicates-from-sorted-list/ }
 */
package _083_RemoveDuplicatesFromSortedList;

import com.leetcode.ListNode;

/** see test {@link _083_RemoveDuplicatesFromSortedList.SolutionTest } */
public class Solution {

    /**
     * If a node has the same value as its next node, then connect this
     * node with its next's next. Otherwise, move node to its next.
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode node = head;
        while (node != null) {
            if (node.next != null && node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return dummy.next;
    }

}
