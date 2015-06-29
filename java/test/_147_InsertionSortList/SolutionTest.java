package _147_InsertionSortList;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

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

    // 1->2->3->4->5
    @Test
    public void Test1() {
        ListNode head = ListNode.constructLinkedList(new int[]{1, 2, 3, 4, 5});
        ListNode expected = ListNode.constructLinkedList(new int[]{1, 2, 3, 4, 5});
        ListNode actual = solution.insertionSortList(head);
        assertTrue(ListNode.isSameList(expected, actual));
    }

    // 1->5->3->2->4
    @Test
    public void Test2() {
        ListNode head = ListNode.constructLinkedList(new int[]{1, 5, 3, 2, 4});
        ListNode expected = ListNode.constructLinkedList(new int[]{1, 2, 3, 4, 5});
        ListNode actual = solution.insertionSortList(head);
        assertTrue(ListNode.isSameList(expected, actual));
    }

    // 5->4->3->2->1
    @Test
    public void Test3() {
        List<Integer> actuals = Arrays.asList(5, 4, 3, 2, 1);
        ListNode head = ListNode.constructLinkedList(actuals);
        ListNode expected = ListNode.constructLinkedList(Arrays.asList(1, 2, 3, 4, 5));
        ListNode actual = solution.insertionSortList(head);
        assertTrue(ListNode.isSameList(expected, actual));
    }

    // 5
    @Test
    public void Test4() {
        ListNode n1 = new ListNode(5);
        ListNode head = n1;
        ListNode actual = solution.insertionSortList(head);
        ListNode e1 = new ListNode(5);
        ListNode expected = e1;
        assertTrue(ListNode.isSameList(expected, actual));
    }

    // null
    @Test
    public void Test5() {
        ListNode head = null;
        ListNode actual = solution.insertionSortList(head);
        ListNode expected = null;
        assertTrue(ListNode.isSameList(expected, actual));
    }

    // 99->...->1 
    @Test
    public void Test6() {
        int[] acts = new int[100];
        for (int i = 0; i < acts.length; i++) {
            acts[i] = acts.length - 1 - i;
        }
        ListNode head = ListNode.constructLinkedList(acts);
        ListNode actual = solution.insertionSortList(head);
        int[] exps = new int[100];
        for (int i = 0; i < exps.length; i++) {
            exps[i] = i;
        }
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(expected, actual));
    }

}
