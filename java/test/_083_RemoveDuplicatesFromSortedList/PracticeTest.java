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

    @Test
    public void Test3() {
        int[] nums = {1, 1, 1, 1, 1, 1};
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.deleteDuplicates(head);
        int[] exps = {1};
        ListNode expected = ListNode.constructLinkedList(exps);
        System.out.println(actual);
        assertTrue(ListNode.isSameList(expected, actual));
    }

    @Test
    public void Test4() {
        String list = "1 -> 1 -> 1 -> 1 -> 1 -> 1 -> 1 -> 1 -> 1 -> 1 -> 1 -> 1 -> 1 -> 1 -> 1 -> 1 -> 1 -> 1 -> 1 -> 1 -> 1 -> 1 -> 1 -> 1 -> 1 -> 1 -> 1 -> 1 -> 1 -> 1 -> 1 -> 1 -> 1 -> 1 -> 2 -> 2 -> 2 -> 2 -> 2 -> 2 -> 2 -> 2 -> 2 -> 2 -> 2 -> 2 -> 2 -> 2 -> 2 -> 2 -> 2 -> 2 -> 2 -> 2 -> 2 -> 2 -> 2 -> 2 -> 2 -> 2 -> 2 -> 2 -> 2 -> 2 -> 2 -> 2 -> 2 -> 2 -> 2 -> 2 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 3 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 4 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 5 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 6 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 7 -> 8 -> 8 -> 8 -> 8 -> 8 -> 8 -> 8 -> 8 -> 8 -> 8 -> 8 -> 8 -> 8 -> 8 -> 8 -> 8 -> 8 -> 8 -> 8 -> 8 -> 8 -> 8 -> 8 -> 8 -> 8 -> 8 -> 8 -> 8 -> 8 -> 8 -> 8 -> 8 -> 8 -> 8 -> 8 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 10 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 11 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 12 -> 13 -> 13 -> 13 -> 13 -> 13 -> 13 -> 13 -> 13 -> 13 -> 13 -> 13 -> 13 -> 13 -> 13 -> 13 -> 13 -> 13 -> 13 -> 13 -> 13 -> 13 -> 13 -> 13 -> 13 -> 13 -> 13 -> 13 -> 13 -> 13 -> 13 -> 13 -> 13 -> 13 -> 13 -> 13 -> 13 -> 13 -> 14 -> 14 -> 14 -> 14 -> 14 -> 14 -> 14 -> 14 -> 14 -> 14 -> 14 -> 14 -> 14 -> 14 -> 14 -> 14 -> 14 -> 14 -> 14 -> 14 -> 14 -> 14 -> 14 -> 14 -> 14 -> 14 -> 14 -> 14 -> 14 -> 14 -> 14 -> 14 -> 14 -> 14 -> 14 -> 14 -> 14 -> 14 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 15 -> 16 -> 16 -> 16 -> 16 -> 16 -> 16 -> 16 -> 16 -> 16 -> 16 -> 16 -> 16 -> 16 -> 16 -> 16 -> 16 -> 16 -> 16 -> 16 -> 16 -> 16 -> 16 -> 16 -> 16 -> 16 -> 16 -> 16 -> 16 -> 16 -> 16 -> 16 -> 16 -> 16 -> 16 -> 16 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 17 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 18 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 19 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20 -> 20";
        list = list.replace(" ", "");
        String[] nodes = list.split("->");
        int[] nums = new int[nodes.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(nodes[i]);
        }
        ListNode head = ListNode.constructLinkedList(nums);
        ListNode actual = solution.deleteDuplicates(head);
        int[] exps = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
                17, 18, 19, 20 };
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(expected, actual));
    }

}