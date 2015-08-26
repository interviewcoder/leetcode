package _098_ValidateBinarySearchTree;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.TreeNode;

public class SolutionNotGoodest {
    
    /** Test method for {@link _098_ValidateBinarySearchTree.Solution } */
    SolutionNotGood solution;
    
    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new SolutionNotGood();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    //        10
    //      /    \
    //     5     15
    //   /   \
    //  6     20
    @Test
    public void Test1() {
        TreeNode t1 = new TreeNode(10);
        TreeNode t2 = new TreeNode(5);
        TreeNode t3 = new TreeNode(15);
        TreeNode t4 = new TreeNode(6);
        TreeNode t5 = new TreeNode(20);
        TreeNode.connect(t1, t2, t3);
        TreeNode.connect(t3, t4, t5);
        TreeNode root = t1;
        boolean actual = solution.isValidBST(root);
        assertEquals(false, actual);
    }

    //        15 
    //      /    \
    //     6      20 
    //   /   \
    //  5     10 
    @Test
    public void Test2() {
        TreeNode t1 = new TreeNode(15);
        TreeNode t2 = new TreeNode(6);
        TreeNode t3 = new TreeNode(20);
        TreeNode t4 = new TreeNode(5);
        TreeNode t5 = new TreeNode(10);
        TreeNode.connect(t1, t2, t3);
        TreeNode.connect(t2, t4, t5);
        TreeNode root = t1;
        boolean actual = solution.isValidBST(root);
        assertEquals(true, actual);
    }

    //        3 
    //       /   
    //      2
    //     / 
    //    1 
    @Test
    public void Test3() {
        TreeNode t1 = new TreeNode(3);
        TreeNode t3 = new TreeNode(2);
        TreeNode t4 = new TreeNode(1);
        TreeNode.connect(t1, t3, null);
        TreeNode.connect(t3, t4, null);
        TreeNode root = t1;
        boolean actual = solution.isValidBST(root);
        assertEquals(true, actual);
    }

    //    1 
    //     \
    //      2
    //        \
    //         3
    @Test
    public void Test4() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode.connect(t1, null, t2);
        TreeNode.connect(t2, null, t3);
        TreeNode root = t1;
        boolean actual = solution.isValidBST(root);
        assertEquals(true, actual);
    }

    //          3 
    //        /   
    //      2
    //       \
    //        4 
    @Test
    public void Test5() {
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(4);
        TreeNode.connect(t1, t2, null);
        TreeNode.connect(t2, null, t3);
        TreeNode root = t1;
        boolean actual = solution.isValidBST(root);
        assertEquals(false, actual);
    }

}
