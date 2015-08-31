package _002_AddTwoNumbers;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.ListNode;

public class SolutionTest {
    
    /** Test method for {@link _002_AddTwoNumbers.Solution } */
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

    // 342 + 564 = 807
    @Test
    public void Test1() {
        int[] nums1 = {2, 4, 3};
        int[] nums2 = {5, 6, 4};
        ListNode a = ListNode.constructLinkedList(nums1);
        ListNode b = ListNode.constructLinkedList(nums2);
        ListNode actual = solution.addTwoNumbers(a, b);
        int[] exps = {7, 0, 8};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(actual, expected));
        
    }

    // 2 + 499 = 501 
    @Test
    public void Test2() {
        int[] nums1 = {2};
        int[] nums2 = {9, 9, 4};
        ListNode a = ListNode.constructLinkedList(nums1);
        ListNode b = ListNode.constructLinkedList(nums2);
        ListNode actual = solution.addTwoNumbers(a, b);
        int[] exps = {1, 0, 5};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(actual, expected));
        
    }

    // 8 + 2 = 10
    @Test
    public void Test3() {
        int[] nums1 = {2};
        int[] nums2 = {8};
        ListNode a = ListNode.constructLinkedList(nums1);
        ListNode b = ListNode.constructLinkedList(nums2);
        ListNode actual = solution.addTwoNumbers(a, b);
        int[] exps = {0, 1};
        ListNode expected = ListNode.constructLinkedList(exps);
        assertTrue(ListNode.isSameList(actual, expected));
        
    }

}
