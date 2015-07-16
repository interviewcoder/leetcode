package _083_RemoveDuplicatesFromSortedList;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.ListNode;

public class PracticeTest {

    /** Test method for {@link _083_RemoveDuplicatesFromSortedList.Practice } */
    Practice solution;
    
    @Rule
    public Timeout globalTimeout = new Timeout(50);

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
        int[] nums = {1, 1, 2};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.deleteDuplicates(head);
        int[] exps = {1, 2};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(expected, actual));
    }

    @Test
    public void Test2() {
        int[] nums = {1, 1, 2, 3, 3};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.deleteDuplicates(head);
        int[] exps = {1, 2, 3};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(expected, actual));
    }

}