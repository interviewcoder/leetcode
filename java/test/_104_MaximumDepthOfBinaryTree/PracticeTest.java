package _104_MaximumDepthOfBinaryTree;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.leetcode.TreeNode;

public class PracticeTest {

    /** Test method for {@link _104_MaximumDepthOfBinaryTree.Practice } */
    Practice solution;

    @Before
    public void setUp() throws Exception {
        solution = new Practice();
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
        assertEquals("null root", 0, actual);
    }

    // 1
    @Test
    public void Test1() {
        TreeNode root = new TreeNode(1);
        int actual = solution.maxDepth(root);
        int expected = 1;
        assertEquals("null root", expected, actual);
    }

    //   1
    //  /
    // 2
    @Test
    public void Test2() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode.connect(root, node1, null);
        int actual = solution.maxDepth(root);
        int expected = 2;
        assertEquals("left node", expected, actual);
    }

    //    1
    //  /   \
    // 2     3
    @Test
    public void Test3() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode.connect(root, node1, node2);
        int actual = solution.maxDepth(root);
        int expected = 2;
        assertEquals("balanced tree", expected, actual);
    }

    //    1
    //  /   \
    // 2     3
    //  \
    //   4
    @Test
    public void Test4() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode.connect(node1, node2, node3);
        TreeNode.connect(node2, null, node4);
        int actual = solution.maxDepth(node1);
        int expected = 3;
        assertEquals("max in left", expected, actual);
    }

    //      1
    //    /   \
    //   2     3
    //        /
    //       4
    @Test
    public void Test5() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode.connect(node1, node2, node3);
        TreeNode.connect(node3, node4, null);
        int actual = solution.maxDepth(node1);
        int expected = 3;
        assertEquals("balanced tree", expected, actual);
    }

    //          5
    //         /
    //       4
    //      /
    //     3
    //    /
    //   2
    //  /
    // 1
    @Test
    public void Test6() {
        TreeNode rootNode = TreeNode.getTree6();
        assertEquals(5, solution.maxDepth(rootNode));
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
    public void Test7() {
        TreeNode rootNode = TreeNode.getTree7();
        assertEquals(5, solution.maxDepth(rootNode));
    }

    //  1
    //    \
    //      2
    //     /
    //    3
    @Test
    public void Test8() {
        TreeNode rootNode = TreeNode.getTree8();
        assertEquals(3, solution.maxDepth(rootNode));
    }

    //        5
    //      /   \
    //     4     8
    //         /  \
    //       13    4
    //            / \
    //           5   1
    @Test
    public void Test9() {
        TreeNode rootNode = TreeNode.getTree10();
        assertEquals(4, solution.maxDepth(rootNode));
    }
}

