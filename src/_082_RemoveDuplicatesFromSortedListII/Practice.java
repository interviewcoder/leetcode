/**
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
 * @tag : Linked List
 * {@link https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/ }
 */
package _082_RemoveDuplicatesFromSortedListII;

import com.leetcode.ListNode;

/** see test {@link _082_RemoveDuplicatesFromSortedListII.PracticeTest } */
public class Practice {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy;
        ListNode node = pre.next;
        while (node != null) {
            // count the time for each node
            int count = 1;
            while (node.next != null && node.next.val == node.val) {
                count++;
                node = node.next;
            }
            // appear only once ? 
            if (count > 1) {
                pre.next = node.next;
            } else {
                pre = pre.next;
            }
            node = node.next;
        }
        return dummy.next;
    }

}
