/**
 * Time : O(M + N); Space: O(1)
 * @tag : Linked List
 * @by  : Steven Cooks
 * @date: May 6, 2015
 *************************************************************************
 * Description: 
 * 
 * Merge two sorted linked lists and return it as a new list. The new list 
 * should be made by splicing together the nodes of the first two lists.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/merge-two-sorted-lists/  }
 */
package _021_MergeTwoSortedLists;

import com.leetcode.ListNode;

/** see test {@link _021_MergeTwoSortedLists.SolutionTest } */
public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(-1);
        ListNode node = dummyHead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                node.next = l1;
                l1 = l1.next;
            } else {
                node.next = l2;
                l2 = l2.next;
            }
            node = node.next;
        }
        // append the remaining list
        node.next = (l1 != null) ? l1 : l2;
        return dummyHead.next;
    }

}
