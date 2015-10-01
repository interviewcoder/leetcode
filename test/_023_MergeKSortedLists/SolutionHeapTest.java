package _023_MergeKSortedLists;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.ListNode;

public class SolutionHeapTest {
    
    /** Test method for {@link _023_MergeKSortedLists.SolutionHeap } */
    SolutionHeap solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new SolutionHeap();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        ListNode[] lists = {};
        ListNode actual = solution.mergeKLists(lists);
        ListNode expected = null;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        ListNode h1 = ListNode.constructLinkedList(Arrays.asList(1, 3, 5));
        ListNode h2 = ListNode.constructLinkedList(Arrays.asList(2, 4, 6));
        ListNode[] lists = {h1, h2};
        ListNode actual = solution.mergeKLists(lists);
        ListNode expected = ListNode.constructLinkedList(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertTrue(ListNode.isSameList(actual, expected));
    }

    @Test
    public void Test3() {
        ListNode h1 = ListNode.constructLinkedList(Arrays.asList(-2, -1, -1, -1));
        ListNode h2 = null;
        ListNode[] lists = {h1, h2};
        ListNode actual = solution.mergeKLists(lists);
        ListNode expected = ListNode.constructLinkedList(Arrays.asList(-2, -1, -1, -1));
        assertTrue(ListNode.isSameList(actual, expected));
    }

    @Test
    public void Test4() {
        ListNode h1 = ListNode.constructLinkedList(Arrays.asList(3));
        ListNode h2 = ListNode.constructLinkedList(Arrays.asList(1));
        ListNode[] lists = {h1, h2};
        ListNode actual = solution.mergeKLists(lists);
        ListNode expected = ListNode.constructLinkedList(Arrays.asList(1, 3));
        assertTrue(ListNode.isSameList(actual, expected));
    }

    @Test
    public void Test5() {
        ListNode h1 = ListNode.constructLinkedList(Arrays.asList(3));
        ListNode[] lists = {h1};
        ListNode actual = solution.mergeKLists(lists);
        ListNode expected = ListNode.constructLinkedList(Arrays.asList(3));
        assertTrue(ListNode.isSameList(actual, expected));
    }

}
