/**
 * Time : O(N); Space: O(1)
 * @tag : Linked List; Sort
 * @date: Jun 20, 2015
 * @by  : Steven Cooks
 ****************************************************************
 * Description: 
 * 
 * Sort a linked list using insertion sort.
 *  
 ****************************************************************
 * {@link https://leetcode.com/problems/insertion-sort-list/ }
 */
package _147_InsertionSortList;

import com.leetcode.ListNode;

/** see test {@link _147_InsertionSortList.SolutionTest } */
public class Solution {

    // insert node from the list into the newly constructed list.
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode listHead = head;
        ListNode node = dummy;
        // insert each node from head list
        while (listHead != null) {
            node = dummy;
            while (node.next != null && node.next.val < listHead.val) {
                node = node.next;
            }
            // l1:       insert(listHead) --------> listHead.next
            // l2:  node  --------->  node.next
            // keep the head of l1 and move its head to its next node
            // then insert the original head between 'node' and 'node.next'
            ListNode insert = listHead;
            listHead = listHead.next;
            insert.next = node.next;
            node.next = insert;
        }
        return dummy.next;
    }

}
