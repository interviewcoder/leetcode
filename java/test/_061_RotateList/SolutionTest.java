package _061_RotateList;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.ListNode;

public class SolutionTest {
    
    /** Test method for {@link _061_RotateList.Solution } */
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

    @Test
    public void Test1() {
        int k = 2;
        int[] nums = {1, 2, 3, 4, 5};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.rotateRight(head, k);
        int[] exps = {4, 5, 1, 2, 3};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(actual, expected));
    }

    @Test
    public void Test2() {
        int k = 1;
        int[] nums = {1, 2, 3, 4, 5};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.rotateRight(head, k);
        int[] exps = {5, 1, 2, 3, 4};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(actual, expected));
    }

    @Test
    public void Test3() {
        int k = 3;
        int[] nums = {1, 2, 3, 4, 5};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.rotateRight(head, k);
        int[] exps = {3, 4, 5, 1, 2};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(actual, expected));
    }

    @Test
    public void Test4() {
        int k = 5;
        int[] nums = {1, 2, 3, 4, 5};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.rotateRight(head, k);
        int[] exps = {1, 2, 3, 4, 5};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(actual, expected));
    }

    @Test
    public void Test5() {
        int k = 6;
        int[] nums = {1, 2, 3, 4, 5};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.rotateRight(head, k);
        int[] exps = {5, 1, 2, 3, 4};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(actual, expected));
    }

    @Test
    public void Test6() {
        int k = 6;
        int[] nums = {};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.rotateRight(head, k);
        int[] exps = {};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(actual, expected));
    }

    @Test
    public void Test7() {
        int k = 0;
        int[] nums = {};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.rotateRight(head, k);
        int[] exps = {};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(actual, expected));
    }

    @Test
    public void Test8() {
        int k = 1;
        int[] nums = {1};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.rotateRight(head, k);
        int[] exps = {1};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(actual, expected));
    }

}
