/**
 * Time : O(N) ; Space: O(1)
 * @tag : Linked List
 * @by  : Steven Cooks
 * @date: Jun 7, 2015
 *************************************************************************
 * Description: 
 * 
 * Given a sorted linked list, delete all nodes that have duplicate numbers, 
 * leaving only distinct numbers from the original list. 
 * 
 * For example, 
 * Given 1->2->3->3->4->4->5, return 1->2->5. 
 * Given 1->1->1->2->3, return 2->3.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/ }
 */
package _082_RemoveDuplicatesFromSortedListII;

import com.leetcode.ListNode;

/** see test {@link _082_RemoveDuplicatesFromSortedListII.SolutionTest } */
public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prePre = dummy;
        ListNode pre = head;
        boolean duplicated = false;
        int duplicateVal = head.val;

        while (pre.next != null) {
            ListNode node = pre.next;
            if (node.val == duplicateVal) {
                // duplicate appears
                duplicated = true;
                pre.next = node.next;
            } else {
                duplicateVal = node.val;
                if (duplicated == true) {
                    // delete the very first duplicated node at position pre
                    prePre.next = node;
                    pre = prePre.next;
                } else {
                    pre = pre.next;
                    prePre = prePre.next;
                }
                duplicated = false;
            }
        }
        if (duplicated) {
            prePre.next = null;
            pre = null;
        }
        return dummy.next;
    }

}
