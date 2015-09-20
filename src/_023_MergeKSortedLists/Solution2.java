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

import java.util.Comparator;
import java.util.PriorityQueue;

import com.leetcode.ListNode;

/** see test {@link _023_MergeKSortedLists.Solution2Test } */
public class Solution2 {

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(
                new Comparator<ListNode>() {

                    @Override
                    public int compare(ListNode o1, ListNode o2) {
                        if (o1 == null && o2 == null) {
                            return 0;
                        } else if (o1 == null) {
                            return -1;
                        } else if (o2 == null) {
                            return 1;
                        } else {
                            return o1.val - o2.val;
                        }
                    }

                });

        for (ListNode head : lists) {
            ListNode node = head;
            while (node != null) {
                queue.offer(node);
                node = node.next;
            }
        }

        ListNode cur = dummy;
        while (!queue.isEmpty()) {
            ListNode node = queue.poll();
            node.next = null;
            cur.next = node;
            cur = cur.next;
        }
        return dummy.next;
    }

}
