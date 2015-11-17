package _100_SameTree;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.TreeNode;

public class SolutionTest {

    /** Test method for {@link _100_SameTree.Solution } */
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
    public void Test0() {
        TreeNode p = null;
        TreeNode q = null;
        assertTrue(solution.isSameTree(p, q));
    }

    // 1  1
    @Test
    public void Test1() {
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(1);
        assertTrue(solution.isSameTree(p, q));
    }

    // 1  2
    @Test
    public void Test2() {
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(2);
        assertFalse(solution.isSameTree(p, q));
    }

    // 1 null
    @Test
    public void Test3() {
        TreeNode p = new TreeNode(1);
        TreeNode q = null;
        assertFalse(solution.isSameTree(p, q));
    }

    // null 1
    @Test
    public void Test4() {
        TreeNode p = null;
        TreeNode q = new TreeNode(1);
        assertTrue(!solution.isSameTree(p, q));
    }

    //   1      1
    //  / \    / \
    // 2   3  2   3
    @Test
    public void Test5() {
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(1);
        TreeNode.connect(p, new TreeNode(2), new TreeNode(3));
        TreeNode.connect(q, new TreeNode(2), new TreeNode(3));
        assertTrue(solution.isSameTree(p, q));
    }

    //   1      1
    //  / \    / \
    // 4   3  2   5
    @Test
    public void Test6() {
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(1);
        TreeNode.connect(p, new TreeNode(4), new TreeNode(3));
        TreeNode.connect(q, new TreeNode(2), new TreeNode(5));
        assertTrue(!solution.isSameTree(p, q));
    }

    //   1       1
    //  / \     / \
    // 2   3   2   3
    //        / 
    //       4 
    @Test
    public void Test7() {
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(1);
        TreeNode.connect(p, new TreeNode(2), new TreeNode(3));
        TreeNode node2 = new TreeNode(2);
        TreeNode.connect(q, node2, new TreeNode(3));
        TreeNode.connect(node2, new TreeNode(4), null);
        assertTrue(!solution.isSameTree(p, q));
    }

}
