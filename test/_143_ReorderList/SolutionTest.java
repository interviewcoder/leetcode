package _143_ReorderList;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.ListNode;

public class SolutionTest {
    
    /** Test method for {@link _143_ReorderList.Solution } */
    Solution solution;

    @Rule
    public Timeout globalTimeout = new Timeout(500);

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
        solution.reorderList(head);
        int[] exps = {1, 4, 2, 3};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(head, expected));
    }

    @Test
    public void Test2() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        ListNode head = ListNode.constructLinkedList(nums);
        solution.reorderList(head);
        int[] exps = {1, 8, 2, 7, 3, 6, 4, 5};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(head, expected));
    }

    @Test
    public void Test3() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ListNode head = ListNode.constructLinkedList(nums);
        solution.reorderList(head);
        int[] exps = {1, 9, 2, 8, 3, 7, 4, 6, 5};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(head, expected));
    }

}
