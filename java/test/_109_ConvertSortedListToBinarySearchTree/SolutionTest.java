package _109_ConvertSortedListToBinarySearchTree;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.ListNode;
import com.leetcode.TreeNode;

public class SolutionTest {
    
    /** Test method for {@link _109_ConvertSortedListToBinarySearchTree.Solution } */
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

    //                          3 
    //                        /   \
    // [1->2->3->4->5] ==>   1     4 
    //                        \     \
    //                         2     5
    @Test
    public void Test1() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        ListNode head = n1;

        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode.connect(t3, t1, t4);
        TreeNode.connect(t1, null, t2);
        TreeNode.connect(t4, null, t5);

        TreeNode expected = t3;
        TreeNode actual = solution.sortedListToBST(head);
        assertTrue(TreeNode.isSameTree(actual, expected));
    }

    //   [1]   ==>   1
    @Test
    public void Test2() {
        ListNode head = new ListNode(1);
        TreeNode actual = solution.sortedListToBST(head);
        TreeNode t1 = new TreeNode(1);
        TreeNode expected = t1;
        assertTrue(TreeNode.isSameTree(actual, expected));
    }

    //                       2 
    //                     /   \   
    // [1->2->3->4]  ==>  1     3  
    //                           \
    //                            4
    @Test
    public void Test3() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        ListNode head = n1;

        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode.connect(t2, t1, t3);
        TreeNode.connect(t3, null, t4);

        TreeNode expected = t2;
        TreeNode actual = solution.sortedListToBST(head);
        assertTrue(TreeNode.isSameTree(actual, expected));
    }

    @Test
    public void Test4() {
        TreeNode actual = solution.sortedListToBST(null);
        TreeNode expected = null;
        assertTrue(TreeNode.isSameTree(actual, expected));
    }

}
