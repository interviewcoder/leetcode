package _021_MergeTwoSortedLists;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.ListNode;

public class SolutionRecursiveTest {

    /** Test method for {@link _021_MergeTwoSortedLists.SolutionRecursive } */
    SolutionRecursive solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new SolutionRecursive();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test0() {
        ListNode node11 = null;
        ListNode node21 = null;
        ListNode actual = solution.mergeTwoLists(node11, node21);
        ListNode expect = null;
        assertTrue(ListNode.isSameList(actual, expect));
    }

    @Test
    public void Test1() {
        ListNode node11 = new ListNode(1);
        ListNode node21 = new ListNode(2);
        ListNode actual = solution.mergeTwoLists(node11, node21);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        ListNode expect = node1;
        assertTrue(ListNode.isSameList(actual, expect));
    }

    // 1 -> 3 -> 5 \
    //              ==> 1->2->3->4->5->6
    // 2 -> 4 -> 6 /
    @Test
    public void Test2() {
        int[] nums1 = {1, 3, 5};
        ListNode l1 = ListNode.constructLinkedList(nums1);
        int[] nums2 = {2, 4, 6};
        ListNode l2 = ListNode.constructLinkedList(nums2);
        ListNode actual = solution.mergeTwoLists(l1, l2);

        int[] exps = {1, 2, 3, 4, 5, 6};
        ListNode expected = ListNode.constructLinkedList(exps);

        assertTrue(ListNode.isSameList(actual, expected));
    }

    // 1 -> 5 \
    //            ==> 1->2->4->5->6
    // 2 -> 4 -> 6 /
    @Test
    public void Test3() {
        int[] nums1 = {1, 5};
        ListNode l1 = ListNode.constructLinkedList(nums1);
        int[] nums2 = {2, 4, 6};
        ListNode l2 = ListNode.constructLinkedList(nums2);
        ListNode actual = solution.mergeTwoLists(l1, l2);
        int[] exps = {1, 2, 4, 5, 6};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(actual, expected));
    }

    // 1 -> 3-> 5 \
    //           ==> 1->2->3->4->5
    // 2 -> 4 /
    @Test
    public void Test4() {
        int[] nums1 = {1, 3, 5};
        ListNode l1 = ListNode.constructLinkedList(nums1);
        int[] nums2 = {2, 4};
        ListNode l2 = ListNode.constructLinkedList(nums2);
        ListNode actual = solution.mergeTwoLists(l1, l2);
        int[] exps = {1, 2, 3, 4, 5};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(actual, expected));
    }

}
