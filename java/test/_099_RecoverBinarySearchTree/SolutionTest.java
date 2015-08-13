package _099_RecoverBinarySearchTree;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.TreeNode;

public class SolutionTest {

    /** Test method for {@link _099_RecoverBinarySearchTree.Solution } */
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

    //          5      5
    //         /      /
    //        2  =>  4
    //      /       /
    //     3       3
    //    /       /
    //   4   =>  2
    //  /       /
    // 1       1
    @Test
    public void Test1() {
        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(1);
        TreeNode.connect(t1, t2, null);
        TreeNode.connect(t2, t3, null);
        TreeNode.connect(t3, t4, null);
        TreeNode.connect(t4, t5, null);
        TreeNode root = t1;

        TreeNode e1 = new TreeNode(5);
        TreeNode e2 = new TreeNode(4);
        TreeNode e3 = new TreeNode(3);
        TreeNode e4 = new TreeNode(2);
        TreeNode e5 = new TreeNode(1);
        TreeNode.connect(e1, e2, null);
        TreeNode.connect(e2, e3, null);
        TreeNode.connect(e3, e4, null);
        TreeNode.connect(e4, e5, null);
        TreeNode expected = e1;

        solution.recoverTree(root);
        assertTrue(TreeNode.isSameTree(expected, root));
    }

}
