package com.leetcode;

import java.util.List;

/**
 * For problems:
 * <p>{@link _021_MergeTwoSortedLists [021]Merge Two Sorted Lists}
 * <p>{@link _203_RemoveLinkedListElements [203]Remove Linked List Elements}
 */
public class ListNode {

    public int val;

    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        ListNode node = next;
        String str = "[" + val;
        while (node != null) {
            str += "->" + node.val;
            node = node.next;
        }
        str += "]";
        return str;
    }

    public static String toString(ListNode head) {
        String result = "";
        ListNode h = head;
        while (h != null) {
            if (h.next != null) {
                result += h.val + "->";
            } else {
                result += h.val;
            }
            h = h.next;
        }
        return result;
    }

    public static boolean isSameList(ListNode head1, ListNode head2) {
        if (head1 == null && head2 == null) {
            return true;
        }
        if (head1 == null && head2 != null) {
            return false;
        }
        if (head2 == null && head1 != null) {
            return false;
        }
        return (head1.val == head2.val) && isSameList(head1.next, head2.next);
    }

    /**
     * Construct a linked list using given integer list.
     * 
     * @param nums
     * @return head node of the constructed list
     */
    public static ListNode constructLinkedList(List<Integer> nums) {
        ListNode dummy = new ListNode(-1);
        ListNode node = dummy;
        for (Integer number : nums) {
            node.next = new ListNode(number);
            node = node.next;
        }
        return dummy.next;
    }
    
    /**
     * Construct a linked list using given integer array.
     * 
     * @param nums
     * @return head node of the constructed list
     */
    public static ListNode constructLinkedList(int[] nums) {
        ListNode dummy = new ListNode(-1);
        ListNode node = dummy;
        for (int num: nums) {
            node.next = new ListNode(num);
            node = node.next;
        }
        return dummy.next;
    }
    

    // 1->2->3->4->5
    public static ListNode getList1() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        ListNode head = n1;
        return head;
    }

    // 1->5->3->2->4
    public static ListNode getList2() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(5);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(2);
        ListNode n5 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        ListNode head = n1;
        return head;
    }

    // 5->4->3->2->1
    public static ListNode getList3() {
        ListNode n1 = new ListNode(5);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(2);
        ListNode n5 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        ListNode head = n1;
        return head;
    }

}
