package _082_RemoveDuplicatesFromSortedListII;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.ListNode;

public class SolutionTailTest {

    /** Test method for {@link _082_RemoveDuplicatesFromSortedListII.SolutionTail } */
    SolutionTail solution;

    @Rule
    public Timeout globalTimeout = new Timeout(50);

    @Before
    public void setUp() throws Exception {
        solution = new SolutionTail();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        int[] nums = {1, 2, 3, 3, 3, 4, 4, 4, 4, 5};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.deleteDuplicates(head);
        int[] exps = {1, 2, 5};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(expected, actual));
    }

    @Test
    public void Test2() {
        int[] nums = {1, 1, 1, 2, 3};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.deleteDuplicates(head);
        int[] exps = {2, 3};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(expected, actual));
    }

    @Test
    public void Test3() {
        int[] nums = {1, 1, 1, 2};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.deleteDuplicates(head);
        ListNode expected = new ListNode(2);
        assertTrue(ListNode.isSameList(expected, actual));
    }

    @Test
    public void Test4() {
        int[] nums = {1, 2, 2, 2};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.deleteDuplicates(head);
        ListNode e1 = new ListNode(1);
        ListNode expected = e1;
        assertTrue(ListNode.isSameList(expected, actual));
    }

    @Test
    public void Test5() {
        int[] nums = {1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 3};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.deleteDuplicates(head);
        ListNode expected = null;
        assertTrue(ListNode.isSameList(expected, actual));
    }

}