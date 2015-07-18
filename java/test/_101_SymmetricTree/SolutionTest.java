package _101_SymmetricTree;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.TreeNode;

public class SolutionTest {

    /** Test method for {@link _101_SymmetricTree.Solution } */
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

    //     1
    @Test
    public void Test1() {
        TreeNode t1 = new TreeNode(1);
        TreeNode root = t1;
        boolean actual = solution.isSymmetric(root);
        assertEquals(true, actual);
    }

    //          1
    //        /   \
    //       2     2
    //        \   /
    //         4 4
    @Test
    public void Test3() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(2);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(4);
        TreeNode.connect(t1, t2, t3);
        TreeNode.connect(t2, null, t4);
        TreeNode.connect(t3, t5, null);
        TreeNode root = t1;
        boolean actual = solution.isSymmetric(root);
        assertEquals(true, actual);
    }

    //          1
    //         / \
    //        2   3
    @Test
    public void Test4() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode.connect(t1, t2, t3);
        TreeNode root = t1;
        boolean actual = solution.isSymmetric(root);
        assertEquals(false, actual);
    }

    //   1
    //    \
    //     3
    @Test
    public void Test5() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(3);
        TreeNode.connect(t1, null, t2);
        TreeNode root = t1;
        boolean actual = solution.isSymmetric(root);
        assertEquals(false, actual);
    }

    //        1
    //      /   \
    //     3     3
    //    /     /
    //   4     4
    @Test
    public void Test6() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(3);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(4);
        TreeNode.connect(t1, t2, t3);
        TreeNode.connect(t2, t4, null);
        TreeNode.connect(t3, t5, null);
        TreeNode root = t1;
        boolean actual = solution.isSymmetric(root);
        assertEquals(false, actual);
    }

}
