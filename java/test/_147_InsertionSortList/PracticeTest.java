package _147_InsertionSortList;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.ListNode;

public class PracticeTest {
    
    /** Test method for {@link _147_InsertionSortList.Practice} */
    Practice solution;

    @Rule
    public Timeout globalTimeout = new Timeout(20);

    @Before
    public void setUp() throws Exception {
        solution = new Practice();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    // 1->2->3->4->5
    @Test
    public void Test1() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        ListNode head = n1;
        ListNode actual = solution.insertionSortList(head);

        ListNode e1 = new ListNode(1);
        ListNode e2 = new ListNode(2);
        ListNode e3 = new ListNode(3);
        ListNode e4 = new ListNode(4);
        e1.next = e2;
        e2.next = e3;
        e3.next = e4;
        ListNode expected = e1;

        assertTrue(ListNode.isSameList(expected, actual));
        
    }

    // 1->5->3->2->4
    @Test
    public void Test2() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(5);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(2);
        ListNode n5 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        ListNode head = n1;
        ListNode actual = solution.insertionSortList(head);

        ListNode e1 = new ListNode(1);
        ListNode e2 = new ListNode(2);
        ListNode e3 = new ListNode(3);
        ListNode e4 = new ListNode(4);
        ListNode e5 = new ListNode(5);
        e1.next = e2;
        e2.next = e3;
        e3.next = e4;
        e4.next = e5;
        ListNode expected = e1;

        assertTrue(ListNode.isSameList(expected, actual));
        
    }

    // 5->4->3->2->1
    @Test
    public void Test3() {
        ListNode n1 = new ListNode(5);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(2);
        ListNode n5 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        ListNode head = n1;
        ListNode actual = solution.insertionSortList(head);

        ListNode e1 = new ListNode(1);
        ListNode e2 = new ListNode(2);
        ListNode e3 = new ListNode(3);
        ListNode e4 = new ListNode(4);
        ListNode e5 = new ListNode(5);
        e1.next = e2;
        e2.next = e3;
        e3.next = e4;
        e4.next = e5;
        ListNode expected = e1;

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
