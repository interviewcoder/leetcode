package _109_ConvertSortedListToBinarySearchTree;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.ListNode;
import com.leetcode.TreeNode;

public class SolutionRecursiveTest {
    
    /** Test method for {@link _109_ConvertSortedListToBinarySearchTree.SolutionRecursive } */
    SolutionRecursive solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new SolutionRecursive();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    // null
    @Test
    public void Test0() {
        TreeNode actual = solution.sortedListToBST(null);
        TreeNode expected = null;
        assertTrue(TreeNode.isSameTree(actual, expected));
    }

    //   [1]   ==>   1
    @Test
    public void Test1() {
        ListNode head = ListNode.constructLinkedList(Arrays.asList(1));
        TreeNode actual = solution.sortedListToBST(head);
        TreeNode t1 = new TreeNode(1);
        TreeNode expected = t1;
        assertTrue(TreeNode.isSameTree(actual, expected));
    }

    //   [1, 2]   ==>   1            2
    //                    \   or   /
    //                     2      1 
    @Test
    public void Test2() {
        ListNode head = ListNode.constructLinkedList(Arrays.asList(1, 2));
        TreeNode actual = solution.sortedListToBST(head);

        TreeNode e11 = new TreeNode(1);
        TreeNode e12 = new TreeNode(2);
        TreeNode.connect(e11, null, e12);
        TreeNode expected1 = e11;

        TreeNode e21 = new TreeNode(1);
        TreeNode e22 = new TreeNode(2);
        TreeNode.connect(e22, e21, null);
        TreeNode expected2 = e22;

        assertTrue(TreeNode.isSameTree(actual, expected2) || TreeNode.isSameTree(actual, expected1));
    }

    //   [1, 2, 3] ==>   1             3          2
    //                    \           /         /   \
    //                     2   or    2     or  1     3
    //                      \      /
    //                       3    1
    @Test
    public void Test3() {
        ListNode head = ListNode.constructLinkedList(Arrays.asList(1, 2, 3));
        TreeNode actual = solution.sortedListToBST(head);

        TreeNode e11 = new TreeNode(1);
        TreeNode e12 = new TreeNode(2);
        TreeNode e13 = new TreeNode(3);
        TreeNode.connect(e11, null, e12);
        TreeNode.connect(e12, null, e13);
        TreeNode expected1 = e11;

        TreeNode e21 = new TreeNode(1);
        TreeNode e22 = new TreeNode(2);
        TreeNode e23 = new TreeNode(3);
        TreeNode.connect(e23, e22, null);
        TreeNode.connect(e22, e21, null);
        TreeNode expected2 = e23;

        TreeNode e31 = new TreeNode(1);
        TreeNode e32 = new TreeNode(2);
        TreeNode e33 = new TreeNode(3);
        TreeNode.connect(e32, e31, e33);
        TreeNode expected3 = e32;

        assertTrue(TreeNode.isSameTree(actual, expected3) || TreeNode.isSameTree(actual, expected2) || TreeNode.isSameTree(actual, expected1));
    }

    //                    2 
    //                  /   \   
    // [1->2->3]  ==>  1     3  
    @Test
    public void Test4() {
        ListNode head = ListNode.constructLinkedList(Arrays.asList(1, 2, 3));

        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode.connect(t2, t1, t3);

        TreeNode expected = t2;
        TreeNode actual = solution.sortedListToBST(head);
        assertTrue(TreeNode.isSameTree(actual, expected));
    }

    //       4 
    //     /    \
    //    2      6 
    //   / \    / \
    //  1   3  5   7 
    @Test
    public void Test5() {
        ListNode head = ListNode.constructLinkedList(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        TreeNode actual = solution.sortedListToBST(head);
        TreeNode expected = TreeNode.getBST7();
        assertTrue(TreeNode.isSameTree(actual, expected));
    }

}
