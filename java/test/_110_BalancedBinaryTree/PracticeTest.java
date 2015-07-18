package _110_BalancedBinaryTree;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.TreeNode;

public class PracticeTest {

    /** Test method for {@link _110_BalancedBinaryTree.Practice } */
    Practice solution;
    
    @Rule
    public Timeout globalTimeout = new Timeout(50);

    @Before
    public void setUp() throws Exception {
        solution = new Practice();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    // 3
    // / \
    // 9 20
    // /
    // 15
    @Test
    public void Test1() {
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(9);
        TreeNode t3 = new TreeNode(20);
        TreeNode t4 = new TreeNode(15);
        TreeNode.connect(t1, t2, t3);
        TreeNode.connect(t3, t4, null);
        TreeNode root = t1;
        boolean actual = solution.isBalanced(root);
        assertEquals(true, actual);
    }

    // 3
    // /
    // 9
    // /
    // 15
    @Test
    public void Test2() {
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(9);
        TreeNode t4 = new TreeNode(15);
        TreeNode.connect(t1, t2, null);
        TreeNode.connect(t2, t4, null);
        TreeNode root = t1;
        boolean actual = solution.isBalanced(root);
        assertEquals(false, actual);
    }

    // 3
    // \
    // 9
    // \
    // 15
    @Test
    public void Test3() {
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(9);
        TreeNode t4 = new TreeNode(15);
        TreeNode.connect(t1, null, t2);
        TreeNode.connect(t2, null, t4);
        TreeNode root = t1;
        boolean actual = solution.isBalanced(root);
        assertEquals(false, actual);
    }

    // 3
    // / \
    // 9 15
    @Test
    public void Test4() {
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(9);
        TreeNode t4 = new TreeNode(15);
        TreeNode.connect(t1, t2, t4);
        TreeNode root = t1;
        boolean actual = solution.isBalanced(root);
        assertEquals(true, actual);
    }

    // 3
    @Test
    public void Test5() {
        TreeNode t1 = new TreeNode(3);
        TreeNode root = t1;
        boolean actual = solution.isBalanced(root);
        assertEquals(true, actual);
    }

}
