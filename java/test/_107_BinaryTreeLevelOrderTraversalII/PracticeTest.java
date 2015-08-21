package _107_BinaryTreeLevelOrderTraversalII;

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

    /** Test method for {@link _107_BinaryTreeLevelOrderTraversalII.Practice } */
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
        List<List<Integer>> actual = solution.levelOrderBottom(root);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(15, 7));
        expected.add(Arrays.asList(9, 20));
        expected.add(Arrays.asList(3));
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(9);
        TreeNode t3 = new TreeNode(20);
        TreeNode t4 = new TreeNode(15);
        TreeNode.connect(t1, t2, t3);
        TreeNode.connect(t3, t4, null);
        TreeNode root = t1;
        List<List<Integer>> actual = solution.levelOrderBottom(root);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(15));
        expected.add(Arrays.asList(9, 20));
        expected.add(Arrays.asList(3));
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        TreeNode t1 = new TreeNode(3);
        TreeNode t3 = new TreeNode(20);
        TreeNode t4 = new TreeNode(15);
        TreeNode.connect(t1, null, t3);
        TreeNode.connect(t3, t4, null);
        TreeNode root = t1;
        List<List<Integer>> actual = solution.levelOrderBottom(root);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(15));
        expected.add(Arrays.asList(20));
        expected.add(Arrays.asList(3));
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        TreeNode root = null;
        List<List<Integer>> actual = solution.levelOrderBottom(root);
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, actual);
    }

}
