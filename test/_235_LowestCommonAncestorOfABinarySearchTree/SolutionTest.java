package _235_LowestCommonAncestorOfABinarySearchTree;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.TreeNode;

public class SolutionTest {
    
    /** Test method for {@link _235_LowestCommonAncestorOfABinarySearchTree.Solution } */
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

    //         6
    //      /     \
    //     2       8
    //    / \     / \
    //   0   4   7   9
    //      / \
    //     3   5
    @Test
    public void Test1() {
        TreeNode n6 = new TreeNode(6);
        TreeNode n2 = new TreeNode(2);
        TreeNode n8 = new TreeNode(8);
        TreeNode n0 = new TreeNode(0);
        TreeNode n4 = new TreeNode(4);
        TreeNode n7 = new TreeNode(7);
        TreeNode n9 = new TreeNode(9);
        TreeNode n3 = new TreeNode(3);
        TreeNode n5 = new TreeNode(5);
        TreeNode.connect(n6, n2, n8);
        TreeNode.connect(n2, n0, n4);
        TreeNode.connect(n8, n7, n9);
        TreeNode.connect(n4, n3, n5);
        TreeNode root = n6;
        TreeNode p = n2;
        TreeNode q = n4;
        TreeNode actual = solution.lowestCommonAncestor(root, p, q);
        TreeNode expected = n2;
        assertEquals(expected, actual);
    }

    //         6
    //      /     \
    //     2       8
    //    / \     / \
    //   0   4   7   9
    //      / \
    //     3   5
    @Test
    public void Test2() {
        TreeNode n6 = new TreeNode(6);
        TreeNode n2 = new TreeNode(2);
        TreeNode n8 = new TreeNode(8);
        TreeNode n0 = new TreeNode(0);
        TreeNode n4 = new TreeNode(4);
        TreeNode n7 = new TreeNode(7);
        TreeNode n9 = new TreeNode(9);
        TreeNode n3 = new TreeNode(3);
        TreeNode n5 = new TreeNode(5);
        TreeNode.connect(n6, n2, n8);
        TreeNode.connect(n2, n0, n4);
        TreeNode.connect(n8, n7, n9);
        TreeNode.connect(n4, n3, n5);
        TreeNode root = n6;
        TreeNode p = n2;
        TreeNode q = n8;
        TreeNode actual = solution.lowestCommonAncestor(root, p, q);
        TreeNode expected = n6;
        assertEquals(expected, actual);
    }

    //         6
    //      /     \
    //     2       8
    //    / \     / \
    //   0   4   7   9
    //      / \
    //     3   5
    @Test
    public void Test4() {
        TreeNode n6 = new TreeNode(6);
        TreeNode n2 = new TreeNode(2);
        TreeNode n8 = new TreeNode(8);
        TreeNode n0 = new TreeNode(0);
        TreeNode n4 = new TreeNode(4);
        TreeNode n7 = new TreeNode(7);
        TreeNode n9 = new TreeNode(9);
        TreeNode n3 = new TreeNode(3);
        TreeNode n5 = new TreeNode(5);
        TreeNode.connect(n6, n2, n8);
        TreeNode.connect(n2, n0, n4);
        TreeNode.connect(n8, n7, n9);
        TreeNode.connect(n4, n3, n5);
        TreeNode root = n6;
        TreeNode p = n4;
        TreeNode q = n9;
        TreeNode actual = solution.lowestCommonAncestor(root, p, q);
        TreeNode expected = n6;
        assertEquals(expected, actual);
    }

}
