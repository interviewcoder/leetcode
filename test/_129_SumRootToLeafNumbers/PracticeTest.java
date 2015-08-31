package _129_SumRootToLeafNumbers;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.TreeNode;

public class PracticeTest {

    /** Test method for {@link _129_SumRootToLeafNumbers.Practice } */
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

    //    1
    //  /   \
    // 2     3
    @Test
    public void Test1() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode.connect(t1, t2, t3);
        TreeNode root = t1;
        int actual = solution.sumNumbers(root);
        int expected = 25;
        assertEquals(expected, actual);
    }

    //      1
    //     /
    //    2
    //   /
    //  3
    @Test
    public void Test2() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode.connect(t1, t2, null);
        TreeNode.connect(t2, t3, null);
        TreeNode root = t1;
        int actual = solution.sumNumbers(root);
        int expected = 123;
        assertEquals(expected, actual);
    }

    //  1 
    //   \ 
    //    2
    //     \ 
    //      3
    @Test
    public void Test3() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode.connect(t1, null, t2);
        TreeNode.connect(t2, null, t3);
        TreeNode root = t1;
        int actual = solution.sumNumbers(root);
        int expected = 123;
        assertEquals(expected, actual);
    }

    //        1 
    //     /     \ 
    //    2       7 
    //     \       \ 
    //      4       3
    //     / \   
    //    5   6   
    @Test
    public void Test4() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);
        TreeNode.connect(t1, t2, t7);
        TreeNode.connect(t2, null, t4);
        TreeNode.connect(t4, t5, t6);
        TreeNode.connect(t7, null, t3);
        TreeNode root = t1;
        int actual = solution.sumNumbers(root);
        int expected = 2664;
        assertEquals(expected, actual);
    }

    //    1
    @Test
    public void Test5() {
        TreeNode t1 = new TreeNode(1);
        TreeNode root = t1;
        int actual = solution.sumNumbers(root);
        int expected = 1;
        assertEquals(expected, actual);
    }


}
