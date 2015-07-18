package _094_BinaryTreeInorderTraversal;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.TreeNode;

public class SolutionTest {
    
    /** Test method for {@link _094_BinaryTreeInorderTraversal.Solution } */
    Solution solution;
    
    @Rule
    public Timeout globalTimeout = new Timeout(50);

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    //  1
    //    \
    //      2
    //     /
    //    3
    @Test
    public void Test1() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode.connect(n1, null, n2);
        TreeNode.connect(n2, n3, null);
        TreeNode root = n1;

        List<Integer> actual = solution.inorderTraversal(root);
        List<Integer> expected = Arrays.asList(1, 3, 2);
        assertEquals(expected, actual);
    }

    //       1
    //     /   \
    //    2     3
    //   / \   / \
    //  4  5  6   7
    @Test
    public void Test2() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode.connect(n1, n2, n3);
        TreeNode.connect(n2, n4, n5);
        TreeNode.connect(n3, n6, n7);
        TreeNode root = n1;

        List<Integer> actual = solution.inorderTraversal(root);
        List<Integer> expected = Arrays.asList(4, 2, 5, 1, 6, 3, 7);
        assertEquals(expected, actual);
    }

    // 1
    @Test
    public void Test3() {
        TreeNode n1 = new TreeNode(1);
        TreeNode.connect(n1, null, null);
        TreeNode root = n1;

        List<Integer> actual = solution.inorderTraversal(root);
        List<Integer> expected = Arrays.asList(1);
        assertEquals(expected, actual);
    }

    //      1
    //     /
    //    2
    //  /
    // 3
    @Test
    public void Test4() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode.connect(n1, n2, null);
        TreeNode.connect(n2, n3, null);
        TreeNode root = n1;

        List<Integer> actual = solution.inorderTraversal(root);
        List<Integer> expected = Arrays.asList(3, 2, 1);
        assertEquals(expected, actual);
    }

    // 1
    //  \
    //   2
    //    \
    //     3
    @Test
    public void Test5() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode.connect(n1, null, n2);
        TreeNode.connect(n2, null, n3);
        TreeNode root = n1;

        List<Integer> actual = solution.inorderTraversal(root);
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, actual);
    }

}