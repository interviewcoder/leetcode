/**
 *************************************************************************
 * Description: 
 * 
 * Merge two sorted linked lists and return it as a new list. The new list 
 * should be made by splicing together the nodes of the first two lists.
 * 
 *************************************************************************
 * @tag : Linked List
 * {@link https://leetcode.com/problems/merge-two-sorted-lists/  }
 */
package _021_MergeTwoSortedLists;

import com.leetcode.ListNode;

/** see test {@link _021_MergeTwoSortedLists.PracticeTest } */
public class Practice {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode h1 = l1;
        ListNode h2 = l2;
        ListNode node = dummy;
        // merge until one list is finished
        while (h1 != null && h2 != null) {
            if (h1.val < h2.val) {
                // merge node from list1
                node.next = h1;
                h1 = h1.next;
            } else {
                node.next = h2;
                h2 = h2.next;
            }
            node = node.next;
        }
        // append the remaining part
        node.next = (h1 != null) ? h1 : h2;
        return dummy.next;
    }

}
