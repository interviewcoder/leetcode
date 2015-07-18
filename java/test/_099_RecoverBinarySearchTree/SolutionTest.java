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
    public Timeout globalTimeout = new Timeout(50);

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
        TreeNode.connect(t1, null, t2);
        TreeNode.connect(t2, null, t3);
        TreeNode.connect(t3, null, t4);
        TreeNode.connect(t4, null, t5);
        TreeNode root = t1;
        solution.recoverTree(root);

        TreeNode e1 = new TreeNode(5);
        TreeNode e2 = new TreeNode(4);
        TreeNode e3 = new TreeNode(3);
        TreeNode e4 = new TreeNode(2);
        TreeNode e5 = new TreeNode(1);
        TreeNode.connect(e1, null, e2);
        TreeNode.connect(e2, null, e3);
        TreeNode.connect(e3, null, e4);
        TreeNode.connect(e4, null, e5);
        TreeNode expected = e1;
        assertTrue(TreeNode.isSameTree(root, expected));

    }

}
