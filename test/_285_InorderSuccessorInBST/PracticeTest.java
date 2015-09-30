package _285_InorderSuccessorInBST;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.TreeNode;

public class PracticeTest {
    
    /** Test method for {@link _285_InorderSuccessorInBST.Practice } */
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

    //   1
    @Test
    public void Test1() {
        TreeNode root = TreeNode.getBST1();
        TreeNode node = root;
        TreeNode actual = solution.inorderSuccessor(root, node);
        TreeNode expected = null;
        assertEquals(expected, actual);
    }

    //  null 
    @Test
    public void Test2() {
        TreeNode root = null;
        TreeNode node = null;
        TreeNode actual = solution.inorderSuccessor(root, node);
        TreeNode expected = null;
        assertEquals(expected, actual);
    }

    //   1 
    //    \
    //     2
    //      \
    //       3 
    @Test
    public void Test3() {
        TreeNode root = TreeNode.getBST2();
        TreeNode node = null;
        TreeNode actual = solution.inorderSuccessor(root, node);
        TreeNode expected = null;
        assertEquals(expected, actual);
    }

    //   1  <- node
    //    \
    //     2
    //      \
    //       3 
    @Test
    public void Test4() {
        TreeNode root = TreeNode.getBST2();
        TreeNode node = root;
        TreeNode actual = solution.inorderSuccessor(root, node);
        TreeNode expected = root.right;
        assertEquals(expected, actual);
    }

    //      3 
    //     /   
    //    2  <- node
    //   / 
    //  1 
    @Test
    public void Test5() {
        TreeNode root = TreeNode.getBST3();
        TreeNode node = root.left;
        TreeNode actual = solution.inorderSuccessor(root, node);
        TreeNode expected = root;
        assertEquals(expected, actual);
    }

    //      10
    //     /  \
    //    5   12
    //   / \
    //  4   7 <-node
    @Test
    public void Test6() {
        TreeNode root = TreeNode.getBST5();
        TreeNode node = root.left.right;
        TreeNode actual = solution.inorderSuccessor(root, node);
        TreeNode expected = root;
        assertEquals(expected, actual);
    }

    //         8
    //      /     \
    //     6       18
    //   /   \     / \
    //  3     7   10  20
    //   \       node
    //     5
    //    /
    //    4
    @Test
    public void Test7() {
        TreeNode root = TreeNode.getBST6();
        TreeNode node = root.right.left;
        TreeNode actual = solution.inorderSuccessor(root, node);
        TreeNode expected = root.right;
        assertEquals(expected, actual);
    }

    //         8
    //      /     \
    //     6       18
    //   /   \     / \
    //  3     7   10  20
    //   \       node
    //     5
    //    /
    //    4 <- node
    @Test
    public void Test8() {
        TreeNode root = TreeNode.getBST6();
        TreeNode node = root.left.left.right.left;
        TreeNode actual = solution.inorderSuccessor(root, node);
        TreeNode expected = root.left.left.right;
        assertEquals(expected, actual);
    }

}
