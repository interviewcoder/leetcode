package _101_SymmetricTree;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.TreeNode;

public class PracticeTest {

    /** Test method for {@link _101_SymmetricTree.Practice } */
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

    //     1
    @Test
    public void Test1() {
        TreeNode t1 = new TreeNode(1);
        assertTrue(solution.isSymmetric(t1));
    }

    //     1
    //   /   \
    //  2     2
    //   \   /
    //   4   4
    @Test
    public void Test3() {
        assertTrue(solution.isSymmetric(TreeNode.getTree14()));
    }

    //      1 
    //    /   \
    //   2     3
    @Test
    public void Test4() {
        assertTrue(!solution.isSymmetric(TreeNode.getTree3()));
    }

    //   1
    //    \
    //     3
    @Test
    public void Test5() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(3);
        TreeNode.connect(t1, null, t2);
        TreeNode root = t1;
        assertFalse(solution.isSymmetric(root));
    }

    //        1
    //      /   \
    //     3     3
    //    /     /
    //   4     4
    @Test
    public void Test6() {
        assertFalse(solution.isSymmetric(TreeNode.getTree15()));
    }

    //          1
    //        /   \
    //       2     2
    //      / \   / \
    //     8   4 4   8
    @Test
    public void Test7() {
        assertTrue(solution.isSymmetric(TreeNode.getTree16()));
    }

}
