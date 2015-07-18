package _092_ReverseLinkedListII;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.ListNode;

public class PracticeTest {
    
    /** Test method for {@link _092_ReverseLinkedListII.Practice } */
    Practice solution;
    
    @Rule
    public Timeout globalTimeout = new Timeout(50);

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
        int m = 2;
        int n = 4;
        int[] nums = {1, 2, 3, 4, 5};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.reverseBetween(head, m, n);
        int[] exps = {1, 4, 3, 2, 5};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(expected, actual));
    }

    @Test
    public void Test2() {
        int m = 1;
        int n = 5;
        int[] nums = {1, 2, 3, 4, 5};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.reverseBetween(head, m, n);
        int[] exps = {5, 4, 3, 2, 1};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(expected, actual));
    }

    @Test
    public void Test3() {
        int m = 1;
        int n = 1;
        int[] nums = {1, 2, 3, 4, 5};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.reverseBetween(head, m, n);
        int[] exps = {1, 2, 3, 4, 5};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(expected, actual));
    }

    @Test
    public void Test4() {
        int m = 5;
        int n = 5;
        int[] nums = {1, 2, 3, 4, 5};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.reverseBetween(head, m, n);
        int[] exps = {1, 2, 3, 4, 5};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(expected, actual));
    }

}