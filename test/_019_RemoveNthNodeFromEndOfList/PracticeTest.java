package _019_RemoveNthNodeFromEndOfList;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.ListNode;

public class PracticeTest {
    
    /** Test method for {@link _019_RemoveNthNodeFromEndOfList.Practice } */
    Practice solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new Practice();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        int n = 2;
        int[] nums = {1, 2, 3, 4, 5};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.removeNthFromEnd(head, n);
        // 1->2->3->5
        int[] exps = {1, 2, 3, 5};
        ListNode expect = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(actual, expect));
    }

    @Test
    public void Test2() {
        int n = 5;
        int[] nums = {1, 2, 3, 4, 5};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.removeNthFromEnd(head, n);
        // 2->3->4->5
        int[] exps = {2, 3, 4, 5};
        ListNode expect = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(actual, expect));
    }

    @Test
    public void Test3() {
        int n = 1;
        int[] nums = {1, 2, 3, 4, 5};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.removeNthFromEnd(head, n);
        int[] exps = {1, 2, 3, 4};
        ListNode expect = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(actual, expect));
    }

    @Test
    public void Test5() {
        int n = 1;
        int[] nums = {1};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.removeNthFromEnd(head, n);
        int[] exps = {};
        ListNode expect = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(actual, expect));
    }

}
