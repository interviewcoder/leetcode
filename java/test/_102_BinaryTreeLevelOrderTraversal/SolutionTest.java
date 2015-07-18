package _102_BinaryTreeLevelOrderTraversal;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.TreeNode;

public class SolutionTest {
    
    /** Test method for {@link _102_BinaryTreeLevelOrderTraversal.Solution } */
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

    //       3
    //     /   \
    //    9    20
    //   / \
    //  15  7
    @Test
    public void Test1() {
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(9);
        TreeNode t3 = new TreeNode(20);
        TreeNode t4 = new TreeNode(15);
        TreeNode t5 = new TreeNode(7);
        TreeNode.connect(t1, t2, t3);
        TreeNode.connect(t3, t4, t5);
        TreeNode root = t1;
        List<List<Integer>> actual = solution.levelOrder(root);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(3));
        expected.add(Arrays.asList(9, 20));
        expected.add(Arrays.asList(15, 7));
        assertEquals(expected, actual);
    }

    //       3
    //     /   \
    //    9     20
    //         /
    //        15
    @Test
    public void Test2() {
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(9);
        TreeNode t3 = new TreeNode(20);
        TreeNode t4 = new TreeNode(15);
        TreeNode.connect(t1, t2, t3);
        TreeNode.connect(t3, t4, null);
        TreeNode root = t1;
        List<List<Integer>> actual = solution.levelOrder(root);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(3));
        expected.add(Arrays.asList(9, 20));
        expected.add(Arrays.asList(15));
        assertEquals(expected, actual);
    }

    //       3
    //         \
    //          20
    //         /
    //        15
    @Test
    public void Test3() {
        TreeNode t1 = new TreeNode(3);
        TreeNode t3 = new TreeNode(20);
        TreeNode t4 = new TreeNode(15);
        TreeNode.connect(t1, null, t3);
        TreeNode.connect(t3, t4, null);
        TreeNode root = t1;
        List<List<Integer>> actual = solution.levelOrder(root);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(3));
        expected.add(Arrays.asList(20));
        expected.add(Arrays.asList(15));
        assertEquals(expected, actual);
    }

    // 
    @Test
    public void Test4() {
        TreeNode root = null;
        List<List<Integer>> actual = solution.levelOrder(root);
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, actual);
    }

    //     1 
    @Test
    public void Test5() {
        TreeNode t1 = new TreeNode(1);
        TreeNode root = t1;
        List<List<Integer>> actual = solution.levelOrder(root);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));
        assertEquals(expected, actual);
    }

    //       3
    //         \
    //          20
    //            \
    //             15
    @Test
    public void Test6() {
        TreeNode t1 = new TreeNode(3);
        TreeNode t3 = new TreeNode(20);
        TreeNode t4 = new TreeNode(15);
        TreeNode.connect(t1, null, t3);
        TreeNode.connect(t3, null, t4);
        TreeNode root = t1;
        List<List<Integer>> actual = solution.levelOrder(root);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(3));
        expected.add(Arrays.asList(20));
        expected.add(Arrays.asList(15));
        assertEquals(expected, actual);
    }

    //        1 
    //       /   
    //      2
    //     / 
    //    3 
    @Test
    public void Test7() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t3 = new TreeNode(2);
        TreeNode t4 = new TreeNode(3);
        TreeNode.connect(t1, t3, null);
        TreeNode.connect(t3, t4, null);
        TreeNode root = t1;
        List<List<Integer>> actual = solution.levelOrder(root);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(2));
        expected.add(Arrays.asList(3));
        assertEquals(expected, actual);
    }

}
