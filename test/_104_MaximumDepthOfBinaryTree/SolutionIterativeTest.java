package _104_MaximumDepthOfBinaryTree;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.TreeNode;

public class SolutionIterativeTest {

    /** Test method for {@link _104_MaximumDepthOfBinaryTree.SolutionIterative } */
    SolutionIterative solution;
    
    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new SolutionIterative();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    // null
    @Test
    public void Test0() {
        TreeNode rootNode = null;
        int actual = solution.maxDepth(rootNode);
        int expected = 0;
        assertEquals(expected, actual);
    }

    // 1
    @Test
    public void Test1() {
        TreeNode root = new TreeNode(1);
        int actual = solution.maxDepth(root);
        int expected = 1;
        assertEquals(expected, actual);
    }

    //   1 
    //    \
    //     2
    //      \
    //       3 
    @Test
    public void Test2() {
        TreeNode root = TreeNode.getTree1();
        int actual = solution.maxDepth(root);
        int expected = 3;
        assertEquals(expected, actual);
    }

    //      1 
    //     /   
    //    2
    //   / 
    //  3 
    @Test
    public void Test3() {
        TreeNode root = TreeNode.getTree2();
        int actual = solution.maxDepth(root);
        int expected = 3;
        assertEquals(expected, actual);
    }

    //      1 
    //    /   \
    //   2     3
    @Test
    public void Test4() {
        TreeNode root = TreeNode.getTree3();
        int actual = solution.maxDepth(root);
        int expected = 2;
        assertEquals(expected, actual);
    }

    //        5
    //      /   \
    //     4     8
    //    /     /  \
    //   11    13   4
    //  /  \       / \
    // 7    2     5   1
    @Test
    public void Test5() {
        TreeNode root = TreeNode.getTree4();
        int actual = solution.maxDepth(root);
        int expected = 4;
        assertEquals(expected, actual);
    }

    //      10
    //     /  \
    //    5   12
    //   / \
    //  4   7
    @Test
    public void Test6() {
        TreeNode root = TreeNode.getTree5();
        int actual = solution.maxDepth(root);
        int expected = 3;
        assertEquals(expected, actual);
    }

    //  1
    //    \
    //      2
    //     /
    //    3
    @Test
    public void Test7() {
        TreeNode root = TreeNode.getTree8();
        int actual = solution.maxDepth(root);
        int expected = 3;
        assertEquals(expected, actual);
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
        int actual = solution.maxDepth(root);
        int expected = 4;
        assertEquals(expected, actual);
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
        int actual = solution.maxDepth(root);
        int expected = 5;
        assertEquals(expected, actual);
    }

}

