package _206_ReverseLinkedList;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.ListNode;

public class SolutionRecursiveTest {
    
    /** Test method for {@link _206_ReverseLinkedList.SolutionRecursive } */
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
    public void Test1() {
        int[] nums = {};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.reverseList(head);
        int[] exps = {};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(expected, actual));
    }

    // 1
    @Test
    public void Test2() {
        int[] nums = {1};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.reverseList(head);
        int[] exps = {1};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(expected, actual));
    }

    // 1->2->3->4 
    @Test
    public void Test3() {
        int[] nums = {1, 2, 3, 4};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.reverseList(head);
        int[] exps = {4, 3, 2, 1};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(expected, actual));
    }

    // 4->3->2->1
    @Test
    public void Test4() {
        int[] nums = {4, 3, 2, 1};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.reverseList(head);
        int[] exps = {1, 2, 3, 4};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(expected, actual));
    }

    // 1->1->1->1
    @Test
    public void Test5() {
        int[] nums = {1, 1, 1, 1};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.reverseList(head);
        int[] exps = {1, 1, 1, 1};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(expected, actual));
    }

    // 1->1->2->2->2
    @Test
    public void Test6() {
        int[] nums = {1, 1, 2, 2, 2};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.reverseList(head);
        int[] exps = {2, 2, 2, 1, 1};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(expected, actual));
    }


    // 1->2->3...->99->100
    @Test
    public void Test7() {
        int n = 100;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i;
        }
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.reverseList(head);
        int[] exps = new int[n]; 
        for (int i = 0; i < n; i++) {
            exps[i] = n - i - 1;
        }
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(expected, actual));
    }

}
