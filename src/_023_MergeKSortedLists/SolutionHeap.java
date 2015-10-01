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
import java.util.Queue;

import com.leetcode.ListNode;

/** see test {@link _023_MergeKSortedLists.SolutionHeapTest } */
public class SolutionHeap {

    // For next number, we want to find the smallest number from k lists' heads.
    // The best data structure to know max/min from k elements is heap
    public ListNode mergeKLists(ListNode[] lists) {  
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        
        // stores head node of k merging lists
        Queue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        
        // push all heads into queue
        for (ListNode head : lists) {
            if (head != null) {
                queue.add(head);        
            }
        }
        
        // choose next node from k candidates
        while (!queue.isEmpty()) {
            ListNode cur = queue.poll();
            node.next = cur;
            if (cur.next != null) {
                queue.add(cur.next);
            }
            node = node.next;
        }
        return dummy.next; 
    }

}
