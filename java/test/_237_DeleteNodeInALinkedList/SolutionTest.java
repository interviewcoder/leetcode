package _237_DeleteNodeInALinkedList;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.ListNode;

public class SolutionTest {
    
    /** Test method for {@link _237_DeleteNodeInALinkedList.Solution } */
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
    public void Test1() {
        int[] nums = {1, 2, 3, 4};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode node = head.next.next;
        solution.deleteNode(node);
        int[] exps = {1, 2, 4};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(head, expected));
    }

    @Test
    public void Test2() {
        int[] nums = {1, 2, 3, 4};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode node = head;
        solution.deleteNode(node);
        int[] exps = {2, 3, 4};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(head, expected));
    }

    @Test
    public void Test3() {
        int[] nums = {1, 2, 3, 4};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode node = head.next;
        solution.deleteNode(node);
        int[] exps = {1, 3, 4};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(head, expected));
    }


}
