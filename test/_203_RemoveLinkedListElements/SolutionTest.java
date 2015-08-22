package _203_RemoveLinkedListElements;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.ListNode;

public class SolutionTest {
    
    Solution solution;

    @Rule
    public Timeout globalTimeout = new Timeout(20);

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    //     null, val = 6
    // ==> null
    @Test
    public void Test0() {
        int[] nums = {};
        ListNode head = ListNode.constructLinkedList(nums);
        int val = 6;
        ListNode actual = solution.removeElements(head, val);
        int[] exps = {};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(expected, actual));
    }

    //     1->2->6->3->4->5->6, val = 6
    // ==> 1->2->3->4->5
    @Test
    public void Test1() {
        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode head = ListNode.constructLinkedList(nums);
        int val = 6;
        ListNode actual = solution.removeElements(head, val);
        int[] exps = {1, 2, 3, 4, 5};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(expected, actual));
    }

    //     1->1->1->1, val = 1
    // ==> null
    @Test
    public void Test2() {
        int[] nums = {1, 1, 1, 1};
        ListNode head = ListNode.constructLinkedList(nums);
        int val = 1;
        ListNode actual = solution.removeElements(head, val);
        int[] exps = {};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(expected, actual));
    }

    //     1->1->2->3, val = 1
    // ==> 2->3 
    @Test
    public void Test3() {
        int[] nums = {1, 1, 2, 3};
        ListNode head = ListNode.constructLinkedList(nums);
        int val = 1;
        ListNode actual = solution.removeElements(head, val);
        int[] exps = {2, 3};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(expected, actual));
    }

    //     1->1->2->3, val = 2 
    // ==> 1->1->3
    @Test
    public void Test4() {
        int[] nums = {1, 1, 2, 3};
        ListNode head = ListNode.constructLinkedList(nums);
        int val = 2;
        ListNode actual = solution.removeElements(head, val);
        int[] exps = {1, 1, 3};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(expected, actual));
    }

}
