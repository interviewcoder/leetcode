package _142_LinkedListCycleII;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.ListNode;

public class SolutionTest {
    
    /** Test method for {@link _142_LinkedListCycleII.Solution } */
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
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-2);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;
        ListNode head = n1;
        ListNode actual = solution.detectCycle(head);
        assertEquals(n2, actual);
    }

    @Test
    public void Test2() {
        ListNode n1 = new ListNode(3);
        ListNode head = n1;
        ListNode actual = solution.detectCycle(head);
        assertEquals(null, actual);
    }

    @Test
    public void Test3() {
        ListNode n1 = new ListNode(3);
        n1.next = n1;
        ListNode head = n1;
        ListNode actual = solution.detectCycle(head);
        assertEquals(n1, actual);
    }

    @Test
    public void Test4() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        n3.next = n3;
        ListNode head = n1;
        ListNode actual = solution.detectCycle(head);
        assertEquals(n3, actual);
    }

    @Test
    public void Test5() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        ListNode head = n1;
        ListNode actual = solution.detectCycle(head);
        assertEquals(null, actual);
    }

}
