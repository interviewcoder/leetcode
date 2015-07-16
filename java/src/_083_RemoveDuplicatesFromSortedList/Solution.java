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

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        int duplicate = head.val;
        ListNode pre = head;

        while (pre.next != null) {
            ListNode node = pre.next;
            if (node.val == duplicate) {
                // duplicate appears
                pre.next = node.next;
            } else {
                duplicate = node.val;
                pre = pre.next;
            }
        }

        return dummy.next;
    }

}
