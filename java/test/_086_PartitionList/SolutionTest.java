package _086_PartitionList;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.ListNode;

public class SolutionTest {

    /** Test method for {@link _086_PartitionList.Solution } */
    Solution solution;
    
    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test0() {
        int x = 3;
        ListNode head = new ListNode(1);
        ListNode actual = solution.partition(head, x);
        ListNode expected = new ListNode(1);
        assertTrue(ListNode.isSameList(expected, actual));
    }

    @Test
    public void Test1() {
        int x = 3;
        ListNode head = new ListNode(8);
        ListNode actual = solution.partition(head, x);
        ListNode expected = new ListNode(8);
        assertTrue(ListNode.isSameList(expected, actual));
    }

    @Test
    public void Test2() {
        int x = 3;
        ListNode head = ListNode.constructLinkedList(Arrays.asList(1, 2));
        ListNode expected = ListNode.constructLinkedList(Arrays.asList(1, 2));
        ListNode actual = solution.partition(head, x);
        assertTrue(ListNode.isSameList(expected, actual));
    }

    @Test
    public void Test3() {
        int x = 3;
        ListNode head = ListNode.constructLinkedList(Arrays.asList(6, 2));
        ListNode expected = ListNode.constructLinkedList(Arrays.asList(2, 6));
        ListNode actual = solution.partition(head, x);
        assertTrue(ListNode.isSameList(expected, actual));
    }

    @Test
    public void Test4() {
        int[] nums = {1, 4, 3, 2, 5, 2};
        ListNode head = ListNode.constructLinkedList(nums);
        int x = 3;
        ListNode actual = solution.partition(head, x);
        int[] exps = {1, 2, 2, 4, 3, 5};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(expected, actual));
    }

}