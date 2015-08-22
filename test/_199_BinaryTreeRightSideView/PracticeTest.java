package _199_BinaryTreeRightSideView;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.TreeNode;

public class PracticeTest {
    
    /** Test method for {@link _199_BinaryTreeRightSideView.Practice } */
    Practice solution;

    @Rule
    public Timeout globalTimeout = new Timeout(20);

    @Before
    public void setUp() throws Exception {
        solution = new Practice();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    // null
    @Test
    public void Test0() throws Exception {
        TreeNode root = null;
        List<Integer> actual = solution.rightSideView(root);
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, actual);
    }

    /**
     *      1       <--- 
     *    /   \ 
     *   2     3     <--- 
     *    \     \ 
     *     5     4     <--- 
     */     
    @Test
    public void Test1() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode.connect(t1, t2, t3);
        TreeNode.connect(t2, null, t5);
        TreeNode.connect(t3, null, t4);
        TreeNode root = t1;
        List<Integer> actual = solution.rightSideView(root);
        List<Integer> expected = Arrays.asList(1, 3, 4);
        assertEquals(expected, actual);
    }
    
    //   1 
    //    \
    //     2
    //      \
    //       3 
    @Test
    public void Test2() throws Exception {
        TreeNode root = TreeNode.getTree1();
        List<Integer> actual = solution.rightSideView(root);
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, actual);
    }

    //      1 
    //     /   
    //    2
    //   / 
    //  3 
    @Test
    public void Test3() throws Exception {
        TreeNode root = TreeNode.getTree2();
        List<Integer> actual = solution.rightSideView(root);
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, actual);
    }
    
    
    //      1 
    //    /   \
    //   2     3
    @Test
    public void Test4() throws Exception {
        TreeNode root = TreeNode.getTree3();
        List<Integer> actual = solution.rightSideView(root);
        List<Integer> expected = Arrays.asList(1, 3);
        assertEquals(expected, actual);
    }

    //        5
    //      /   \
    //     4     8
    //    /     /  \
    //   11    13   4
    //  /  \       / \
    // 7    2     5   1
    @Test
    public void Test5() throws Exception {
        TreeNode root = TreeNode.getTree4();
        List<Integer> actual = solution.rightSideView(root);
        List<Integer> expected = Arrays.asList(5, 8, 4, 1);
        assertEquals(expected, actual);
    }

    //      10
    //     /  \
    //    5   12
    //   / \
    //  4   7
    @Test
    public void Test6() throws Exception {
        TreeNode root = TreeNode.getTree5();
        List<Integer> actual = solution.rightSideView(root);
        List<Integer> expected = Arrays.asList(10, 12, 7);
        assertEquals(expected, actual);
    }


    //  1
    //    \
    //      2
    //     /
    //    3
    @Test
    public void Test7() throws Exception {
        TreeNode root = TreeNode.getTree8();
        List<Integer> actual = solution.rightSideView(root);
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, actual);
    }

    //        5
    //      /   \
    //     4     8
    //         /  \
    //       13    4
    //            / \
    //           5   1
    @Test
    public void Test8() throws Exception {
        TreeNode root = TreeNode.getTree10();
        List<Integer> actual = solution.rightSideView(root);
        List<Integer> expected = Arrays.asList(5, 8, 4, 1);
        assertEquals(expected, actual);
    }

}
