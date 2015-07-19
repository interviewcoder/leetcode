package _124_BinaryTreeMaximumPathSum;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.TreeNode;

public class SolutionTest {
    
    /** Test method for {@link _124_BinaryTreeMaximumPathSum.Solution } */
    Solution solution;

    @Rule
    public Timeout globalTimeout = new Timeout(20);

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    //
    @Test
    public void Test0() {
        TreeNode root = null;
        int actual = solution.maxPathSum(root);
        int expected = 0;
        assertEquals(expected, actual);
    }

    //     1
    //   /   \
    //  2     3
    @Test
    public void Test1() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode.connect(t1, t2, t3);
        TreeNode root = t1;
        int actual = solution.maxPathSum(root);
        int expected = 6;
        assertEquals(expected, actual);
    }

    //      2 
    //    /   \
    //  -1     3
    @Test
    public void Test2() {
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(-1);
        TreeNode t3 = new TreeNode(3);
        TreeNode.connect(t1, t2, t3);
        TreeNode root = t1;
        int actual = solution.maxPathSum(root);
        int expected = 5;
        assertEquals(expected, actual);
    }

    //      -1 
    //     /   \
    //    2     3 
    //   / 
    // -8
    @Test
    public void Test3() {
        TreeNode t1 = new TreeNode(-1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(-8);
        TreeNode.connect(t1, t2, t3);
        TreeNode.connect(t2, t4, null);
        TreeNode root = t1;
        int actual = solution.maxPathSum(root);
        int expected = 4;
        assertEquals(expected, actual);
    }

    //    -1
    @Test
    public void Test4() {
        TreeNode t1 = new TreeNode(-1);
        TreeNode root = t1;
        int actual = solution.maxPathSum(root);
        int expected = -1;
        assertEquals(expected, actual);
    }

    //    -1
    //       \
    //        3
    @Test
    public void Test5() {
        TreeNode t1 = new TreeNode(-1);
        TreeNode t3 = new TreeNode(3);
        TreeNode.connect(t1, null, t3);
        TreeNode root = t1;
        int actual = solution.maxPathSum(root);
        int expected = 3;
        assertEquals(expected, actual);
    }

    //            -2
    //           /
    //         3
    //        /
    //      -1 
    //     /   
    //    2      
    //   / 
    // -8
    @Test
    public void Test6() {
        TreeNode t1 = new TreeNode(-2);
        TreeNode t2 = new TreeNode(3);
        TreeNode t3 = new TreeNode(-1);
        TreeNode t4 = new TreeNode(2);
        TreeNode t5 = new TreeNode(-8);
        TreeNode.connect(t1, t2, null);
        TreeNode.connect(t2, t3, null);
        TreeNode.connect(t3, t4, null);
        TreeNode.connect(t4, t5, null);
        TreeNode root = t1;
        int actual = solution.maxPathSum(root);
        int expected = 4;
        assertEquals(expected, actual);
    }

    //  1
    //   \
    //    2
    //     \
    //      -1
    //        \
    //         5
    //          \
    //           6
    //            \
    //             -2
    @Test
    public void Test7() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(-1);
        TreeNode t4 = new TreeNode(5);
        TreeNode t5 = new TreeNode(6);
        TreeNode t6 = new TreeNode(-2);
        TreeNode.connect(t1, null, t2);
        TreeNode.connect(t2, null, t3);
        TreeNode.connect(t3, null, t4);
        TreeNode.connect(t4, null, t5);
        TreeNode.connect(t5, null, t6);
        TreeNode root = t1;
        int actual = solution.maxPathSum(root);
        int expected = 13;
        assertEquals(expected, actual);
    }

    //               5
    //            /     \
    //           4       8
    //          /       / \
    //         11      13  4
    //        /  \  
    //       7    2
    //             \
    //              1
    @Test
    public void Test8() {
        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(8);
        TreeNode t4 = new TreeNode(11);
        TreeNode t5 = new TreeNode(13);
        TreeNode t6 = new TreeNode(4);
        TreeNode t7 = new TreeNode(7);
        TreeNode t8 = new TreeNode(2);
        TreeNode t9 = new TreeNode(1);
        TreeNode.connect(t1, t2, t3);
        TreeNode.connect(t2, t4, null);
        TreeNode.connect(t3, t5, t6);
        TreeNode.connect(t4, t7, t8);
        TreeNode.connect(t8, null, t9);
        TreeNode root = t1;
        int actual = solution.maxPathSum(root);
        int expected = 48;
        assertEquals(expected, actual);
    }

}
