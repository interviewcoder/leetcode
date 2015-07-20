package _024_SwapNodesInPairs;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.ListNode;

public class SolutionTest {
    
    /** Test method for {@link _024_SwapNodesInPairs.Solution } */
    Solution solution;

    @Rule
    public Timeout globalTimeout = new Timeout(50);

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        int[] nums = {1, 2, 3, 4};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.swapPairs(head);
        int[] exps = {2, 1, 4, 3};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(actual, expected));
    }

    @Test
    public void Test2() {
        int[] nums = {1, 2, 3};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.swapPairs(head);
        int[] exps = {2, 1, 3};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(actual, expected));
    }

    @Test
    public void Test3() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.swapPairs(head);
        int[] exps = {2, 1, 4, 3, 6, 5, 8, 7, 10, 9};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(actual, expected));
    }

}
