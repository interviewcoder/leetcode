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

    ListNode head;

    @Rule
    public Timeout globalTimeout = new Timeout(20);

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
        // List: 1->2->3->4->5
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        head = node1;
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
        head = null;
    }

    @Test
    public void Test1() {
        int k = 2;
        ListNode actual = solution.rotateRight(head, k);
        ListNode expect1 = new ListNode(4);
        ListNode expect2 = new ListNode(5);
        ListNode expect3 = new ListNode(1);
        ListNode expect4 = new ListNode(2);
        ListNode expect5 = new ListNode(3);
        expect1.next = expect2;
        expect2.next = expect3;
        expect3.next = expect4;
        expect4.next = expect5;
        ListNode expected = expect1;
        assertTrue(ListNode.isSameList(actual, expected));
    }

    @Test
    public void Test2() {
        int k = 1;
        ListNode actual = solution.rotateRight(head, k);
        ListNode expect1 = new ListNode(5);
        ListNode expect2 = new ListNode(1);
        ListNode expect3 = new ListNode(2);
        ListNode expect4 = new ListNode(3);
        ListNode expect5 = new ListNode(4);
        expect1.next = expect2;
        expect2.next = expect3;
        expect3.next = expect4;
        expect4.next = expect5;
        ListNode expected = expect1;
        assertTrue(ListNode.isSameList(actual, expected));
    }

    @Test
    public void Test3() {
        int k = 3;
        ListNode actual = solution.rotateRight(head, k);
        ListNode expect1 = new ListNode(3);
        ListNode expect2 = new ListNode(4);
        ListNode expect3 = new ListNode(5);
        ListNode expect4 = new ListNode(1);
        ListNode expect5 = new ListNode(2);
        expect1.next = expect2;
        expect2.next = expect3;
        expect3.next = expect4;
        expect4.next = expect5;
        ListNode expected = expect1;
        assertTrue(ListNode.isSameList(actual, expected));
    }

    @Test
    public void Test4() {
        int k = 5;
        ListNode actual = solution.rotateRight(head, k);
        ListNode expect1 = new ListNode(1);
        ListNode expect2 = new ListNode(2);
        ListNode expect3 = new ListNode(3);
        ListNode expect4 = new ListNode(4);
        ListNode expect5 = new ListNode(5);
        expect1.next = expect2;
        expect2.next = expect3;
        expect3.next = expect4;
        expect4.next = expect5;
        ListNode expected = expect1;
        // System.out.println(ListNode.toString(expected));
        // System.out.println(ListNode.toString(actual));
        assertTrue(ListNode.isSameList(actual, expected));
    }

    @Test
    public void Test5() {
        int k = 6;
        ListNode actual = solution.rotateRight(head, k);
        ListNode expect1 = new ListNode(5);
        ListNode expect2 = new ListNode(1);
        ListNode expect3 = new ListNode(2);
        ListNode expect4 = new ListNode(3);
        ListNode expect5 = new ListNode(4);
        expect1.next = expect2;
        expect2.next = expect3;
        expect3.next = expect4;
        expect4.next = expect5;
        ListNode expected = expect1;
        assertTrue(ListNode.isSameList(actual, expected));
    }

    @Test
    public void Test6() {
        int k = 6;
        ListNode actual = solution.rotateRight(head, k);
        ListNode expect1 = new ListNode(5);
        ListNode expect2 = new ListNode(1);
        ListNode expect3 = new ListNode(2);
        ListNode expect4 = new ListNode(3);
        ListNode expect5 = new ListNode(4);
        expect1.next = expect2;
        expect2.next = expect3;
        expect3.next = expect4;
        expect4.next = expect5;
        ListNode expected = expect1;
        assertTrue(ListNode.isSameList(actual, expected));
    }

}
