package _021_MergeTwoSortedLists;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.ListNode;

public class PracticeTest {

    /** Test method for {@link _021_MergeTwoSortedLists.Practice } */
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

    @Test
    public void Test1() {
        ListNode node11 = new ListNode(1);
        ListNode node21 = new ListNode(2);
        ListNode actual = solution.mergeTwoLists(node11, node21);

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        ListNode expect = node1;

        assertTrue(ListNode.isSameList(actual, expect));

    }

    @Test
    public void Test2() {
        ListNode node11 = new ListNode(1);
        ListNode node12 = new ListNode(3);
        ListNode node13 = new ListNode(5);
        node11.next = node12;
        node12.next = node13;
        ListNode node21 = new ListNode(2);
        ListNode node22 = new ListNode(4);
        ListNode node23 = new ListNode(6);
        node21.next = node22;
        node22.next = node23;

        // 1 -> 3 -> 5 \
        // ==> 1->2->3->4->5->6
        // 2 -> 4 -> 6 /
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        ListNode actual = solution.mergeTwoLists(node11, node21);
        ListNode expect = node1;
        assertTrue(ListNode.isSameList(actual, expect));
    }

    @Test
    public void Test3() {
        ListNode node11 = new ListNode(1);
        ListNode node12 = new ListNode(5);
        node11.next = node12;
        ListNode node21 = new ListNode(2);
        ListNode node22 = new ListNode(4);
        ListNode node23 = new ListNode(6);
        node21.next = node22;
        node22.next = node23;

        // 1 -> 5 \
        // ==> 1->2->4->5->6
        // 2 -> 4 -> 6 /
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode actual = solution.mergeTwoLists(node11, node21);
        ListNode expect = node1;
        // System.out.println("expect: " + ListNode.toString(expect));
        // System.out.println("actual: " + ListNode.toString(actual));

        assertTrue(ListNode.isSameList(actual, expect));
    }

    @Test
    public void Test4() {
        ListNode node11 = new ListNode(1);
        ListNode node12 = new ListNode(3);
        ListNode node13 = new ListNode(5);
        node11.next = node12;
        node12.next = node13;
        ListNode node21 = new ListNode(2);
        ListNode node22 = new ListNode(4);
        node21.next = node22;

        // 1 -> 3-> 5 \
        //           ==> 1->2->3->4->5
        // 2 -> 4 /
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode actual = solution.mergeTwoLists(node11, node21);
        ListNode expect = node1;
        // System.out.println("expect: " + ListNode.toString(expect));
        // System.out.println("actual: " + ListNode.toString(actual));

        assertTrue(ListNode.isSameList(actual, expect));

    }

}
