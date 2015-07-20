/**
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
 * @tag : Linked List
 * {@link https://leetcode.com/problems/remove-duplicates-from-sorted-list/ }
 */
package _083_RemoveDuplicatesFromSortedList;

import com.leetcode.ListNode;

/** see test {@link _083_RemoveDuplicatesFromSortedList.PracticeTest } */
public class Practice {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode node = dummy.next;
        while (node != null) {
            // until we find the next node that has unique value
            ListNode nextUnique = node.next;
            while (nextUnique != null && nextUnique.val == node.val) {
                nextUnique = nextUnique.next;
            }
            node.next = nextUnique;
            node = node.next;
        }
        return dummy.next;
    }

}
