package _145_BinaryTreePostorderTraversal;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.TreeNode;

public class PracticeTest {
    
    /** Test method for {@link _144_BinaryTreePreorderTraversal.Practice} */
    Practice solution;

    @Rule
    public Timeout globalTimeout = new Timeout(20);

    @Before
    public void setUp() throws Exception {
        solution = new Practice();
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

        List<Integer> actual = solution.postorderTraversal(root);
        List<Integer> expected = Arrays.asList(3, 2, 1);
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

        List<Integer> actual = solution.postorderTraversal(root);
        List<Integer> expected = Arrays.asList(4, 5, 2, 6, 7, 3, 1);
        assertEquals(expected, actual);
    }

    // 1
    @Test
    public void Test3() {
        TreeNode n1 = new TreeNode(1);
        TreeNode.connect(n1, null, null);
        TreeNode root = n1;

        List<Integer> actual = solution.postorderTraversal(root);
        List<Integer> expected = Arrays.asList(1);
        assertEquals(expected, actual);
    }

    //      1
    //     /
    //   2
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

        List<Integer> actual = solution.postorderTraversal(root);
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

        List<Integer> actual = solution.postorderTraversal(root);
        List<Integer> expected = Arrays.asList(3, 2, 1);
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
    public void Test6() {
        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(8);
        TreeNode t4 = new TreeNode(11);
        TreeNode t5 = new TreeNode(13);
        TreeNode t6 = new TreeNode(4);
        TreeNode t7 = new TreeNode(7);
        TreeNode t8 = new TreeNode(2);
        TreeNode t9 = new TreeNode(5);
        TreeNode t10 = new TreeNode(1);
        TreeNode.connect(t1, t2, t3);
        TreeNode.connect(t2, t4, null);
        TreeNode.connect(t3, t5, t6);
        TreeNode.connect(t4, t7, t8);
        TreeNode.connect(t6, t9, t10);
        TreeNode root = t1;

        List<Integer> actual = solution.postorderTraversal(root);
        List<Integer> expected = Arrays.asList(7, 2, 11, 4, 13, 5, 1, 4, 8, 5);
        assertEquals(expected, actual);
    }

    //      10
    //     /  \
    //    5   12
    //   / \
    //  4   7
    @Test
    public void Test7() {
        TreeNode t1 = new TreeNode(10);
        TreeNode t2 = new TreeNode(5);
        TreeNode t3 = new TreeNode(12);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(7);
        TreeNode.connect(t1, t2, t3);
        TreeNode.connect(t2, t4, t5);
        TreeNode root = t1;

        List<Integer> actual = solution.postorderTraversal(root);
        List<Integer> expected = Arrays.asList(4, 7, 5, 12, 10);
        assertEquals(expected, actual);
    }

}
