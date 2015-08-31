package _141_LinkedListCycle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.ListNode;

public class SolutionTest {
    
    /** Test method for {@link _141_LinkedListCycle.Solution } */
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

    //    1 -> 2 -> 3 -> 4
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
        
        boolean actual = solution.hasCycle(head);
        assertEquals(false, actual);
    }

    //    1 -> 2 -> 3 -> 4
    //    |------<-------|
    @Test
    public void Test2() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n1;
        ListNode head = n1;
        
        boolean actual = solution.hasCycle(head);
        assertEquals(true, actual);
    }

    //    1 -> 2 -> 3 -> 4
    //         |----<----|
    @Test
    public void Test3() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;
        ListNode head = n1;
        
        boolean actual = solution.hasCycle(head);
        assertEquals(true, actual);
    }

    //    1 -> 2 -> 3 -> 4
    //                 /<-\
    @Test
    public void Test4() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n4;
        ListNode head = n1;
        
        boolean actual = solution.hasCycle(head);
        assertEquals(true, actual);
    }

    //    1 
    @Test
    public void Test7() {
        ListNode n1 = new ListNode(1);
        ListNode head = n1;
        boolean actual = solution.hasCycle(head);
        assertEquals(false, actual);
    }

    //    1 
    //  /<-\
    @Test
    public void Test8() {
        ListNode n1 = new ListNode(1);
        n1.next = n1;
        ListNode head = n1;
        boolean actual = solution.hasCycle(head);
        assertEquals(true, actual);
    }

}
