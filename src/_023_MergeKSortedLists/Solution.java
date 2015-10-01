/**
 * Time : O(NlgN) ; Space: O(N)
 * @tag : Divide and Conquer; Linked List; Heap
 * @by  : Steven Cooks
 * @date: Sep 1, 2015
 ***************************************************************************
 * Description:
 *
 * Merge k sorted linked lists and return it as one sorted list. Analyze 
 * and describe its complexity.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/merge-k-sorted-lists/ }
 */
package _023_MergeKSortedLists;

import com.leetcode.ListNode;

/** see test {@link _023_MergeKSortedLists.SolutionTest } */
public class Solution {

    // divide and conquer, merge two lists at one time
    public ListNode mergeKLists(ListNode[] lists) {  
        return mergeKLists(lists, 0, lists.length - 1);
    }

    // divide and conquer
    private ListNode mergeKLists(ListNode[] lists, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            return mergeTwo(mergeKLists(lists, left, mid), mergeKLists(lists, mid + 1, right));
        } else if (left == right) {
            return lists[left];
        } else {
            return null;
        }
    }

    // merge two lists
    private ListNode mergeTwo(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        cur.next = list1 != null ? list1 : list2;
        return dummy.next;
    }

}
