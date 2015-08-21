package _105_ConstructBinaryTreeFromPreorderAndInorderTraversal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.TreeNode;

public class SolutionTest {
    
    /**
     * Test method for
     * {@link _105_ConstructBinaryTreeFromPreorderAndInorderTraversal.Solution }
     */
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

    //     1
    @Test
    public void Test1() {
        int[] preorder = {1};
        int[] inorder  = {1};
        TreeNode actual = solution.buildTree(preorder, inorder);
        
        TreeNode e1 = new TreeNode(1);
        TreeNode expected = e1;
        assertTrue(TreeNode.isSameTree(actual, expected));

    }

    //      1
    //     /
    //    2
    //   /
    //  3
    @Test
    public void Test2() {
        int[] preorder = {1, 2, 3};
        int[] inorder  = {3, 2, 1};
        TreeNode actual = solution.buildTree(preorder, inorder);
        
        TreeNode e1 = new TreeNode(1);
        TreeNode e2 = new TreeNode(2);
        TreeNode e3 = new TreeNode(3);
        TreeNode.connect(e1, e2, null);
        TreeNode.connect(e2, e3, null);
        TreeNode expected = e1;
        assertTrue(TreeNode.isSameTree(actual, expected));
    }

    //  1
    //   \ 
    //    2
    //     \ 
    //      3
    @Test
    public void Test3() {
        int[] preorder = {1, 2, 3};
        int[] inorder  = {1, 2, 3};
        TreeNode actual = solution.buildTree(preorder, inorder);
        
        TreeNode e1 = new TreeNode(1);
        TreeNode e2 = new TreeNode(2);
        TreeNode e3 = new TreeNode(3);
        TreeNode.connect(e1, null, e2);
        TreeNode.connect(e2, null, e3);
        TreeNode expected = e1;
        assertTrue(TreeNode.isSameTree(actual, expected));
    }

    //       1
    //     /  \ 
    //    2    3
    @Test
    public void Test4() {
        int[] preorder = {1, 2, 3};
        int[] inorder  = {2, 1, 3};
        TreeNode actual = solution.buildTree(preorder, inorder);
        
        TreeNode e1 = new TreeNode(1);
        TreeNode e2 = new TreeNode(2);
        TreeNode e3 = new TreeNode(3);
        TreeNode.connect(e1, e2, e3);
        TreeNode expected = e1;
        assertTrue(TreeNode.isSameTree(actual, expected));
    }

    //       1
    //     /   \ 
    //    2     3
    //     \   /
    //      4 5
    //     /   \
    //    6     7 
    //     \
    //      8
    @Test
    public void Test5() {
        int[] preorder = {1, 2, 4, 6, 8, 3, 5, 7};
        int[] inorder  = {2, 6, 8, 4, 1, 5, 7, 3};
        TreeNode actual = solution.buildTree(preorder, inorder);
        
        TreeNode e1 = new TreeNode(1);
        TreeNode e2 = new TreeNode(2);
        TreeNode e3 = new TreeNode(3);
        TreeNode e4 = new TreeNode(4);
        TreeNode e5 = new TreeNode(5);
        TreeNode e6 = new TreeNode(6);
        TreeNode e7 = new TreeNode(7);
        TreeNode e8 = new TreeNode(8);
        TreeNode.connect(e1, e2, e3);
        TreeNode.connect(e2, null, e4);
        TreeNode.connect(e4, e6, null);
        TreeNode.connect(e6, null, e8);
        TreeNode.connect(e3, e5, null);
        TreeNode.connect(e5, null, e7);
        TreeNode expected = e1;
        assertTrue(TreeNode.isSameTree(actual, expected));
    }

    //       1
    //     /   \ 
    //    2     3
    //   /     / \
    //  4     5   9 
    //   \     \
    //    6     7 
    //     \
    //      8
    @Test
    public void Test6() {
        int[] preorder = {1, 2, 4, 6, 8, 3, 5, 7, 9};
        int[] inorder  = {4, 6, 8, 2, 1, 5, 7, 3, 9};
        TreeNode actual = solution.buildTree(preorder, inorder);
        
        TreeNode e1 = new TreeNode(1);
        TreeNode e2 = new TreeNode(2);
        TreeNode e3 = new TreeNode(3);
        TreeNode e4 = new TreeNode(4);
        TreeNode e5 = new TreeNode(5);
        TreeNode e6 = new TreeNode(6);
        TreeNode e7 = new TreeNode(7);
        TreeNode e8 = new TreeNode(8);
        TreeNode e9 = new TreeNode(9);
        TreeNode.connect(e1, e2, e3);
        TreeNode.connect(e2, e4, null);
        TreeNode.connect(e3, e5, e9);
        TreeNode.connect(e4, null, e6);
        TreeNode.connect(e6, null, e8);
        TreeNode.connect(e5, null, e7);
        TreeNode expected = e1;
        assertTrue(TreeNode.isSameTree(actual, expected));
    }

    //      1 
    //       \  
    //        2  
    @Test
    public void Test7() {
        int[] preorder = {1, 2};
        int[] inorder  = {1, 2};
        TreeNode actual = solution.buildTree(preorder, inorder);
        
        TreeNode e1 = new TreeNode(1);
        TreeNode e2 = new TreeNode(2);
        TreeNode.connect(e1, null, e2);
        TreeNode expected = e1;
        assertTrue(TreeNode.isSameTree(actual, expected));
    }

}
