package _148_SortList;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.ListNode;

public class SolutionTest {
    
    /** Test method for {@link _148_SortList.Solution } */
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
        int[] nums = {};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.sortList(head);
        int[] exps = {};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(actual, expected));
    }

    @Test
    public void Test2() {
        int[] nums = {2};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.sortList(head);
        int[] exps = {2};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(actual, expected));
    }

    @Test
    public void Test3() {
        int[] nums = {1, 2, 3, 4, 5, 6};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.sortList(head);
        int[] exps = {1, 2, 3, 4, 5, 6};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(actual, expected));
    }

    @Test
    public void Test4() {
        int[] nums = {5, 4, 3, 2, 1};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.sortList(head);
        int[] exps = {1, 2, 3, 4, 5};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(actual, expected));
    }

    @Test
    public void Test5() {
        int[] nums = {4, 6, 2, 7, 91, 1, 10, 23, 5, 5};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.sortList(head);
        int[] exps = {1, 2, 4, 5, 5, 6, 7, 10, 23, 91};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(actual, expected));
    }

    @Test
    public void Test6() {
        int[] nums = {5, 1, 3, 4, 2};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.sortList(head);
        int[] exps = {1, 2, 3, 4, 5};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(actual, expected));
    }

}
