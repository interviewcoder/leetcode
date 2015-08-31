package _230_KthSmallestElementInABST;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.TreeNode;

public class SolutionTest {
    
    /** Test method for {@link _230_KthSmallestElementInABST.Solution } */
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

    @Test
    public void Test1() {
        TreeNode root = TreeNode.getTree0();
        int k = 1;
        int actual = solution.kthSmallest(root, k);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        TreeNode root = TreeNode.getTree1();
        int k = 1;
        int actual = solution.kthSmallest(root, k);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        TreeNode root = TreeNode.getTree1();
        int k = 2;
        int actual = solution.kthSmallest(root, k);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        TreeNode root = TreeNode.getTree1();
        int k = 3;
        int actual = solution.kthSmallest(root, k);
        int expected = 3;
        assertEquals(expected, actual);
    }

    //      10
    //     /  \
    //    5   12
    //   / \
    //  4   7
    @Test
    public void Test5() {
        TreeNode root = TreeNode.getTree5();
        int k = 1;
        int actual = solution.kthSmallest(root, k);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        TreeNode root = TreeNode.getTree5();
        int k = 5;
        int actual = solution.kthSmallest(root, k);
        int expected = 12;
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        TreeNode root = TreeNode.getTree5();
        int k = 3;
        int actual = solution.kthSmallest(root, k);
        int expected = 7;
        assertEquals(expected, actual);
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
    public void Test8() {
        TreeNode root = TreeNode.getTree6();
        int k = 1;
        int actual = solution.kthSmallest(root, k);
        int expected = 1;
        assertEquals(expected, actual);
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
    public void Test9() {
        TreeNode root = TreeNode.getTree6();
        int k = 5;
        int actual = solution.kthSmallest(root, k);
        int expected = 5;
        assertEquals(expected, actual);
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
    public void Test10() {
        TreeNode root = TreeNode.getTree6();
        int k = 3;
        int actual = solution.kthSmallest(root, k);
        int expected = 3;
        assertEquals(expected, actual);
    }

}
