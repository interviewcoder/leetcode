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

public class PracticeTest {
    
    /** Test method for {@link _102_BinaryTreeLevelOrderTraversal.Practice } */
    Practice solution;
    
    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new Practice();
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
        TreeNode root = TreeNode.getTree0();
        List<List<Integer>> actual = solution.levelOrder(root);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));
        assertEquals(expected, actual);
    }

    //   1 
    //    \
    //     2
    //      \
    //       3 
    @Test
    public void Test6() {
        TreeNode root = TreeNode.getTree1();
        List<List<Integer>> actual = solution.levelOrder(root);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(2));
        expected.add(Arrays.asList(3));
        assertEquals(expected, actual);
    }

    //        1 
    //       /   
    //      2
    //     / 
    //    3 
    @Test
    public void Test7() {
        TreeNode root = TreeNode.getTree2();
        List<List<Integer>> actual = solution.levelOrder(root);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(2));
        expected.add(Arrays.asList(3));
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
    public void Test8() {
        TreeNode root = TreeNode.getTree4();
        List<List<Integer>> actual = solution.levelOrder(root);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(5));
        expected.add(Arrays.asList(4, 8));
        expected.add(Arrays.asList(11, 13, 4));
        expected.add(Arrays.asList(7, 2, 5, 1));
        assertEquals(expected, actual);
    }

    //      8
    //        \     
    //         6  
    //      /     \
    //     3       7
    //    / \       \
    //   2   4      10
    @Test
    public void Test9() {
        TreeNode root = TreeNode.getTree13();
        List<List<Integer>> actual = solution.levelOrder(root);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(8));
        expected.add(Arrays.asList(6));
        expected.add(Arrays.asList(3, 7));
        expected.add(Arrays.asList(2, 4, 10));
        assertEquals(expected, actual);
    }

}
