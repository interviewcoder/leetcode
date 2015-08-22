package _108_ConvertSortedArrayToBinarySearchTree;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.TreeNode;

public class PracticeTest {
    
    /**
     * Test method for
     * {@link _108_ConvertSortedArrayToBinarySearchTree.Practice }
     */
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

    //        3 
    //      /   \
    //     1     4 
    //      \      \
    //       2      5
    @Test
    public void Test1() {
        int[] nums = {1, 2, 3, 4, 5};
        TreeNode actual = solution.sortedArrayToBST(nums);
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode.connect(t3, t1, t4);
        TreeNode.connect(t1, null, t2);
        TreeNode.connect(t4, null, t5);
        TreeNode expected = t3;
        assertTrue(TreeNode.isSameTree(actual, expected));
    }

    //   [1]   ==>   1
    @Test
    public void Test2() {
        int[] nums = {1};
        TreeNode actual = solution.sortedArrayToBST(nums);
        TreeNode t1 = new TreeNode(1);
        TreeNode expected = t1;
        assertTrue(TreeNode.isSameTree(actual, expected));
    }

    //                      2 
    //                    /   \   
    //   [1,2,3,4]  ==>  1     3  
    //                          \
    //                           4
    @Test
    public void Test3() {
        int[] nums = {1, 2, 3, 4};
        TreeNode actual = solution.sortedArrayToBST(nums);
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode.connect(t2, t1, t3);
        TreeNode.connect(t3, null, t4);
        TreeNode expected = t2;
        assertTrue(TreeNode.isSameTree(actual, expected));
    }

}
