package _160_IntersectionOfTwoLinkedLists;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.ListNode;

public class PracticeTest {
    
    /** Test method for {@link _160_IntersectionOfTwoLinkedLists.Practice } */
    Practice solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new Practice();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    //        a1 -> a2
    //                \
    //                  -> c1 -> c2 -> c3
    //                /
    // b1 -> b2 -> b3 
    @Test
    public void Test1() {
        ListNode a1 = new ListNode(11);
        ListNode a2 = new ListNode(12);
        ListNode b1 = new ListNode(21);
        ListNode b2 = new ListNode(22);
        ListNode b3 = new ListNode(23);
        ListNode c1 = new ListNode(31);
        ListNode c2 = new ListNode(32);
        ListNode c3 = new ListNode(33);
        a1.next = a2;
        a2.next = c1;
        b1.next = b2;
        b2.next = b3;
        b3.next = c1;
        c1.next = c2;
        c2.next = c3;

        ListNode headA = a1;
        ListNode headB = b1;
        ListNode actual = solution.getIntersectionNode(headA, headB);
        ListNode expected = c1;
        assertEquals(expected, actual);
    }

    // b1 -> b2 -> b3 
    //                \
    //                  -> c1 -> c2 -> c3
    //                /
    //       a1 -> a2
    @Test
    public void Test2() {
        ListNode a1 = new ListNode(11);
        ListNode a2 = new ListNode(12);
        ListNode b1 = new ListNode(21);
        ListNode b2 = new ListNode(22);
        ListNode b3 = new ListNode(23);
        ListNode c1 = new ListNode(31);
        ListNode c2 = new ListNode(32);
        ListNode c3 = new ListNode(33);
        a1.next = a2;
        a2.next = c1;
        b1.next = b2;
        b2.next = b3;
        b3.next = c1;
        c1.next = c2;
        c2.next = c3;

        ListNode headA = b1;
        ListNode headB = a1;
        ListNode actual = solution.getIntersectionNode(headA, headB);
        ListNode expected = c1;
        assertEquals(expected, actual);
    }

    //       b1 -> b2  
    //                \
    //                  -> c1 -> c2 -> c3
    //                /
    //       a1 -> a2
    @Test
    public void Test3() {
        ListNode a1 = new ListNode(11);
        ListNode a2 = new ListNode(12);
        ListNode b1 = new ListNode(21);
        ListNode b2 = new ListNode(22);
        ListNode c1 = new ListNode(31);
        ListNode c2 = new ListNode(32);
        ListNode c3 = new ListNode(33);
        a1.next = a2;
        a2.next = c1;
        b1.next = b2;
        b2.next = c1;
        c1.next = c2;
        c2.next = c3;

        ListNode headA = b1;
        ListNode headB = a1;
        ListNode actual = solution.getIntersectionNode(headA, headB);
        ListNode expected = c1;
        assertEquals(expected, actual);
    }

    // b1 -> b2 -> b3 
    // a1 -> a2
    @Test
    public void Test4() {
        ListNode a1 = new ListNode(11);
        ListNode a2 = new ListNode(12);
        ListNode b1 = new ListNode(21);
        ListNode b2 = new ListNode(22);
        ListNode b3 = new ListNode(23);
        a1.next = a2;
        b1.next = b2;
        b2.next = b3;

        ListNode headA = a1;
        ListNode headB = b1;
        ListNode actual = solution.getIntersectionNode(headA, headB);
        ListNode expected = null;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        ListNode headA = null;
        ListNode headB = null;
        ListNode actual = solution.getIntersectionNode(headA, headB);
        ListNode expected = null;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        ListNode headA = null;
        ListNode headB = new ListNode(1);
        ListNode actual = solution.getIntersectionNode(headA, headB);
        ListNode expected = null;
        assertEquals(expected, actual);
    }

}
