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

/** see test {@link _021_MergeTwoSortedLists.SolutionRecursiveTest} */
public class SolutionRecursive {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // base case
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        // recursive case: consider the first step
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

}
