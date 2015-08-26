package _110_BalancedBinaryTree;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.TreeNode;

public class SolutionTest {

    /** Test method for {@link _110_BalancedBinaryTree.SolutionNlgN } */
    SolutionNlgN solution;
    
    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new SolutionNlgN();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    //  null
    @Test
    public void Test0() {
        TreeNode root = null;
        boolean actual = solution.isBalanced(root);
        assertTrue(actual);
    }

    //  1
    @Test
    public void Test1() {
        TreeNode root = TreeNode.getTree0();
        boolean actual = solution.isBalanced(root);
        assertTrue(actual);
    }

    //   1 
    //    \
    //     2
    //      \
    //       3 
    @Test
    public void Test2() {
        TreeNode root = TreeNode.getTree1();
        boolean actual = solution.isBalanced(root);
        assertFalse(actual);
    }

    //      1 
    //    /   \
    //   2     3
    @Test
    public void Test3() {
        TreeNode root = TreeNode.getTree3();
        boolean actual = solution.isBalanced(root);
        assertTrue(actual);
    }

    //        5
    //      /   \
    //     4     8
    //    /     /  \
    //   11    13   4
    //  /  \       / \
    // 7    2     5   1
    @Test
    public void Test4() {
        TreeNode root = TreeNode.getTree4();
        boolean actual = solution.isBalanced(root);
        assertFalse(actual);
    }

    //      10
    //     /  \
    //    5   12
    //   / \
    //  4   7
    @Test
    public void Test5() {
        TreeNode root = TreeNode.getTree5();
        boolean actual = solution.isBalanced(root);
        assertTrue(actual);
    }

    //   5 
    //    \
    //     4 
    //      \
    //       3
    //        \
    //         2 
    //          \
    //           1 
    @Test
    public void Test6() {
        TreeNode root = TreeNode.getTree7();
        boolean actual = solution.isBalanced(root);
        assertFalse(actual);
    }
    
    //  1
    //    \
    //      2
    //     /
    //    3
    @Test
    public void Test7() {
        TreeNode root = TreeNode.getTree8();
        boolean actual = solution.isBalanced(root);
        assertFalse(actual);
    }
    
    //        5
    //      /   \
    //     4     8
    //         /  \
    //       13    4
    //            / \
    //           5   1
    @Test
    public void Test8() {
        TreeNode root = TreeNode.getTree10();
        boolean actual = solution.isBalanced(root);
        assertFalse(actual);
    }

    //         8
    //      /     \
    //     6       18
    //   /   \     / \
    //  3     7   10  20
    //   \
    //     5
    //    /
    //    4
    @Test
    public void Test9() {
        TreeNode root = TreeNode.getTree11();
        boolean actual = solution.isBalanced(root);
        assertFalse(actual);
    }

}
